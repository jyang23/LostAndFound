package com.pair;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Item[] items_lost = new Item[10];
        Item[] items_found = new Item[10];

        Scanner keyboard = new Scanner(System.in);

        int count_clothing = 0;
        int count_pet = 0;
        int count_electronics = 0;


        Item a = new Item("a001","Sweater","Clothes",true);
        Item b = new Item("a002","Dog","Pets",true);
        Item c = new Item("a003","Cellphone","Electronics",true);


        items_lost[0] = (a);
        items_lost[1] = (b);
        items_lost[2] = (c);



        while(true)
        {
            System.out.println("Welcome to the Lost and Found Menu");
            for (int i = 0; i < items_lost.length; i++)
            {

                if ((items_lost[i]).getCategory().equals("Clothes"))
                {
                    count_clothing++;
                }
                else if ((items_lost[i]).getCategory().equals("Pets"))
                {
                    count_pet++;
                }
                else
                {
                    count_electronics++;
                }

                System.out.println("There are "+ count_clothing +" item(s) of clothing, "+ count_pet + " pet(s) and "+ count_electronics +" electronics missing");
            }
        }

    }
}
