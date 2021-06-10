public class Complex extends Number{
    private double real;
    private double imaginary;
    private static int complexCount = 0;

    public Complex(double real){
        this(real, 0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        complexCount++;
    }
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public static int getComplexCount() {
        return complexCount;
    }

    public Complex plus(Complex c){
        double resultReal = this.real + c.real;
        double resultImaginary = this.imaginary + c.imaginary;
        return new Complex(resultReal, resultImaginary);
    }

    public Complex minus(Complex c) {
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    public Complex times(Complex c) {
        return new Complex(this.real*c.real - this.imaginary * c.imaginary, this.real * c.imaginary + this.imaginary * c.real);
    }

    public double magnitude(){
        return Math.sqrt(real*real + imaginary*imaginary);
    }

    @Override
    public String toString(){
        if(imaginary < 0)
            return "(" + real + " - " + Math.abs(imaginary) + "i)";
        else
            return "(" + real + " + " + imaginary + "i)";
    }

    @Override
    public boolean equals(Object o){
        if(o == null)
            return false;
        else if(o == this)
            return true;
        else if(!(o instanceof Complex))
            return false;
        else{
            Complex c = (Complex) o;
            return this.real == c.real & this.imaginary == c.imaginary;
        }
    }

    @Override
    public int intValue() {
        return (int) getReal();
    }

    @Override
    public long longValue() {
        return (long) getReal();
    }

    @Override
    public float floatValue() {
        return (float) getReal();
    }

    @Override
    public double doubleValue() {
        return (double) getReal();
    }
}