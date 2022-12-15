package agileProject;

public class Main {
	
	
	// ID 2
	
	 public static void id2()
	 {
      System.out.println("Liste des articles");
		 
		 Commande commande=new Commande();
		
		 
		 Item item1=new Item("café 1",2,100);
		 Item item2=new Item("café 2",3,100);
		 
		 commande.addItems(item1);
		 commande.addItems(item2);
		 
		 for(Item item:commande.getItems())
			 System.out.println(item);
		 
		 
		System.out.println("Prix total "+commande.getPrixTotaleSansTaxes());
	 }
	  
	 public static void main(String[] args) {
		 
		   System.out.println("Hello world");
		  id2();
		
		 
		
	}

}
