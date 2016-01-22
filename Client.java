/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NC_Lab1;

import NC_Lab1.GUI.GUI;

public class Client2 {

    private static GUI gui;
    

    public static void main(String[] args) {

        Client2 main = new Client2();
		gui = new GUI();
		gui2 = new GUI();
        gui.setVisible(true);
        gui.startController();
       
    }
    
    
    
}
