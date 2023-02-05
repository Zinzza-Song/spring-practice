package com.zinzza.javaoop;

import com.zinzza.javaoop.logic.JavaSort;
import com.zinzza.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sort<String> sort = new JavaSort<>();
        System.out.println("[result]" + sort.sort(Arrays.asList(args)));

    }
}
