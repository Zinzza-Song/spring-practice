package com.zinzza.javaoop.service;

import com.zinzza.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void test() {
        //given

        //when
        List<String> actual = sut.doSort(List.of("3", "2", "1"));
        //then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}