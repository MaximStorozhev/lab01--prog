import java.util.Arrays;
public class lab000 {
    public static void main(String[] args) {
        byte i;
        byte j = 0;
        short[] a = new short[9];
        for (i = 4; i < 21; i++) {
            if (i % 2 == 0) a[j] = i;
            else j++;
        }
        for (int k = a.length - 1; k >= 0; k--) {
            System.out.print(a[k] + " ");

        }

        float[] x = new float[11];
        for (i = 0; i < 11; i++) x[i] = (float) (Math.random() * 17) - 4;

        System.out.println();
        System.out.println(Arrays.toString(x));


        double[][] p = new double[9][11];
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 11; j++) {
                switch (a[i]) {
                    case 16:
                        p[i][j] = Math.asin(Math.sin(Math.cos(Math.cos(Math.log(Math.abs(x[j]))))));
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 14:
                        p[i][j] = Math.asin(Math.E * Math.pow(-Math.pow(Math.abs(x[j])/5,x[j]),1/3));
                        break;
                    default:
                        p[i][j] = Math.pow((Math.pow(Math.asin(1 / Math.pow(Math.exp(1), Math.abs(x[j]))), 1 / 3) + 2) / 2 / 3, 3);
                        break;
                }
                System.out.printf("%.4f ", p[i][j]);
            }

        }

    }

}

