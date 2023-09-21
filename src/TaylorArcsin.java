public class TaylorArcsin {
    public double returnTaylorArcsin (int numberK, double numberX)
    {
        double eps = 1 / Math.pow(10, numberK * 2);
        double element = numberX;
        double arcsinus = numberX;
        int i = 1;
        while (Math.abs(element) > eps) {
            element = element * (2 * i - 1) * numberX * numberX / (2 * i);
            arcsinus = arcsinus + element / (2 * i + 1);
            i++;
        }

        return arcsinus;
    }
}
