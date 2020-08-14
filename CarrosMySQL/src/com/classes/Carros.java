package com.classes;

import com.dao.CarrosDao;

public class Carros extends CarrosDao {

	private int id;
	private String modelo;
	private String marca;

	public Carros() {
		super();
	}
	/**
	 * Cria um objeto passando um id
	 * 
	 * @param id
	 */
	
	public Carros(int id) {
		Carros car = super.selectCarro(id);
		this.id = id;
		this.modelo = car.getModelo();
		this.marca = car.getMarca();
	}
	
	public Carros(int id, String moledo, String marca) {
		super();
		this.id = id;
		this.modelo = moledo;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carros [id=" + id + ", modelo=" + modelo + ", marca=" + marca + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int inserirCarro() {

		return super.inserirCarro(this);
	}

	public int updateCarro() {
		
		return super.updateCarro(this);
	}
}
