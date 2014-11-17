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

    int latestIndex = 0;

    public void openstore(RandomAccessFile file) throws FileNotFoundException {
        RandomAccessFile recordFile = new RandomAccessFile("MartialArts.txt", "rw");
        System.out.println(" WHALECOME TO THE MA STORE");

    }

    public void write() {

    }

    public void add(MartialArts MA, RandomAccessFile file) throws IOException {
        file.seek(file.length());
        file.writeChars(MA.getfounder());
        file.writeChars(MA.getname());
        file.writeInt(MA.getnumberOfpractitioners());
        file.writeInt(MA.getnumberOflevels());
        file.writeBoolean(MA.isFullContact());
        file.writeChar(MA.gethighestLevelcolor());

        latestIndex = latestIndex + 51;
    }

    public static void main(String[] args) throws Exception {

        MartialArts Tk = new MartialArts("Takewando", "asadadasdawd", 21, 3, true, 'r');

        System.out.println("HI");
    }

}
