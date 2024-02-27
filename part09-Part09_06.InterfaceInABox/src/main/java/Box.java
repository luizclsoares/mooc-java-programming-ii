
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
public class Box implements Packable{
    private ArrayList<Packable> list;
    private double maximumCapacity;

    public Box(double maximumCapacity) {
        this.list = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }
    
    protected double totalWeight(){
        double sum = 0;
        
        for(Packable packable : this.list){
            sum += packable.weight();
        }
        
        return sum;
    }
    
    public void add (Packable packable){
        if(totalWeight() + packable.weight() <= this.maximumCapacity){
            this.list.add(packable);
        }
    }
    
    @Override
    public double weight() {
        return this.totalWeight();
    }

    @Override
    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + this.totalWeight() + " kg";
    }
}
