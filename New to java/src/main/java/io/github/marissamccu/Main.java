package io.github.marissamccu;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        int a =2147483647;
        short b =32767;
        long e = 2147483648L;
        byte d=127;

        int [] int_array ={1,2,3,5,6,7};
        for(int i=0;i<int_array.length;i++){
            System.out.println(int_array);
        }
        for (int i : int_array){
            System.out.println(i);
        }

        ArrayList<Integer> dyn_list=new ArrayList<>();
        dyn_list.add(1);
        dyn_list.add(2);
        dyn_list.add(7);
        dyn_list.add(42);
        dyn_list.add(65);
        dyn_list.add(67);

        for (int i : dyn_list){
            System.out.println(i);
        }
        for (Integer integer : dyn_list) {
            System.out.println(integer);
        }



    }
}