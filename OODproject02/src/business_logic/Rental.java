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
public class Rental {
    
    public enum RentStatus { AVAILABLE, RENTED, LATE }; 
    
    private Calendar rentDate;
    private Calendar returnDate;
    private RentStatus status; 
    
    /**
     *
     * @param rentDate
     * @param returnDate
     * @param status
     */
    public Rental(Calendar rentDate, Calendar returnDate, RentStatus status) {
        this.rentDate = rentDate;
        this.returnDate = returnDate;        
        this.status = status;
    }
    
    public Calendar getRentDate() {
        return rentDate;
    }
    
    public Calendar getReturnDate() {
        return returnDate;
    }
    
    public RentStatus getRentStatus() {
        return status;
    }
}
