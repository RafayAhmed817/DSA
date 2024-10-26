package DSA_Lab01;

import java.util.Arrays;

public class Lab_01_Task03{
    public static void main(String[] args){
        int array[]={55,56,57,58,59};
        int start=0;
        int end=array.length-1;
        int temp=0;
        while(start<end){
        temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        start++;
        end--;
        }
    System.out.println(Arrays.toString(array));
    }

}

