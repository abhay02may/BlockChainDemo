package com.blochchain;

import java.util.LinkedList;
import java.util.List;

public class BlockChain {

    // Immutable ledger, we can't remove blocks
   private List<Block> blockChain;

   public BlockChain(){
       blockChain=new LinkedList<>();
   }

   public void addBlock(Block block){
       this.blockChain.add(block);
   }

   public List<Block> getBlockChain(){
       return this.blockChain;
   }

   public int getSize(){
       return this.blockChain.size();
   }

    @Override
    public String toString() {
       StringBuilder builder=new StringBuilder();
       for(Block block: blockChain){
           builder.append(block.toString()+"\n");
       }
       return builder.toString();
    }
}
