package org.example.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {


    @DisplayName("자바소트")

    @Test
    void given_list_whenExcuting_thenReturnSortList() {
        //Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //when
        List<Integer> actual = javaSort.sort(List.of(3,2,1,5,4));

        //Then
        assertEquals(List.of(1,2,3,4,5),actual);

    }
}