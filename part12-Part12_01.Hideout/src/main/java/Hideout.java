/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
public class Hideout<T> {
    private T toHide;
    
    public void putIntoHideout(T toHide){
        this.toHide = toHide;
        
    }
    
    public T takeFromHideout(){
        if(this.toHide == null){
            return null;
        }
        T taken = this.toHide;
        this.toHide = null;
        return taken;
        
    }
    
    public boolean isInHideout(){
        return (this.toHide == null);
    }
    
}
