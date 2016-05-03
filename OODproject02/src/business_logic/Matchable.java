/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic;

/**
 *
 * @author Kris
 * @param <K>
 */
public interface Matchable<K> {
    public boolean matches(K other);
    
}
