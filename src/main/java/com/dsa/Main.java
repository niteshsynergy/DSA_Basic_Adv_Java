package com.dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 20, 30, 49, 50, 6, 7, 8, 9, 10);
        System.out.println("Result: "+checkTarget(list, 6,0));
    }
    public static boolean checkTarget(List<Integer> list, int t , int index) {
        if(index == list.size())
            return false;
        if(list.get(index) == t)
            return true;
        return checkTarget(list,t,index +1);
    }


}