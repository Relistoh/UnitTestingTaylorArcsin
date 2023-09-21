import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter k (accuracy):");

        int numberK = in.nextInt();

        System.out.println("Enter x (-1, 1) to calculate arcsin(x):");

        double numberX = in.nextDouble();

        TaylorArcsin a = new TaylorArcsin();

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(numberK);
        System.out.println(formatter.format(a.returnTaylorArcsin(numberK, numberX)));
        System.out.println(formatter.format(Math.asin(numberX)));
    }
}