public class TestMatrix {
    public static void main(String[] args) {
        Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};

        IntegerMatrix integerMatrix = new IntegerMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1,m2,integerMatrix.addMatrix(m1,m2),'+');

        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult( m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');

        Complex[][] c1 = new Complex[3][3];
        Complex[][] c2 = new Complex[3][3];

        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[0].length; j++) {
                c1[i][j] = new Complex(i + 1, j + 5);
                c2[i][j] = new Complex(i + 1, j + 6);
            }
        ComplexMatrix complexMatrix = new ComplexMatrix();

        System.out.println("\nc1 + c2 is ");
        GenericMatrix.printResult( c1, c2, complexMatrix.addMatrix(c1, c2), '+');

        System.out.println("\nc1 * c2 is ");
        GenericMatrix.printResult( c1, c2, complexMatrix.multiplyMatrix(c1, c2), '*');
    }

}