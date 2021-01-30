package generics;

import generics.playstation.PlayStation;

public class GenericsRunner {


    /**
     * Generic class that does both
     *
     * @param args
     */
    public static void main(String [] args){

        PlayStation playStation = new PlayStation.Builder(1, "The first", 1998).build();


    }
}
