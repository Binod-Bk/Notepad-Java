/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad;

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author binod
 */
public class Menubar{
    
    public static JMenuBar getMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
    
        JMenuItem openItem = new JMenuItem("New");
        fileMenu.add(openItem);
        JMenuItem openItem2 = new JMenuItem("New Window");
        fileMenu.add(openItem2);
        JMenuItem openItem3 = new JMenuItem("Open");
        fileMenu.add(openItem3);
        JMenuItem openItem4 = new JMenuItem("Save");
        fileMenu.add(openItem4);
        JMenuItem openItem5 = new JMenuItem("Save As");
        fileMenu.add(openItem5);
        JMenuItem openItem6 = new JMenuItem("Print");
        fileMenu.add(openItem6);
        JMenuItem openItem7 = new JMenuItem("Exit");
        fileMenu.add(openItem7);
        
        JMenu Menu2 = new JMenu("Edit");
        menuBar.add(Menu2);
    
        JMenuItem openItem8 = new JMenuItem("Undo");
        Menu2.add(openItem8);
        JMenuItem openItem9 = new JMenuItem("Cut");
        Menu2.add(openItem9);
        JMenuItem openItem10 = new JMenuItem("Paste");
        Menu2.add(openItem10);
        JMenuItem openItem11 = new JMenuItem("Copy");
        Menu2.add(openItem11);
        JMenuItem openItem12 = new JMenuItem("Delete");
        Menu2.add(openItem12);
        
        JMenu formatMenu = new JMenu("Format");
        menuBar.add(formatMenu);
        
        JMenuItem openItem13 = new JMenuItem("Word Wrap");
        formatMenu.add(openItem13);
        JMenuItem openItem14 = new JMenuItem("Font");
        formatMenu.add(openItem14);
        
        JMenu viewMenu= new JMenu("View");
        menuBar.add(viewMenu);
        
        JMenuItem openItem15 = new JMenuItem("Zoom");
        viewMenu.add(openItem15);
        JMenuItem openItem16 = new JMenuItem("Status Bar");
        viewMenu.add(openItem16);
        
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        JMenuItem openItem17 = new JMenuItem("View Help");
        helpMenu.add(openItem17);
        JMenuItem openItem18 = new JMenuItem("Send Feedback");
        helpMenu.add(openItem18);
        JMenuItem openItem19 = new JMenuItem("About Notepad");
        helpMenu.add(openItem19);
        
        return menuBar;
}


}
