import static java.util.Collections.swap;

public class Sorter {

    public void quick_sort(int[] list){

        int start = 0;
        int end = list.length -1;
        quick_sort_aux(list, start, end);

    }

    private void quick_sort_aux(int[] list, int start, int end) {

        if(start < end){

            int boundary = partition(list, start, end);
            quick_sort_aux(list, start, boundary-1);
            quick_sort_aux(list, boundary+1, end);

        }

    }

    private int partition(int[] list, int start, int end){

        int mid = (start+end)/2;
        int pivot = list[mid];
        swap(list, start, mid);

    }

//    private void swap(int first, int second){
//
//        int temp;
//        temp = first;
//        first = second;
//        second = temp;
//
//    }

//    public static void main(String[] args) {
//
//        int list[] = {6,8,1,3,2,10};
//
//        System.out.println(list);
//
//        Sorter sort = new Sorter();
//
//        Sorter.sort(list, 0, list.length -1);
//
//        System.out.println(list);
//
//    }

}
