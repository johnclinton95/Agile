package agileProject;

import java.util.ArrayList;
import java.util.List;

public class Commande {

	private List<Item> items = new ArrayList<>();
	private float prixTotaleSansTaxes=null;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItems(Item item) {
		this.items.add(item);
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