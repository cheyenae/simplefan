/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rbatten.simplefan;

import com.rbatten.simplefan.dataobjects.SimpleFanDO;

/**
 *
 * @author rbatten
 */
public class Simplefan {

    public static void main(String[] args) {
        //Inital Values
        SimpleFanDO sfdo = new SimpleFanDO();
        //intial seetings
        System.out.println("Initial Settings");
        System.out.println(sfdo.toString());
        //Increase Speed to Low
        sfdo.changeSpeed();
        System.out.println("First Speed Setting");
        System.out.println(sfdo.toString());
        //Increase Speed to Medium
        sfdo.changeSpeed();
        System.out.println("Second Speed Setting");
        System.out.println(sfdo.toString());
        
        //change direction
        sfdo.changeDirection();
        System.out.println("Changed Direction");
        System.out.println(sfdo.toString());
        
         //Increase Speed to High
        sfdo.changeSpeed();
        System.out.println("Third Speed Setting");
        System.out.println(sfdo.toString());
        
        //change direction
        sfdo.changeDirection();
        System.out.println("Second Changed Direction");
        System.out.println(sfdo.toString());
        
         //Increase Speed to Past High, back to Zero
        sfdo.changeSpeed();
        System.out.println("Fourth Speed Setting, Reset to Off");
        System.out.println(sfdo.toString());
        
        //Increase Speed to Low after reset off
        sfdo.changeSpeed();
        System.out.println("Back To Low Setting");
        System.out.println(sfdo.toString());
        
        
        
        
        
    }
}
