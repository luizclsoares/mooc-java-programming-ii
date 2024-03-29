
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    protected int totalWeight() {
        int sum = 0;

        for (Item i : this.items) {
            sum += i.getWeight();
        }
        
        return sum;
    }

    @Override
    public void add(Item item) {
        if(totalWeight() + item.getWeight() <= this.capacity){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}
