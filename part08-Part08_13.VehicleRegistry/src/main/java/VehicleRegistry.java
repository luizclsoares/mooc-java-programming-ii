
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
public class VehicleRegistry {
    private HashMap<LicensePlate,String> hashmap;

    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.hashmap.containsKey(licensePlate)){
            return false;
        }
        
        this.hashmap.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return this.hashmap.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(this.hashmap.containsKey(licensePlate)){
            this.hashmap.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate licensePlate : this.hashmap.keySet()){
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        
        for(String owner : this.hashmap.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        
        for(String owner : owners){
            System.out.println(owner);
        }
    }
}
