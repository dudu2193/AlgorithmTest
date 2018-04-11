package com.xy.myalgorithmtest;

import android.util.Log;

/**
 * Created by Administrator on 2018/4/11.
 */

public class Insertion implements Sorter{
    private static final String TAG = "Insertion";
    @Override
    public int[] sort(int[] array) {
        if (array == null || array.length == 1) return array;
        int key = 1;
        while(key < array.length){

            for(int i = 0;i< key;i++){
                if(array[key] <array[i]){
                    insert(array,key,i);
                }
            }
            key++;
        }
        return array;
    }

    private void insert(int[] arr, int here, int target){          //1 2 3 4 5 6 7 8
        int step = target - here;
        int dir;
        if(step == 0) return;
        if(step >0) {
            dir = 1;
        } else {
            dir = -1;
        }

        while(here != target){
            int temp = arr[here];
            arr[here] = arr[here + dir];
            arr[here + dir] = temp;
            here = here + dir;
        }
    }
}
