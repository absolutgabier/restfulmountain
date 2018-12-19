package be.intecbrussel.restmountain.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import be.intebrussel.restmountain.model.Mountain;
import be.intecbrussel.restmountain.repositories.MountainRepo;

@RestController
public class MountainController {
	//private static final String template = "Mountain name: %s/nHeight: %d/n";
	@Autowired
	MountainRepo repo;
	
	/*@RequestMapping(value="/mountains",  method = RequestMethod.GET )
	public Collection<Mountain> mountain(@RequestParam(value="name")String name, @RequestParam(value="height")Double height) {
		
		Collection<Mountain> mountains = new ArrayList<>();
		
		mountains = repo.initMountainsList();

		return mountains;
	}*/
	
	@RequestMapping(value="/mountains")
	public Collection<Mountain> mountains() {
		return repo.initMountainsList();
	}
	
	/*@RequestMapping(value="/mountains/{id}", method = RequestMethod.GET)
	public Collection<Mountain> displayMountainsById(@PathVariable("id") long id) {
		return repo.
	}*/
	
	
}
