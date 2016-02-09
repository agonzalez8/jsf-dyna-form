package com.totox.bean;

import java.io.Serializable;


public class DataValue implements Serializable {
	
	private String tipo;
	private String converter;
	private Object value;
	private String label;

	public DataValue(String tipo, String converter, Object value, String label){
		this.tipo = tipo;
		this.converter = converter;
		this.value = value;
		this.label = label;
	}

	@Override
	public String toString(){
		return "tipo: "+tipo+", converter: "+converter+
			   " value: "+value;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setConverter(String converter){
		this.converter = converter;
	}
	
	public String getConverter(){
		return converter;
	}
	
	public void setValue(Object value){
		this.value = value;
	}
	
	public Object getValue(){
		return value;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	
	public String getLabel(){
		return label;
	}
	

}