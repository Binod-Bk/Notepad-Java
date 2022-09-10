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

public class Notepad extends JFrame {

    public Notepad() {

        JMenuBar menuBar = Menubar.getMenuBar();

        add(menuBar);

        setTitle("Welcome To Notepad");
        setSize(600, 600);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Notepad();
    }

}
