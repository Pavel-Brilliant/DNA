/**
 * Copyright (c) 2015 Pavel Brilliant. All Rights Reserved.
 */
package com.pavelbrilliant;

/**
 * <p>
 * Project: GolovachCourses - Core Java
 *
 * @author Pavel Brilliant
 * @version 1.0 02 May 2015
 */
public class DNANode {

    int     value;
    DNANode next;
    DNANode down;

    public DNANode(final int value, final DNANode next, final DNANode down) {
        this.value = value;
        this.next = next;
        this.down = down;
    }

    public static DNANode buildDNA(int nodes, int levels) {
        DNANode[] dnaArr = new DNANode[nodes * levels];
        for (int i = dnaArr.length - 1; i >= 0; i--) {
            dnaArr[i] = new DNANode(i, (i < dnaArr.length - 1) ? dnaArr[i + 1] : null, (i < dnaArr.length - nodes) ? dnaArr[i + nodes] : null);
        }
        return dnaArr[0];
    }

    public static boolean checkDNAStructure(DNANode dnaNode, int nodes, int levels) {
        DNANode[] dnaArr = new DNANode[nodes * levels];
        for (int i = 0; i < dnaArr.length; i++) {
            dnaArr[i] = dnaNode;
            if (dnaNode == null) {
                return false;
            } else {
                dnaNode = dnaNode.next;
            }
        }
        if (dnaArr[dnaArr.length - 1].next != null) {
            return false;
        }
        for (int i = dnaArr.length - 2; i >= 0; i--) {
            if (dnaArr[i].next != dnaArr[i + 1]) {
                return false;
            }
            if (i < dnaArr.length - nodes) {
                if (dnaArr[i].down != dnaArr[i + nodes]) {
                    return false;
                }
            } else if (dnaArr[i].down != null) {
                return false;
            }
        }
        return true;
    }
}
