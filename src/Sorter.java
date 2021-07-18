import java.util.ArrayList;

public class Sorter {

    public void mergeSort(int[] array){

        int[] temp = new int[array.length];

        int start = 0;

        int end = array.length -1;

        mergeSortAux(array, start, end, temp);

    }

    public void mergeSortAux(int[] array, int start, int end, int[] temp){

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

    public void mergeArrays(int[] a, int start, int mid, int end, int[] temp){

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
            else if(a[ia] <= a[ib]){

                temp[k] = a[ia];
                ia ++;

            }
            else{

                temp[k] = a[ib];
                ib++;

            }

        }

    }

}
