package com.srijani;

import java.util.Arrays;
import java.util.Scanner;

public class Q1RightShiftArrayRotationApproach_02 {


public static void rotate(int[] array , int position)
{
reverse(array , 0 , array.length-1);
reverse(array , 0 , position-1);
reverse(array , position , array.length-1);

}

private static void reverse(int[] array, int start, int end) {

while(start<end)
{
int temp=array[start];
array[start]=array[end];
array[end]=temp;
start++;
end--;
}
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

//int[] array= {8,4,5,3,1};
int[] array = new int[n];

for (int i = 0; i < n; i++) {
array[i] = sc.nextInt();

}

int k = sc.nextInt();
//System.out.println("****before shifting printing*********");
//System.out.println(Arrays.toString(array));

rotate(array,k);

//System.out.println("****after right shifting*********");
System.out.println(Arrays.toString(array));

}

}