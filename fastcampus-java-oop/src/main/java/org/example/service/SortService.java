package org.example.service;

import org.example.logic.JavaSort;
import org.example.logic.Sort;

import java.util.List;

public class SortService {

    //결합을 떼기 위해 재역전 방법 사용
    //생성자 주입방법
    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
        System.out.println("[구현체는]"+sort.getClass().getName());
    }
    public List<String> doSort(List<String> list) {
        // Sort<String> sort = new JavaSort<>();

        return sort.sort(list);
    }
}
