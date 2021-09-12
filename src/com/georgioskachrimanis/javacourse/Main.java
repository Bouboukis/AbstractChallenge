package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SearchTree list = new SearchTree(null);
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        String stringData = "4 5 9  3 2 8 7 0 1 6";
       // String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data){
            list.addItem(new Node(s));
        }

        list.traverseList(list.getRoot());



        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        list.removeItem(new Node("9"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(new Node("4"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(new Node("9"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        list.removeItem(new Node("7"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(new Node("5"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(new Node("0"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(new Node("9"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        list.removeItem(new Node("1"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(new Node("2"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(new Node("3"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");


        list.removeItem(new Node("6"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(new Node("8"));
        list.traverseList(list.getRoot());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        list.removeItem(list.getRoot());
        list.traverseList(list.getRoot());

    }
}

