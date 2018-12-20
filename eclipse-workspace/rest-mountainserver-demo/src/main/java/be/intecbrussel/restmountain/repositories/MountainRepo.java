package be.intecbrussel.restmountain.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import be.intecbrussel.restmountain.model.Mountain;

@Repository
public class MountainRepo {

	public List<Mountain> mountains = new ArrayList<>();
	Mountain berg1 = new Mountain(1,"Montblanc",4818);
	Mountain berg2 = new Mountain(2,"Matterhorn",2818);
	Mountain berg3 = new Mountain(3,"Kilomandarin",818);
	Mountain berg4 = new Mountain(4,"Fujitzitamagotchi",9818);
	
	@PostConstruct
	public void init() {
		initMountainsList();
		System.out.println("MountainRepo ready to show.");
	}


	
	public List<Mountain> initMountainsList(){
		mountains.add(berg1);
		mountains.add(berg2);
		mountains.add(berg3);
		mountains.add(berg4);
//		((ArrayList<Mountain>) mountains).sort(Comparator.comparing(Mountain::getHeight));
		return mountains;
	}
}