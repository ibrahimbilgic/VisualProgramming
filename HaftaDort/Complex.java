package HaftaDort;

public class Complex {
    private double real;
    private double imaginary;
     
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    // Setter - Mutator
    public void setReal(double real){
        this.real = real;
    }
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
    // Getter - Accessor
    public double getReal() {
        return real; //this.real
    }
    public double getImaginary() {
        return imaginary; //this.imaginary
    }
    public Complex plus(Complex other){
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal,sumImaginary);
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Complex)){
            return false;
        }
        Complex c = (Complex)obj;
        return this.real == c.real && this.imaginary == c.imaginary;
    }
    @Override
    public String toString(){
        return this.real + " + " + this.imaginary + "i ";
    }
    public static void main(String[] args) {
        Complex a = new Complex(1.0,2.0);
        Complex b = new Complex(2.0,-1.0);
        Complex c = a.plus(b);
        
        boolean isTrue = a.equals(b);
        
        System.out.println(isTrue);
        System.out.println(a.toString());
        System.out.println(b.toString());
        //System.out.println("imaginary: "+c.imaginary +","+" real: "+ c.real);
    }
    
}
