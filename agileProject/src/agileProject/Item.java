package agileProject;

public class Item {

	
	private String nom;
	private int quantite;
	private float prix;

	public Item(String nom, int unite, float prix){
	    this.nom= nom;
	    this.quantite = unite;
	    this.prix = prix;
	}

	public String getNom(){
	    return this.nom;
	}

	public int getUnite(){
	    return this.quantite;
	}
	

	public float getPrix(){
	    return this.prix;
	}

	public float getPrixTotal(){
	    return this.getPrix() * this.getUnite();
	}
	public String toString(){
	    return " "+getNom()+" "+getUnite()+" "+getPrix();
	}
	
	


}
