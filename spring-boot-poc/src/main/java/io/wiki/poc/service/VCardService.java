package io.wiki.poc.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.wiki.poc.dto.VCard;

@Service
public class VCardService 
{
	private List<VCard> vcards = new ArrayList<VCard>(Arrays.asList(new VCard("12345", "26/04", "RED"),new VCard("45678", "16/05", "BLUE"),new VCard("78901", "06/03", "GREEN") ));
	
	public List<VCard> getAllVCards()
	{
		return this.vcards;
	}
	
	public VCard getVCards(String id)
	{
		return vcards.stream().filter(t -> t.getNumber().equals(id)).findFirst().get();
	}
	
	public void addVCards(VCard vCard)
	{
		vcards.add(vCard);
	}
	
	public void deleteVCards(String id)
	{
		VCard vcardtoRemove = vcards.stream().filter(t -> t.getNumber().equals(id)).findFirst().get();
		vcards.remove(vcardtoRemove);
	}
	

}
