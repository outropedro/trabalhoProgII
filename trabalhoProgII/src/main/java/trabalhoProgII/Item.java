import java.lang.String;
import java.util.HashMap;

public class Item{
    
    private String itemName;
	private String itemDescription;
	private double itemWeight;
	private boolean itemCanTake; //itens que podem serem pegos

	private HashMap<String,Item> itens;         // armazena os itens das das salas


	
	public Item(String itemName, String itemDescription, double itemWeight, boolean itemCanTake){
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemWeight = itemWeight;
		this.itemCanTake = true;
		itens = new HashMap<String, Item>();	
	}

	/**
     * adiciona intens das salas
     * @param nameItem nome do item
     * @param itemObject item referecnaciado
     */
    public void addItem(String nameItem, Item itemObject)
    {
        itens.put(nameItem, itemObject);// olhar pq ta dando erro
		
    }

	public boolean itemCanTake(){
		return this.itemCanTake();
	}
	
	public void setItemCanTake(boolean itemCanTake){
		this.itemCanTake = itemCanTake();
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getItemWeight() {
		return this.itemWeight;
	}

	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}

	//TODO fazer setagem do item
	public void setItem(String itemName, double itemWeight){
		// itens.put(itemName, itemWeight);
	}



    





}