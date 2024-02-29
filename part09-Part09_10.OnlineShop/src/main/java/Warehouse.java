
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luiz
 */
public class Warehouse {

    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        return this.productPrice.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.productStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if(this.productStock.get(product) == null){
            return false;
        }
        
        if(this.productStock.get(product) > 0){
            this.productStock.put(product, this.productStock.get(product) - 1);
            
            return true;
        }
        
        return false;
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<>();
        
        for(String product : this.productPrice.keySet()){
            products.add(product);
        }
        
        return products;
    }
}
