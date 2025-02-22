/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ICT Computer Lab
 */
public class square {
    float s;
    
    square(float s){
        this.s=s;
    }
    
    float perimeter(){
        return s*4;
    }
    
    float area(){
        return s+s+s+s;
    }
}
