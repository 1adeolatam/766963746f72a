/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u;

/**
 *
 * @author 1adeolatam
 */
public class Student {

   private String firstName;
    private String lastName;
   private int age;
   private int OEN;
   private double average;
   private double height;
    
    
    public Student() {
        
    }
    public Student(String name) {
        
        
        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getOEN() {
        return OEN;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOEN(int OEN) {
        this.OEN = OEN;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.OEN;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return true;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", OEN=" + OEN + '}';
    }
   
    
    
}
