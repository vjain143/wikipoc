package io.wiki.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.wiki.poc.dto.VCard;
import io.wiki.poc.service.VCardService;

@RestController
public class VCardControlller 
{
	
	@Autowired
	private VCardService vCardService;
	
	@RequestMapping(method=RequestMethod.GET, value="/vcards")
	public List<VCard> getAllVCards()
	{
		return vCardService.getAllVCards();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/vcards")
	public void addCards(@RequestBody VCard vCard )
	{
		vCardService.addVCards(vCard);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/vcards/{id}")
	public VCard getCards(@PathVariable String id)
	{
		return vCardService.getVCards(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/vcards/{id}")
	public void deleteCards(@PathVariable String id)
	{
		vCardService.deleteVCards(id);
	}
	
}
