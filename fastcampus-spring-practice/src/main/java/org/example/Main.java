package org.example;

import org.example.logic.BubbleSort;
import org.example.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*MainTest  : ctrl+shift+T*/
        /*Sort 구현체로 변경 -> 가져오는 부분만 갈아 끼우면 된다*/
        Sort<String> sort =new BubbleSort<>();

        System.out.println("[result]"+sort.sort(Arrays.asList(args)));

    }
}