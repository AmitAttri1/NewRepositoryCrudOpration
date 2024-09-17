package com.example.CoreJava.Test;
//Find the number of Subarrays whose sum is k=5

import java.util.LinkedHashMap;
import java.util.Map;

//Array :   3  9  -2  4  1  -7  2  6  -5  8  -3  -7  6  2
public class SubArrayCount {

    public static void main(String[] args) {
        int targetSum=5;
        int [] intarray={3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};


        Map<Integer,Integer>map=new LinkedHashMap<>();
        int  sum=0;
        int ans=0;
        map.put(sum,1);

        for (int i=0; i<intarray.length; i++)
        {
            sum+=intarray[i];
            int remSum=sum-targetSum;
            if (map.containsKey(remSum))
            {
                ans +=map.get(remSum);
            }
            map.put(sum, 1);
            System.out.println(map);
        }
        System.out.println("Frequence of subarray"+ans);
    }
}
