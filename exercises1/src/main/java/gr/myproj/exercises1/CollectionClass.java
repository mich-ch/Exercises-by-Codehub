package gr.myproj.exercises1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CollectionClass {
    //1. Given a list of integers, return a sub list that contains only the prime numbers
    public static List<Integer> primeNumbers(List<Integer> bigList) {
        List<Integer> subList = new ArrayList<Integer>();

        if(bigList.isEmpty() != true)
            for (Integer var : bigList)
            {
                if(simpleAlgorithms.primeNumber(var))
                    subList.add(var);
            }

        return subList;
    }

    //2. Implement a way of finding a list eliminating the duplicates from a list.
    public static List<Integer> dublicateNumbers(List<Integer> list) {

        int count = 0;

        for (Integer var : list)
        {
            for (Integer var2 : list)
            {
                if(var == var2)
                    count++;
                if(count > 1)
                    list.remove(var);
            }
            count = 0;
        }

        return list;
    }

    //3. Write a program that returns the digits of number in descending order.
    public static List<Integer> digitsDescOrder(int num) {
        List<Integer> list = new ArrayList<>();
        while(num > 0)
        {
            num = num / 10;
            list.add(num);
        }
        Collections.sort(list, Collections.reverseOrder());

        return list;
    }

    //4. Implement your own version of a stack and its main functionalities (pop, push, peek)
    //this resolve is inside the class UniqStack

    //5. Reverse a string using only a stack .
    public static void reverseStr(StringBuffer str)
    {
        // Create a stack of capacity
        // equal to length of string
        int n = str.length();
        Stack obj = new Stack();

        // Push all characters of string
        // to stack
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        // Pop all characters of string
        // and put them back to str
        for (i = 0; i < n; i++)
        {
            char ch = (char) obj.pop();
            str.setCharAt(i,ch);
        }
    }

    //6. Write a program that check if a word is symmetric, ignoring cases (i.e. AbdBa is symmetric).
    public static boolean symmetric(String str) {
        int length = str.length();
        for(int i = 0; i < length/2; i++)
            if(str.charAt(i) != str.charAt(length-1))
                return false;

        return true;
    }
}
