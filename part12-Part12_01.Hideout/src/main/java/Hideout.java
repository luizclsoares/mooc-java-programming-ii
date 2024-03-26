
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class Hideout<T> {
    private List<T> item;

    public Hideout() {
        this.item = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if(this.item.isEmpty()){
            this.item.add(toHide);
        }
        
        this.item.remove(0);
        this.item.add(toHide);
    }
    
    public T takeFromHideout(){
        if(this.item.isEmpty()){
            return null;
        }
        
        T item = this.item.get(0);
        
        this.item.remove(item);
        
        return item;
    }
    
    public boolean isInHideout(){
        return !this.item.isEmpty();
    }
}
