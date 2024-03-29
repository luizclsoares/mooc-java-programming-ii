
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
public class Pipe<T> {
    private List<T> list;

    public Pipe() {
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.list.add(value);
    }
    
    public T takeFromPipe(){
        if(list.isEmpty()){
            return null;
        }
        
        T item = list.get(0);
        
        list.remove(item);
        
        return item;
    }
    
    public boolean isInPipe(){
        return !this.list.isEmpty();
    }
}
