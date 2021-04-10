package HaftaBes;


public class FunVarArgs {
    public static void main(String[] args) {
        fun(5,6,5,3,4);
    }
    static void fun(){
        System.out.println(" ");
    }
    static void fun(int i){
        System.out.println(i);
    }
    static void fun(int i,int j){
        System.out.println(i + "" + j);
    }
    static void fun(int i, int j, int... v){
        System.out.println(v[v.length-1]);
    }

}
