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
 
    public static void main(String[] args) throws Exception {

        MartialArts Tk = new MartialArts("Taekwando", 10, true, 'B', "hi");
        MartialArts Km = new MartialArts("Krav Maga", 1000, true, 'b', "IDF");

        RandomAccessFile recordFile = new RandomAccessFile("MartialArts.txt", "rw");

        recordFile.seek(0);
        recordFile.writeChars(Tk.getName());
        recordFile.writeChars(Tk.getFounder());
        recordFile.writeInt(Tk.getNumberOfPractitioners());

    }

}
