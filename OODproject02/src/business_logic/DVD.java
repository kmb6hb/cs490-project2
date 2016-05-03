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
public class DVD implements Searchable<String>, Matchable<String>, Presentation {
    
    private String serialNO;
    private boolean lost;
    
    private String ID;
    private Movie movie;
    
    /**
     *
     * @param serialNO
     * @param lost
     * @param movie
     */
    public DVD(String serialNO, boolean lost, Movie movie) {
        this.serialNO = serialNO;
        this.lost = lost;
        
        this.movie = movie;
    }
    
    public String getSerialNO() {
        return this.serialNO;
    }
    
    public boolean isLost() {
        return this.lost;
    }
    
    public Movie getMovie() {
        return this.movie;
    }
    
    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public boolean contains(String data) {
        return this.ID.contains(data) ||
               this.serialNO.toLowerCase().contains(data) ||
               this.movie.contains(data) ||
               isLost(this.lost).toLowerCase().contains(data);
    }

    @Override
    public String[] info() {
       return new String[]{ this.ID, this.serialNO, isLost(this.lost), this.movie.toString() };
    }

    @Override
    public boolean matches(String other) {
        return this.ID.equals(other);
    }
    
    public String isLost(boolean lost) {
        if(lost)
            return "Disk Lost";
        else
            return "Not Lost";
    }
}
