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
public class LockClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            MasterULock MustardLock = new MasterULock (2, 3, 7, 4);
        
        
        MustardLock.unlock(2,3, 7, 4);
        MustardLock.lock();
        MustardLock.unlock(64, 3, 5, 2);
        System.out.println(MustardLock.toString());
        System.out.println(MustardLock.getCombo());
        System.out.println(MustardLock.getCombo());
  
        MasterULock Ml = new MasterULock();
        System.out.println(Ml.toString());
        
    }
    
}
