public class Item{

private String nom;
private int unite;
private float prix;

public Item(String nom, int unite, float prix){
 this.nom= nom;
 this.unite = unite;
 this.prix = prix;
}

public String getNom(){
    return this.nom;
}

public int getUnite(){
    return this.unite;
}

public float getPrix(){
    return this.prix;
}

}