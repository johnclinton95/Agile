package agileProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commande {

	private List<Item> items = new ArrayList<>();
	private float prixTotaleSansTaxes=0f;
	
	private Map<String,Double> tva=new HashMap<>();
	private double discount=this.getReduction();
	private double ttva;
	

	
	
	
	public double getDiscount() {
		return discount;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void inittaux()
	{
		tva.put("Fr", 0.2);
		tva.put("Gn", 0.1);
		tva.put("Ma", 0.3);
	}

	
	public double TTC(String codeEtat)
	{
		return this.applyReduction()*tva.get(codeEtat).doubleValue();
	}
	
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public double getReduction()
	{
		 float res=getPrixTotaleSansTaxes();
		 if(res>1000)
			    return 0.03;
		 else if(res>5000)
			    return 0.05;
		 else if(res>7000)
			    return 0.07;
		 else if(res>10000)
			    return 0.10;
		 else if(res>50000)
			    return 0.15;
		 else 
			  return 1.0;
		 
	}

	public void addItems(Item item) {
		this.items.add(item);
	}
	
	
	public double applyReduction()
	{
		return (1-this.getReduction()) * this.getPrixTotaleSansTaxes();
	}
	

	public float getPrixTotaleSansTaxes() {

		for (Item item : items) {
			prixTotaleSansTaxes += item.getPrixTotal();
		}
		return prixTotaleSansTaxes;
	}

	public void setPrixTotaleSansTaxes(Float prixTotaleSansTaxes) {
		this.prixTotaleSansTaxes = prixTotaleSansTaxes;
	}
}