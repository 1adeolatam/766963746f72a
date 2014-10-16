/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

/**
 *
 * @author 1adeolatam
 */
public abstract  class Lock {
    
    public static int SERIAL_NUMBER = 0;
    public String LOCK_MANUFACTURER;
    
    public  int MIN_COMBO_VALUE;
    public  int MAX_COMBO_VALUE;
    public  int NUMBER_OF_DIGITS;
    protected boolean open;
      public  int getcombocount = 0;
    
   public int serialNumber;
       
 
public boolean isOpen(){
    return this.open;
}


   public void lock() {
        this.open = false;
        
    }
  public abstract void unlock();
   
    @Override
    public String toString() {
        return "Lock Type" + this.LOCK_MANUFACTURER +  "\n SerialNumber : " + this.serialNumber;
    }

    
   public abstract String getCombo();
    
    
    
    
    
    
    
    
    

}
