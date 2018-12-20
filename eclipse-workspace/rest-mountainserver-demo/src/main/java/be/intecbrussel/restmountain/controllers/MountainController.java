package be.intecbrussel.restmountain.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.intecbrussel.restmountain.model.Mountain;
import be.intecbrussel.restmountain.repositories.MountainRepo;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

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
	public List<Mountain> mountains() {
		return repo.mountains;
	}
	
	@RequestMapping(value="/mountains/{id}")
	public Mountain mountain(@PathVariable("id") int id) {
        for (Mountain m : repo.mountains){
            if(m.getId()==id){
                return m;
            }
        }
        return null;
	}
	
	
}
