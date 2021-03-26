package HaftaIki;
import java.math.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class MathLib {
    public static void main(String[] args) {
        System.out.print(Math.ceil(2.1));
        System.out.print(Math.floor(2.1));

        System.out.println(Math.abs(-15.0));//mutlak değer
        System.out.println(Math.signum(15.0));//

        //Java en  büyük değere 1 eklediğinde en küçük sayıyı veriyor
        
        System.out.println(Math.random());
        
        System.out.println(10+(int)(Math.random()*5));

        Random random = new Random();
        System.out.println(random.nextInt(100));//0 ile 100 arasında rastgele sayılar
        System.out.println(random.nextDouble());//0-1 arası double değerler

        //Multithread durumlarda kullanılması gereken random sınıfı
        int rand = ThreadLocalRandom.current().nextInt(100);// 0-100 arası türetir
        int rand2 = ThreadLocalRandom.current().nextInt(50,100);//50-100 arası sayı üretir..


    }
    
}
