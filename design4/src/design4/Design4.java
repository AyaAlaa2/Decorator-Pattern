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
public class Design4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HotelRoom s1 =  new SingleRoom(50);
        HotelRoom s2 = new Sweet(100);
        s1 = new VIPDinnerDeco(s1,30);
        s2 = new VIPDinnerDeco(s2,40);
        System.out.println("Cost single room with dinner =  " + s1.reserve());
        System.out.println("Cost sweet with dinner =  " + s2.reserve());
        s1 = new BreakfastDeco(s1,20);
        s2 = new BreakfastDeco(s2 , 15);
        System.out.println("Cost single room with breakfast and dinner=  " + s1.reserve());
        System.out.println("Cost sweet with breakfast and dinner=  " + s2.reserve());
        
    }
    
}
