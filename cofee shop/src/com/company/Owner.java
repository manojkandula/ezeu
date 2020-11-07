package com.company;

//import jdk.dynalink.beans.StaticClass;

//import java.sql.SQLOutput;
import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;


public class Owner {

    static ArrayList<String> al = new ArrayList<String>();
    static ArrayList<String> all = new ArrayList<String>();
    static String item;

    public Owner() {
        al.add("CAPPUCCINO");
        al.add("AFFOGATO");
        all.add("Nutella");
        all.add("choclate");
    }


    public static void main(String args[]) {
        Owner ow = new Owner();
        //  toppings to=new toppings();
        do {
            System.out.println("hello select your choice");
            System.out.println("1.owner , 2.customer");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("-------  hello owner  ------");
                System.out.println("select one choice");
                while (choice <= 2) {
                    System.out.println("1.cofee , 2.topings ");
                    Scanner ct = new Scanner(System.in);
                    int choice1 = ct.nextInt();



                       /*if (choice1 == 1)
                        System.out.println("you are selected to edit cofee");
                        else
                            System.out.println("you are selected to edit topings");*/
                    if (choice1 == 1) {


                        System.out.println("you are selected to edit cofee");
                        System.out.println(" agian Enter your choice of edit ");
                        System.out.println("1.add cofee ,2.delete cofee ,3.show menu");
                        Scanner adsc = new Scanner(System.in);
                        int choice2 = adsc.nextInt();
                        //System.out.println("the choice is " + choice2);

                        switch (choice2) {

                            case 1:
                                System.out.println(" add cofee");
                                addcofee();
                                break;
                            case 2:
                                System.out.println("delete cofee");
                                deletecofee();
                                break;
                            case 3:
                                System.out.println("show menu");
                                showmenu();
                                break;
                            default:
                                System.out.println("enter correct choice");
                        }
                    } else if (choice1 == 2) {

                        System.out.println("you are selected to edit topings");
                        System.out.println("again enter your choice of edit ");
                        System.out.println("1.add topings ,2.delete topings ,3.show menu\"");
                        Scanner adst = new Scanner(System.in);
                        int choice3 = adst.nextInt();
                        System.out.println("the choice is " + choice3);

                        switch (choice3) {

                            case 1:
                                System.out.println("add topping");
                                addtopping();
                                break;
                            case 2:
                                System.out.println("delete topping");
                                deletetopping();
                                break;
                            case 3:
                                System.out.println("show topingmenu");
                                showtoppingmenu();
                                break;
                            default:
                                System.out.println("enter correct choice");
                        }
                    } else {
                        System.out.println("enter valid choice");
                        exit(0);

                    }
                }
            } else {
                System.out.println("------ hello customer  ------");
                System.out.println("The meneu is " + al);
                System.out.println("select index number of cofee you want ");
                Scanner slc = new Scanner(System.in);
                int value = slc.nextInt();
                if (value <= args.length) {
                    System.out.println("selected cofee is " + al.get(value));
                    System.out.println("select topping");
                    // toppings();
                    System.out.println("the topping are" + all);
                    System.out.println("select index number of cofee you want ");
                    Scanner sld = new Scanner(System.in);
                    int num = sld.nextInt();
                    System.out.println("selected topping is " + all.get(num));
                } else {
                    System.out.println("you are given wrong input");
                }
            }
        }while(true);
    }

          public static void addcofee () {

             Scanner sc = new Scanner(System.in);
             System.out.println("enter cofee name which you want to add");
             String name = sc.nextLine();
             al.add(name);
             //System.out.println(al);
             System.out.println(" item is added");
           }
           public static void deletecofee () {

             Scanner sc = new Scanner(System.in);
             System.out.println("enter index number which you want to delete");
             int value = sc.nextInt();
             al.remove(value);
             //System.out.println(al);
             System.out.println(" item is deleted");
             }
             public static void showmenu () {

             Scanner sc = new Scanner(System.in);
             //System.out.println(al);
             System.out.println(" the menu is" + al);
              }
             public static void addtopping () {

             Scanner sc = new Scanner(System.in);
             System.out.println("enter topping name which you want to add");
             String name = sc.nextLine();
             all.add(name);
             System.out.println(all);
             System.out.println(" item is added");
            }
            public static void deletetopping () {

             Scanner sc = new Scanner(System.in);
             System.out.println("enter index number which you want to delete");
             int value = sc.nextInt();
             all.remove(value);
             System.out.println(all);
             System.out.println(" item is deleted");
             }
              public static void showtoppingmenu () {

             Scanner sc = new Scanner(System.in);
             System.out.println(all);
             System.out.println(" the menu is" + all);
         }

}