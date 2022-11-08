package design4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public abstract class HotelRoomDeco implements HotelRoom {
     HotelRoom hotelRoom;

    public HotelRoomDeco(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }
     
    public int reserve(){
         return hotelRoom.reserve();
    }
}
