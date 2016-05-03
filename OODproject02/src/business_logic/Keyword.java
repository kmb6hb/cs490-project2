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
public class Keyword implements Searchable<String>, Matchable<String>, Presentation {

    
    public enum Keywords { SUSPENSEFUL, BREATHTAKING, HEARTBREAKING };
    
    private Keywords key;
    
    private String ID;
    
    /**
     *
     * @param key
     */
    public Keyword(Keywords key) {
        this.key = key;
    }
    
    public Keywords getKeywords() {
        return this.key;
    }
    
    @Override
    public String getID() {
        return this.ID;
    }
    
    @Override
    public boolean contains(String data) {
        return this.ID.contains(data) ||
                this.key.toString().toLowerCase().contains(data);
    }

    @Override
    public String[] info() {
       return new String[]{ this.ID, this.key.toString()};
    }

    @Override
    public boolean matches(String other) {
       return this.ID.equals(other);
    }
}
