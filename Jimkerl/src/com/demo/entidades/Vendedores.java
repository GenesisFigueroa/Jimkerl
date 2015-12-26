package com.demo.entidades;

public class Vendedores {

	private String codigo;
	private String cedula;
	private String nombre;
	private int ventas;

	public Vendedores(){
		
	}

	public Vendedores(String codigo, String cedula, String nombre, int ventas) {
		super();
		this.codigo = codigo;
		this.cedula = cedula;
		this.nombre = nombre;
		this.ventas = ventas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public String toString() {
		return "Cliente [codigo=" + codigo + ", cedula=" + cedula
				+ ", nombre=" + nombre + ", ventas=" + ventas + "]";
	}
}
