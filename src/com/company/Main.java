package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main m=new Main();
        int[] massiv=new int[20];
        Random r=new Random();
        long startTime;
        long estimatedTime ;
        int k=-100;
        long time1,time2,time3;
        for(int i=0;i<massiv.length;i++){                    // create mas
            massiv[i]=r.nextInt(100);
        }
        System.out.println("massiv");
        for(int i=0;i<massiv.length;i++){
            System.out.print(massiv[i]+" ");
        }
        System.out.println(" ");
        int[] massiv1=massiv.clone();
        System.out.println("massiv1");
        for(int i=0;i<massiv1.length;i++){
            System.out.print(massiv1[i]+" ");
        }
        System.out.println(" ");
        int[] massiv2=massiv.clone();
        System.out.println("massiv2");
        for(int i=0;i<massiv2.length;i++){
            System.out.print(massiv2[i]+" ");
        }
        System.out.println(" ");
        startTime = System.nanoTime();
        m.sortBubble(massiv);                                 // call method bubbleSort
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort: "+estimatedTime);
        time1=estimatedTime;
        startTime = System.nanoTime();
        m.sortSel(massiv1);                                  // call method selectionSort
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("SelectionSort: "+estimatedTime);
        time2=estimatedTime;
        startTime = System.nanoTime();
        Arrays.sort(massiv2);                                // arraysSort
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Arrays.sort: "+estimatedTime);
        time3=estimatedTime;
        System.out.println("");
        ArrayList<Long> arr=new ArrayList<>();
        arr.add(time1);
        arr.add(time2);
        arr.add(time3);
        System.out.println(" Наибольшее время сортировки:"+ Collections.max(arr));
        System.out.println(" Наименьшее время сортировки:"+ Collections.min(arr));




    }

    public void sortBubble(int[] m){
        int k=-100;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length-1;j++){
                if(m[j]>m[j+1]){
                    k=m[j];
                    m[j]=m[j+1];
                    m[j+1]=k;

                }
            }
        }
    }

    public void sortSel(int[] m){
        for(int i=0;i<m.length;i++){
            int min=m[i];
            int k=i;
            for(int j=i+1;j<m.length;j++){
                if(m[j]<min){
                    min=m[j];
                    k=j;
                }
            }
            m[k]=m[i];
            m[i]=min;

        }
    }
}
