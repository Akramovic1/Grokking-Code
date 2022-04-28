package com.company;



public class Main {
    public static boolean isHappy(int n) {
        int slow = findSquare(n);
        int fast = findSquare(findSquare(n));
        while(fast != 1){
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
            if(slow == fast) return false;
        }
        return true;
    }
    public static int findSquare(int n){
        int sum = 0;int digit;
        while(n > 0){
            digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean result = isHappy(2);
        System.out.println(result);;
    }
}
