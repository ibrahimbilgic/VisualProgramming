package HaftaDort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1,23,42,53,65,76,87};
        int key = 76;
        
        int num = binarySearch(list,key);
        System.out.println(num);
    }
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int up = list.length-1;

        while(low <= up){
            int mid = (low+up) / 2;
            if(key < list[mid]){
                up = mid - 1;
            }
            else if(key == list[mid]){
                return mid;
            }
            else{
                low = mid + 1;
            }
        
        }
        return -1;  
        // eğer olmayan sayının hangi sayılar 
        // arasında yer alabileceğini merak ediyorsak 
        // return -low-1; olmalı....
    }
}
