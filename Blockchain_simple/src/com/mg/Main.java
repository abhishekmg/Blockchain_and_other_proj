package com.mg;


import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String[] genesisTransaction = {"apple" , "banana"};
        Block genesisBlock = new Block(0, genesisTransaction);

        String[] block2trabsaction = {"ball" , "bat"};
        Block block2 = new Block(genesisBlock.getBlockHash() , block2trabsaction );

        System.out.println("1st hash");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("2nd hash");
        System.out.println(block2.getBlockHash());














    }





}

