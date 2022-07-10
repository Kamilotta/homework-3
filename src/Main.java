
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = -20 + random.nextDouble() * 40;
            System.out.printf("%.2f   ",array[i]);
        }

        System.out.println();

        double sum = 0;
        int n = 0;
        for (double curI : array) {
        if (curI<0) {
            continue;

        }
          for(double posI:array){
            if(posI>0) {
                n++;
                sum += posI;
            }
            }

        }

        System.out.printf("%.2f ", sum / n);
        System.out.println("\n-----------------------");


        for (int i = 1; i < array.length; i++) {
            if(array[i]<array[i-1]){
                double temp=array[i];
                array[i]=array[i-1];
            array[i-1]=temp;
                 System.out.println(Arrays.toString(array));
            }
        }









    }
}

