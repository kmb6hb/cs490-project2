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
public class Review {
    
    private int rating;
    private String review;
    
    /**
     *
     * @param rating
     * @param review
     */
    public Review(int rating, String review) {
        this.rating = rating;
        this.review = review;
    }
    
    public int getRating() {
        return rating;
    }
    
    public String getReview() {
        return review;
    }
}
