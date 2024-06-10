package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_prod;
	private String nombre;
	private String descripcion;
	private int stock;
	private double precio;
	private String fecha_ingr;

	
	public producto() {}


	public producto(int id_prod, String nombre, String descripcion, int stock, double precio, String fecha_ingr) {

		this.id_prod = id_prod;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
		this.fecha_ingr = fecha_ingr;
	}


	public producto(String nombre, String descripcion, int stock, double precio, String fecha_ingr) {

		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
		this.fecha_ingr = fecha_ingr;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getFecha_ingr() {
		return fecha_ingr;
	}


	public void setFecha_ingr(String fecha_ingr) {
		this.fecha_ingr = fecha_ingr;
	}


	public int getId_prod() {
		return id_prod;
	}


	@Override
	public String toString() {
		return "producto [id_prod=" + id_prod + ", nombre=" + nombre + ", descripcion=" + descripcion + ", stock="
				+ stock + ", precio=" + precio + ", fecha_ingr=" + fecha_ingr + "]";
	}
	

}
