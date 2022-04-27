package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static boolean backspaceCompare(String s, String t) {
        int p1 = s.length() - 1, p2 = t.length() - 1;
        while (p1 >= 0 || p2 >= 0) {
            p1 = updateIndex(s,p1);
            p2 = updateIndex(t,p2);
            if (p1 < 0 && p2 < 0) return true;
            if (p1 < 0 || p2 < 0) return false;
            if (s.charAt(p1) != t.charAt(p2)) return false;
            p1--;p2--;
        }
        return true;
    }
    public static int updateIndex(String str,int index){
        int counter = 0;
        while (index >= 0){
            if (str.charAt(index) == '#')   counter++;
            else if (counter > 0) counter--;
            else break;
            index--;
        }
        return index;
    }

    public static void main(String[] args) {
	    boolean result = backspaceCompare("ab#c","ad#c");
        System.out.println(result);
    }
}
