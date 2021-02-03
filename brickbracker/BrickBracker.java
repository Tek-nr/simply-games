
package brickbracker;

import javax.swing.JFrame;


public class BrickBracker {

    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gamePlay= new Gameplay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Hilal's Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
    
}
