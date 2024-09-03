package com.evergent.coreJAVA.Collections.arrays;
import java.io.Serializable;

public class EvergentTopics  {

	private String name;
	private String description;
	private String id;
	public EvergentTopics(String name, String description, String id) {

		this.name = name;
		this.description = description;
		this.id = id;
	}
	
	@Override
	public String toString() {

		return name + description + id;
	} 

}