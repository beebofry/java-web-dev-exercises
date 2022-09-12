package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator comparator1 = new ConeComparator();


//        for (Flavor flavor : flavors){
//            System.out.println(flavor);
//        }
//
//        flavors.sort(comparator);
//        System.out.println("***********");
//        for (Flavor flavor : flavors){
//            System.out.println(flavor);
//        }

//        for (Cone cone: cones){
//            System.out.println(cone);
//        }
//
//        cones.sort(comparator1);
//
//        System.out.println("***********");
//        for (Cone cone: cones){
//            System.out.println(cone);
//        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
