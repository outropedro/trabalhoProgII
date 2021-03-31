
public class Item{
    
    private String itemName;
	private String itemDescription;
	private int itemWeight;
	private boolean itemCanTake; //itens que podem serem pegos

	
	public Item(String itemName, String itemDescription, int itemWeight){
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemWeight = itemWeight;
		this.itemCanTake = true;
		// atribuir valor se pode
	}

	//create itens
    // public void createItem(){
	// 	Item book, desk, computer, keys, trees, rock, ax;
	// 	book = new Item();
	
	
    // }

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

	public int getItemWeight() {
		return this.itemWeight;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

	//TODO fazer setagem do item
	public void setItem(String itemName, String itemWeight){
		// itens.put(itemName, itemWeight);
	}



    





}