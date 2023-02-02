package org.example;

import org.example.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*MainTest  : ctrl+shift+T*/

        BubbleSort<String> sort =new BubbleSort<>();

        System.out.println("[result]"+sort.sort(Arrays.asList(args)));

    }
}