package com.evergent.coreJAVA.Collections.arrays;

import java.util.Arrays;
import java.util.List;

public class EvergentTopicsImpl {
	
	public static void main(String[] args) {
		
	 
	List topics=Arrays.asList(new EvergentTopics("Encapsulation :","Inheritance :"," : OOPS"),
            new EvergentTopics("Checked Exception :","UnChecked Exception :"," ExceptonsHandling"),
            new EvergentTopics("SET","LIST","Collection"));
	
	System.out.println(topics);
	
	  List mydata=Arrays.asList(10,20,30);
	  System.out.println(mydata);
	  
	}
}