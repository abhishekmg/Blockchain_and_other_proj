package com.mg;

import java.util.Arrays;

public class Block {

    private int previousHash;
    private String[] transaction;

    private int blockHash;

    public Block(int previousHash, String[] transaction) {
        this.previousHash = previousHash;
        this.transaction = transaction;

        Object[] contens = {Arrays.hashCode(transaction), previousHash};
        this.blockHash = Arrays.hashCode(contens);

    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transaction;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
