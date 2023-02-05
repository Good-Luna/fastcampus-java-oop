package org.example.logic;

import java.util.List;

public interface Sort <T extends Comparable<T>> {
    
//    정렬기능을 가지는 인터페이스 생성
    List<T> sort(List<T> list);
}
