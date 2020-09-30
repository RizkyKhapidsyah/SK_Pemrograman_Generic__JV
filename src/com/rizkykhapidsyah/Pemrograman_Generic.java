package com.rizkykhapidsyah;

/* Created by Rizky Khapidsyah */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pemrograman_Generic {
    public static void main(String[] args) {
        List L = new ArrayList();

        L.add("Medan");
        L.add("Jakarta");
        L.add("95");
        L.add(73.21);
        L.add(new Date());

        System.out.println("--Bukan Generic--");
        for (int i = 0; i < L.size(); i++) {
            System.out.println(L.get(i));
        }

        /* Generik */
        ArrayList<Integer> L2 = new ArrayList<Integer>();
        L2.add(2);
        L2.add(3);
        L2.add(5);
        //L2.add("Medan"); // --> ini akan error jika ompilasi

        System.out.println("--Bukan Generic--");
        for (int i = 0; i < L2.size(); i++) {
            System.out.println(L2.get(i));
        }

    }
}
