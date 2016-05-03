/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic;

import business_logic.Request.RequestStatus;
import java.util.Calendar;

/**
 *
 * @author Kris
 */
public class Movie implements Searchable<String>, Matchable<String>, Presentation {

    
    public enum Genre {DRAMA,ACTION,HORROR, ROMANCE, COMEDY};
    public enum Rating { G, PG, PG13, R };
    
    private Genre genre;
    private Rating rating;
    private String name;
    private Integer year;
    
    private String ID;
    
    /**
     *
     * @param genre
     * @param rating
     * @param name
     * @param year
     * @param ID
     */
    public Movie(Genre genre, Rating rating, String name, Integer year, String ID) {
        this.genre = genre;
        this.rating = rating;
        this.name = name;
        this.year = year;
        
        this.ID = ID;
    }
    
    public Genre getGenre() {
        return genre;
    }
    
    public Rating getRating() {
        return rating;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getYear() {
        return year;
    }
   
    
    @Override
    public boolean contains(String data) {
       return this.ID.contains(data) ||
              this.name.toLowerCase().contains(data) ||
              this.genre.toString().toLowerCase().contains(data) ||
              this.rating.toString().toLowerCase().contains(data) ||
              this.year.toString().toLowerCase().contains(data);
    }

    @Override
    public String[] info() {
        return new String[]{ this.ID, this.name, this.genre.toString(), this.rating.toString(), this.year.toString() };
    }

    @Override
    public boolean matches(String other) {
        return this.ID.equals(other);
    }

    @Override
    public String getID() {
        return this.ID;
    }
    
    public DVD createDVD(String serialNO, boolean lost) {
        return new DVD(serialNO, lost, this);
    }
    
    public Request createRequest(Calendar requestDate,Calendar responseDate, RequestStatus status, boolean type) {
        return new Request(requestDate, responseDate, status, type, this);
    }

}
