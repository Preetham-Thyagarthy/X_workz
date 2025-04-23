package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.tree.Tree;
import com.xworkz.inheritence.internal.tree.Oak;

public class TreeRunner {
    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.roots();
        tree.branches();
        tree.leaves();
        tree.oxygen();
        tree.lifespan();
        System.out.println("**************************************");
        Tree tree1 = new Oak();
        tree1.roots();
        tree1.branches();
        tree1.leaves();
        tree1.oxygen();
        tree1.lifespan();

        System.out.println("**************************************");

        Oak oak = new Oak();
        oak.roots();
        oak.branches();
        oak.leaves();
        oak.oxygen();
        oak.lifespan();

        System.out.println("**************************************");
    }
}
