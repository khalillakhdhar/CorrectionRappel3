/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.correctionrappel3;

/**
 *
 * @author khali
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User us1=new User("teste","teste", "test@gmail.com", "0099338899", "teste", "testeur", 30);
         if(us1.verifAge())
            System.out.println(us1.toString());
        else
            System.out.println("pour "+us1.getNom()+" l'age doit être supérieur à 15");
        User us2=new User("teste2","teste2", "test2@gmail.com", "0099338822", "teste2", "admin", 22);
       
        if(us2.verifAge())
            System.out.println(us2.toString());
        else
            System.out.println("pour "+us2.getNom()+" l'age doit être supérieur à 15");
    }
    
}
