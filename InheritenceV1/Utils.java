public class Utils {
    public static void disallowNullArgs(Object... args){
        for (Object object : args) {
            if(args == null){
                throw new IllegalArgumentException("Null Arguments");
            }
        }
    }
    public static void disallowZerosAndNegatives(double... args){
        for (double d : args) {
            if(d<=0){
                throw new IllegalArgumentException("Zero or Negative argument");
            }
        }
    }
}
