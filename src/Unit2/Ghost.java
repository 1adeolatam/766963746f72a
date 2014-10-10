/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import static Unit2.PacmanCharacter.c;
import hsa.Console;
import java.awt.Color;

/**
 *
 * @author Tami
 */
public class Ghost extends PacmanCharacter {

    int radius = 30;
    boolean eaten;
   
    Color color;
    String name;

    //Constructors
    public Ghost() {
    }
    public Ghost(String name){
        this.name = name;
    }
    
      
    public Ghost(Color color, int xLoc, int yLoc, String name) {
     
        super(color, xLoc, yLoc);
           this.name = name;
        this.color = color;
    }

    //Getters and setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius < 0){
            
        }else{
        this.radius = radius;
    }}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null  ){
            
        }else{
        this.name = name;
    }}
    
    
    
  

    @Override
    public void draw() {

        c.setColor(this.color);

        c.fillOval(this.xLoc, this.yLoc, radius, radius);
        c.fillRect(this.xLoc, this.yLoc + radius / 2, radius, radius);

    }

    @Override
    public void erase() {

        c.setColor(Color.WHITE);

        c.fillOval(this.xLoc, this.yLoc, radius, radius);
        c.fillRect(this.xLoc, this.yLoc + radius / 2, radius, radius);

    }

    @Override
    public String toString() {
        return "The colour of this ghost is " + color + ", The name of this ghost is " + name ;
    }
    
    
    

}
