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
public class Actor implements Searchable<String>, Matchable<String>, Presentation {

    
    public enum Gender { MALE, FEMALE };
    
    private String name;
    private Gender gender;
    
    private String ID;
    
    /**
     *
     * @param name
     * @param gender
     */
    public Actor(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    @Override
    public String getID() {
        return this.ID;
    }
        
    @Override
    public boolean contains(String data) {
        return this.ID.contains(data) ||
               this.gender.toString().toLowerCase().contains(data) ||
               this.name.toLowerCase().contains(data);
    }

    @Override
    public String[] info() {
       return new String[]{ this.ID, this.name, this.gender.toString()};
    }

    @Override
    public boolean matches(String other) {
        return this.ID.equals(other);
    }
}
