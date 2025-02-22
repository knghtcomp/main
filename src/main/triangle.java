/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ICT Computer Lab
 */
public class triangle {
    float a, b, c;
    
    triangle(float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    float perimeter(){
        return a+b+c;
    }
    
    float area(){
        float s=perimeter()/2;
        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
