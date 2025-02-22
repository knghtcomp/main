/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ICT Computer Lab
 */
public class rectangle {
    float l, w;
    
    rectangle(float w, float l){
        this.l=l;
        this.w=w;
    }
    
    float area(){
        return l*w;
    }
    
    float perimeter(){
        return l+l+w+w;
    }
}
