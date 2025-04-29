package org.example;

public class Eexam06 {
    public static void main(String[] args){
        int sum=0;

        for(int i=100; i < 300; i++ ){
            if(i%5==0||i%7==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
