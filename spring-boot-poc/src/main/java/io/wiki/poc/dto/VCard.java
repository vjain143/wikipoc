package io.wiki.poc.dto;

public class VCard 
{
	private String number;
	private String validity;
	private String type;
	
	public VCard()
	{
	}
	
	public VCard(String number, String validity, String type)
	{
		this.number = number;
		this.validity = validity;
		this.type = type;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
