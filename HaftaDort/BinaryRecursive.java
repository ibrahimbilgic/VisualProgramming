package HaftaDort;

public class BinaryRecursive {
    public static void main(String[] args) {
        int[] list = {1,2,3,5,7,8,9,10};
        int key = 7;
        int low = 0;
        int up = list.length;
        int result = recursiveBinary(list,low,up-1,key);
        System.out.println(result);
    }
    public static int recursiveBinary(int[] list,int low, int up, int key){

        if(up>=low && low<list.length){
            int mid = low + (up - low) / 2;
            if(list[mid] == key){
                return mid;
            }
            if(list[mid]>key){
                return recursiveBinary(list, low, mid - 1, key);
            }
            return recursiveBinary(list, mid + 1, up, key);
        }

        return -1;
    }
}
