package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String fechaEntrada;
	private String fechaSalida;
	private String valor;
	private String formaPago;
	
	@ManyToOne
	@JoinColumn(name = "huesped_id")
	private Huesped huesped;
	
	public Reserva() {
		
	}
	
	public Reserva(String fechaEntrada, String fechaSalida, String valor, String formaPago) {
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formaPago = formaPago;
	}
	public Reserva(Integer id, Object fechaEntrada, Object fechaSalida, Double valor, String formaPago) {
		this.id = id;
		this.fechaEntrada = fechaEntrada.toString();
		this.fechaSalida = fechaSalida.toString();
		this.valor = valor.toString();
		this.formaPago = formaPago;
	}

	public Reserva(Integer id) {
		this.id = id;
	}

	public Reserva(Huesped huesped) {
		this.huesped = huesped;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String fechaValor) {
		this.valor = fechaValor;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}
	
	
	
	
}
