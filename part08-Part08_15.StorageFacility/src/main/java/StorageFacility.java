
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class StorageFacility {
    private HashMap<String,ArrayList<String>> hashmap;

    public StorageFacility() {
        this.hashmap = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.hashmap.putIfAbsent(unit, new ArrayList<>());
    
        this.hashmap.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.hashmap.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        if(this.hashmap.get(storageUnit).isEmpty()){
            this.hashmap.remove(storageUnit);
        }
        
        this.hashmap.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        
        for(String string : hashmap.keySet()){
            if(!this.hashmap.get(string).isEmpty()){
                list.add(string);
            }
        }
        
        return list;
    }
}
