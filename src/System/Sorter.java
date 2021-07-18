package System;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Sorter {

    public void mergeSort(Tuple[] array){

        Tuple[] temp = new Tuple[array.length];

        int start = 0;

        int end = array.length -1;

        mergeSortAux(array, start, end, temp);

    }

    public void mergeSortAux(Tuple[] array, int start, int end, Tuple[] temp){

        if(start != end){

            int mid = (start+end)/2;

            mergeSortAux(array, start, mid, temp);
            mergeSortAux(array, mid+1, end, temp);

            mergeArrays(array, start, mid, end, temp);

            for (int i = start; i < end+1; i++){

                array[i] = temp[i];

            }

        }

    }

    public void mergeArrays(Tuple[] a, int start, int mid, int end, Tuple[] temp){

        int ia = start;
        int ib = mid+1;
        for (int k = start; k < end+1; k++){

            if(ia > mid){

                temp[k] = a[ib];
                ib++;

            }
            else if(ib > end){

                temp[k] = a[ia];
                ia++;

            }
            else if((int)a[ia].getSecond() <= (int)a[ib].getSecond()){

                temp[k] = a[ia];
                ia ++;

            }
            else{

                temp[k] = a[ib];
                ib++;

            }

        }

    }

//    public static void main(String[] args) {
//
//        System.Tuple[] test = new System.Tuple[5];
//
//        System.Tuple t1 = new System.Tuple(3, 7);
//        System.Tuple t2 = new System.Tuple(2, 1);
//        System.Tuple t3 = new System.Tuple(8, 3);
//        System.Tuple t4 = new System.Tuple(9, 6);
//        System.Tuple t5 = new System.Tuple(1, 2);
//
//        test[0] = t1;
//        test[1] = t2;
//        test[2] = t3;
//        test[3] = t4;
//        test[4] = t5;
//
//        System.Sorter sort = new System.Sorter();
//        sort.mergeSort(test);
//
//        for(int i = 0; i < test.length; i++){
//
//            System.out.println(test[i].getSecond());
//
//        }
//        System.out.println("-----------------------------------");
//
//        for(int j = test.length-1; j > test.length - 4; j--){
//
//            System.out.println(test[j].getSecond());
//
//        }
//
//    }

}
