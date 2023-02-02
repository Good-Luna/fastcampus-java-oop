package org.example.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("bubblesort")
    @Test
    void given_list_whenExcuting_thenReturnSortList() {
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //when
        List<Integer> actual = bubbleSort.sort(List.of(3,2,1,5,4));

        //Then
        assertEquals(List.of(1,2,3,4,5),actual);

    }
}