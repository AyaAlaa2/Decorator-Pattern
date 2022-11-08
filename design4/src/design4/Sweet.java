/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design4;

/**
 *
 * @author Lenovo
 */
    
    public class Sweet implements HotelRoom {
    private int cost;

    public Sweet(int cost) {
        this.cost = cost;
    }
    
    public int reserve (){
        return cost;
    }
}