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
public class StudentClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student student = new Student();
        student.setFirstName("hi im fedsu");
        student.setLastName("Free LG");
        student.setOEN(234634);
        System.out.println(student.toString());
    }
}
