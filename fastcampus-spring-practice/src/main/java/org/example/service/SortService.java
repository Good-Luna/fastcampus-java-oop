package org.example.service;

import org.example.logic.JavaSort;
import org.example.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/*@Service 는 Component와 유사 기능 서비스 로직이라 어울리는 어노테이션 달아준것!*/
@Service
public class SortService {

    //결합을 떼기 위해 재역전 방법 사용
    //생성자 주입방법
    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort){
        this.sort = sort;
        System.out.println("[구현체는]"+sort.getClass().getName());
    }
    public List<String> doSort(List<String> list) {
        // Sort<String> sort = new JavaSort<>();

        return sort.sort(list);
    }
}
