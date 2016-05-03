/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic;

import java.util.Calendar;

/**
 *
 * @author Kris
 */
public class Request {
    
    public enum RequestStatus { REQUESTED, NOT_REQUESTED, ORDERED, NOT_AVAILABLE };
    
    private Calendar requestDate;
    private Calendar responseDate;
    private RequestStatus status; 
    private boolean type; // unknown what type it should be
    
    private Movie movie;
    
    
    /**
     *
     * @param requestDate
     * @param responseDate
     * @param status
     * @param type
     * @param movie
     */
    public Request(Calendar requestDate,Calendar responseDate, RequestStatus status, boolean type, Movie movie) {
        this.requestDate = requestDate;
        this.responseDate = responseDate;
        this.status = status;
        
        // to be determined
        this.type = type;
        this.movie = movie;
    }
    
    public Calendar getRequestDate() {
        return requestDate;
    }
    
    public Calendar getResponseDate() {
        return responseDate;
    }
    
    public RequestStatus getRequestStatus() {
        return status;
    }
    
    public boolean getType() {
        return type;
    }     
    
    public Movie getMovie() {
        return movie;
    }
             
}
