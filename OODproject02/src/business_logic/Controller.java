/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic;

/**
 *
 * @author Kris
 */
public class Controller {


    private static Controller singleton;

    public static Controller Instance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
    public static Controller instance() {
        if (singleton == null) {
            singleton = new Controller(0);
        }
        return singleton;
    }
    
    
    protected Controller() throws Exception {
        if(getClass().getName().equals("Controller")) {
            throw new Exception();
        }
    }
    
    private Controller(int i) {
      //  System.out.println("controller set");     
    }
}
