package com.pavelbrilliant;

public class Main {

    public static void main(final String[] args) {

        DNANode dna = DNANode.buildDNA(4, 2);
        System.out.println(DNANode.checkDNAStructure(dna, 4, 2));
        System.out.println(DNANode.checkDNAStructure(dna, 3, 3));
            
    }
}
