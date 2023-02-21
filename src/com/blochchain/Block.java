package com.blochchain;

import java.util.Date;

public class Block {

    private int id;
    private int nonce;
    private long timeStamp;
    private String hash;
    private String previousHash;
    private String transaction;

    public Block() {
    }

    public Block(int id, String transaction,String previousHash) {
        this.id = id;
        this.previousHash = previousHash;
        this.transaction = transaction;
        this.timeStamp=new Date().getTime();
        generateHash();
    }

    public void generateHash() {
        String dataToHash=Integer.toString(id)+previousHash+Long.toString(timeStamp)+
                Integer.toString(nonce)+transaction.toString();
        this.hash=SHA256Helper.generateHash(dataToHash);
    }

    public void incrementNonce(){
        this.nonce++;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Block{" +
                "id=" + id +
                ", hash='" + hash + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", transaction='" + transaction + '\'' +
                '}';
    }
}
