
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
public class Pipe<T> {
    private List<T> list;
    
    public Pipe(){
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.list.add(value);
    }
    
    public T takeFromPipe(){
        if(this.list.isEmpty()){
            return null;
        }
        T value = this.list.get(0);
        this.list.remove(0);
        return value;
    }
    
    public boolean isInPipe(){
        if(this.list.isEmpty()){
            return false;
        }
        return true;
    }
    
}
