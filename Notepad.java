/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad;

/**
 *
 * @author binod
 */
import javax.swing.*;
import Notepad.Menubar;

public class Notepad extends JFrame{
    
    public Notepad(){
        
        Menubar menu = new Menubar();
  
        setTitle("Welcome To Notepad");
        setSize(600,600);
        setVisible(true);
        setLayout(null);
    }
    
    public static void main(String[] args) {
        new Notepad();
    }
    
}
