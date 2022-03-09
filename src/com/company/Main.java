package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }


        sort();
        sort(arrayList);
        sort(linkedList);
    }


    private static void sort() {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }
        int changeCounter;
        do {
            changeCounter = 0;
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    changeCounter++;
                }
            }
        } while (changeCounter > 0);
        System.out.println(Arrays.toString(array));
    }
        private static void sort (ArrayList < Integer > arrayList) {
            arrayList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            System.out.println(arrayList);
        }

    private static void sort(LinkedList<Integer> linkedList) {
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(linkedList);
    }
}