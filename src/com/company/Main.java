package com.company;
import com.company.lb2.Tribe;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

          Scanner in = new Scanner(System.in);
          Tribe[] t1 = new Tribe[4];
          System.out.print("Input name: ");
          String name = in.nextLine();
          System.out.print("Input fire handling: ");
          boolean fire;
         try {
             fire = in.nextBoolean();

         } catch (InputMismatchException e) {
         fire = false;}

         int population;
         try {
             System.out.print("Input population: ");
             population = in.nextInt();
         } catch (InputMismatchException e) {
         population = 0;}
          t1[0] = new Tribe(name, fire, population);
          t1[1] = new Tribe("Red", false);
          t1[2] = new Tribe();
          t1[3] = new Tribe(t1[0]);
          for (int i = 0; i < 4; i++) {
              t1[i].print();
          }
          System.out.println("population " + Tribe.Population(t1));
          System.out.println("fire handling " + Tribe.hasFire(t1));



    }
}



