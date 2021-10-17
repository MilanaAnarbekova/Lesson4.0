package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        ArrayList<String>  Colors = new ArrayList();
//        Colors.add("White");
//        Colors.add("Green");
//        Colors.add("Pink");
//        Colors.add("Yellow");
//        Colors.add("Black");
//        System.out.println(Colors);
//        System.out.println("------------");
//        Collections.sort(Colors);
//        System.out.println(Colors);
//        System.out.println("------------");
//        Collections.reverse(Colors);
//        System.out.println(Colors);
//        System.out.println("------------");
//        Collections.shuffle(Colors);
//        System.out.println(Colors);
//        System.out.println("------------");
//        for (String Color:Colors) {
//            System.out.println(Color);
//        }
//        System.out.println("------------");
//        for (int i = 0; i < Colors.size(); i++) {
//            System.out.println(Colors.get(i));
//
//        }
//        System.out.println("------------");
//        Colors.remove("White");
//        Colors.remove("Pink");
//        System.out.println(Colors);


        //дз
        ArrayList<String> productsA = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите список продуктов: ");

        productsA.add(scanner.nextLine());
        productsA.add(scanner.nextLine());
        productsA.add(scanner.nextLine());
        productsA.add(scanner.nextLine());
        productsA.add(scanner.nextLine());

        System.out.println(productsA);

        ArrayList<String> productsB = new ArrayList();
        Scanner scannerB = new Scanner(System.in);

        productsB.add(scannerB.nextLine());
        productsB.add(scannerB.nextLine());
        productsB.add(scannerB.nextLine());
        productsB.add(scannerB.nextLine());
        productsB.add(scannerB.nextLine());

        System.out.println(productsB);

        ArrayList<String> productsC = new ArrayList();
        productsC.add(productsA.get(0));
        productsC.add(productsB.get(4));
        productsC.add(productsA.get(1));
        productsC.add(productsB.get(3));
        productsC.add(productsA.get(2));
        productsC.add(productsB.get(2));
        productsC.add(productsA.get(3));
        productsC.add(productsB.get(1));
        productsC.add(productsA.get(4));
        productsC.add(productsB.get(0));

        System.out.println(productsC);

        Collections.sort(productsC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(productsC);

    }
}
