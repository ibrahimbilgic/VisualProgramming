package HaftaDort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {2,5,1,8,7,6};
        int smallestNum;
        
        for(int i = 0;i<list.length-1;i++){
            int min_index = i;

            for(int j = i+1;j<list.length;j++){
                if(list[j]<list[min_index]){
                    min_index = j;
                }
               
            }
            smallestNum = list[min_index];
            list[min_index] = list[i];
            list[i] = smallestNum;
            
            for (int a : list){
                System.out.print(a);
            }
            System.out.println("\n");
        }
       
    }
}
