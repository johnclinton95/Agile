package org.agileProject.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agileProject.Commande;
import agileProject.Item;

class CommandeTest {

	@Test
	void test() {
	
		 
		 Commande commande=new Commande();
		
		 
		 Item item1=new Item("café 1",2,100);
		 Item item2=new Item("café 2",3,100);
		 
		 commande.addItems(item1);
		 commande.addItems(item2);
		 
		 assertEquals(500.0, commande.getPrixTotaleSansTaxes());
		 
	}

}
