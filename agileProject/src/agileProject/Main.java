package agileProject;

public class Main {
	
	
	//ID 1 
	
	 public static Commande id1()
	 {
		 
		 Commande commande=new Commande();
		
		 
		 Item item1=new Item("café 1",2,100);
		 Item item2=new Item("café 2",3,100);
		 
		 commande.addItems(item1);
		 commande.addItems(item2);
		 
		return commande;
	 }
	
	// ID 2
	
	 public static void id2()
	 {
      System.out.println("Liste des articles");
		 
		 Commande commande=new Commande();
		
		 
		 Item item1=new Item("café 1",2,1000);
		 Item item2=new Item("café 2",3,100);
//		 Item item3=new Item("café 2",4,100);
		 commande.addItems(item1);
		 commande.addItems(item2);
//		 commande.addItems(item3);
		 
		 for(Item item:commande.getItems())
			 System.out.println(item);
		 
		
		 
		commande.inittaux();
		System.out.println("% Reduction : "+ commande.getReduction());
		System.out.println("Prix APrès Reduction : "+ commande.applyReduction());
		 
		System.out.println("Prix total "+commande.getPrixTotaleSansTaxes());
	 }
	 
	  
	 public static void main(String[] args) {
		 
		   System.out.println("Hello world");
		 
		  id2();
		
		 
		
	}

}
