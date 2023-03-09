public class Main {
    public static void main(String[] args) {
        int[] values = {1,4,6,7,9,10,24,28,29,43};
        System.out.println(binarySearchAlgorithm(values, 9));
    }
    public static int binarySearchAlgorithm(int[] values, int x){
        //this algorithm only works in a sorted array
        int start = 0;
        int end = values.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if (values[mid] == x){
                return mid;
            } else if ( values[mid] < x) {
                start = mid + 1;
            } else
                end = mid - 1;

        }
        return -1;

    }
}