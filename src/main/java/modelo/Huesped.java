package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "huespedes")
public class Huesped {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String nacionalidad;
	private String telefono;
	private Integer nReserva;
	
	@OneToMany(mappedBy = "huesped")
	private List<Reserva> reserva;
	
	public Huesped() {
		
	}
	
	public Huesped(String nombre, String apellido, String fechaNacimiento, String nacionalidad, String telefono, Integer nReserva) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono; 
		this.nReserva = nReserva;
	}
	
	public Huesped(Integer id, String nombre, String apellido, Object fechaNacimiento, String nacionalidad,
			String telefono, Integer nReserva) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento.toString();
		this.nacionalidad = nacionalidad;
		this.telefono = telefono; 
		this.nReserva = nReserva;
	}

	public Huesped(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Integer getnReserva() {
		return nReserva;
	}
	public void setnReserva(Integer nReserva) {
		this.nReserva = nReserva;
	}
	
	
	
}
