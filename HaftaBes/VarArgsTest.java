package HaftaBes;

public class VarArgsTest {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));//çoklu arguman
        System.out.println(sum(1));// tek arguman

        System.out.println(sum());//arguman olmadığında

    }
    public static int sum(int... nums){
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        return sum;
    }
}
