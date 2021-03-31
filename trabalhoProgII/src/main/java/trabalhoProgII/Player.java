import java.util.ArrayList;
public class Player {

    private Room currentRoom;
    private int weightLimit; // TODO ver se peso será dado por gramas, quilos ou alguma outra medida para determinar limite
    private ArrayList<Item> bagItens = new ArrayList();//TODO 10 deveria ser a qtd de itens na bag; olhar com Aluisio se tem como fazer com ArrayList mesmo ou tem uma maneira fais simples de lidar com esse objeeto,
    // usar hashmap para fazer a bag
    Item item;
	    public Player()
    {
        //nothing to do here
    }

    public void setCurrentRoom(Room currentRoom)
    {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom()    
    {
        return currentRoom;
    }

    public int getWeightLimit() {
		return this.weightLimit;
	}

	public void setWeightLimit(int weightLimit) {
		this.weightLimit = weightLimit;
	}

	public ArrayList<Item> getBagItens() {
		return this.bagItens;
	}

	public void setBagItens(ArrayList<Item> bagItens) {
		this.bagItens = bagItens;
	}

    public void addBagItens(int index){
        //TODO implementar função    
    }
    public void removeItens(int index){
        
    }


}