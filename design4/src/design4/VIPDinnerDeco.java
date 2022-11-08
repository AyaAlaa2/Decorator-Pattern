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
public class VIPDinnerDeco extends HotelRoomDeco{
    private int cost;

    public VIPDinnerDeco(HotelRoom hotelroom , int cost) {
        super(hotelroom);
        this.cost = cost;
    }
    
    public int reserve(){
        return super.reserve() + cost;
    }
    
}
