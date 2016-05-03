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
public class Customer implements Searchable<String>, Matchable<String>, Presentation {
    
    private String name;
    private String password;
    private String email;
    private String address;
    private String phone;
    
    private String ID;
            
    /**
     *
     * @param name
     * @param password
     * @param email
     * @param address
     * @param phone
     */
    public Customer(String name, String password, String email, String address, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }
    
    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public boolean contains(String data) {
        return this.ID.contains(data) ||
               this.name.toLowerCase().contains(data) ||
               this.address.toLowerCase().contains(data) ||
               this.email.toLowerCase().contains(data) ||
               this.phone.toLowerCase().contains(data);                                
    }

    @Override
    public String[] info() {
        return new String[]{ this.ID, this.name, this.address, this.email, this.phone};
    }

    @Override
    public boolean matches(String other) {
        return this.ID.equals(other);
    }
}
