package HaftaDort;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1,2,23,43,532};
        int key = 23;
        int val = linearSearch(list,key);
        System.out.println("---> "+val);
    }
    public static int linearSearch(int[] list,int key){
        for(int i=0;i<list.length;i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }
}
