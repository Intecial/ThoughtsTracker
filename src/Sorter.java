public class Sorter {

    public void quickSort(int[] list){

        int start = 0;
        int end = list.length -1;
        quickSortAux(list, start, end);

    }

    private void quickSortAux(int[] list, int start, int end) {

        if(start < end){

            int boundary = partition(list, start, end);
            quickSortAux(list, start, boundary-1);
            quickSortAux(list, boundary+1, end);

        }

    }

    private int partition(int[] list, int start, int end){

        int mid = (start+end)/2;
        int pivot = list[mid];
        swap(list, start, mid);

        int boundary = start;

        for(int k = start+1; k < end+1; k++){

            if(list[k] < pivot){

                boundary++;
                swap(list, k, boundary);

            }

        }

        swap(list, start, boundary);
        return boundary;

    }

    private void swap(int[] list, int first, int second){

        int temp = list[first];
        list[first] = list[second];
        list[second] = temp;

    }

}
