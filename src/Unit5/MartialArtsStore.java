/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5;

import java.io.*;

/**
 *
 * @author 1adeolatam
 */
public class MartialArtsStore {

    int size;

    public void openstore(RandomAccessFile file) throws FileNotFoundException {
       

    }

    public void write(){
        
    }
    
    public void add(MartialArts MA, RandomAccessFile file) {

        size++;
    }

    public static void main(String[] args) throws Exception {

        MartialArts Tk = new MartialArts("blah bergrerserrrtrtrsrtslah", "Taekwando",21, 10, true, 'r');

         RandomAccessFile recordFile = new RandomAccessFile("MartialArts.txt", "rw");
        recordFile.seek(0);
        recordFile.writeChars(Tk.getName());
        recordFile.writeChars(Tk.getFounder());
        recordFile.writeInt(Tk.getNumberOfPractitioners());

        System.out.println("HI");
    }

}
