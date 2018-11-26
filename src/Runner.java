public class Runner {
    public static void main(String args[]) {
        double[][] view;
        double[] scanned = new double[15];
        for (int i = 0; i < scanned.length; i++)
        {
            scanned[i]=Math.random()*12;
        }

        new projection= new skyView(8, 9, scanned);

    }
}
