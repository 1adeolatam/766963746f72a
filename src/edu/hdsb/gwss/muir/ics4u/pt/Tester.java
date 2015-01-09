package edu.hdsb.gwss.muir.ics4u.pt;



/**
 * Open Hash Table Tester
 *
 * @version v2014.S1
 */
public class Tester {

    /**
     */
    public static void main( String[] args ) {
        CSStudent[] Kappa = new CSStudent[16];
        
        
        CSStudent studentTA = new CSStudent( "Tami", "A", 7110, 12 );
        CSStudent studentSA = new CSStudent( "Sami", "A", 2221, 12 );
        CSStudent studentKB = new CSStudent( "Kael", "B", 2332, 12 );
        CSStudent studentAG = new CSStudent( "Aryan", "G", 1443, 12 );
        CSStudent studentFH = new CSStudent( "Farzan", "H", 2554, 12 );
        CSStudent studentAK = new CSStudent( "Adriana", "K", 6665, 12 );
        CSStudent studentAL = new CSStudent( "Alex", "L", 7976, 12 );
        CSStudent studentSL = new CSStudent( "Steven", "L", 8387, 12 );
        CSStudent studentAM = new CSStudent( "Adil", "M", 9098, 12 );
        CSStudent studentSN = new CSStudent( "Sam", "N", 1120, 12 );
        CSStudent studentRQ = new CSStudent( "Rasheed", "Q", 2231, 12 );
        CSStudent studentFR = new CSStudent( "Farjaad", "R", 1342, 12 );
        CSStudent studentFR2 = new CSStudent( "Francis", "R", 4453, 12 );
        CSStudent studentSS = new CSStudent( "Scott", "S", 5564, 12 );
        CSStudent studentDS = new CSStudent( "Dan", "S", 6675, 12 );
        CSStudent studentLW = new CSStudent( "Leon", "W", 2896, 12 );

        Kappa[0]=studentTA;
        Kappa[1]=studentSA;
        Kappa[2]=studentKB;
        Kappa[3]=studentAG;
        Kappa[4]=studentFH;
        Kappa[5]=studentAK;
        Kappa[6]=studentAL;
        Kappa[7]=studentSL;
        Kappa[8]=studentAM;
        Kappa[9]=studentSN;
        Kappa[10]=studentRQ;
                Kappa[11]=studentFR;
        Kappa[12]=studentFR2;
        Kappa[13]=studentSS;
                Kappa[14]=studentDS;
                Kappa[15]=studentLW;



        
        
        OpenHashTable ht = new OpenHashTable();
        for(int i = 0; i < Kappa.length; i++){
            ht.put(Kappa[i]);
        }        
      
       System.out.println( ht.toString() );
    }

}
