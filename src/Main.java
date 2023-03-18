public class Main {
    static double sum(double[] arr) {
        double total = 0;

        for(int i=0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

    static double kvadSum(double[] arr) {
        double total = 0;

        for(int i=0; i < arr.length; i++) {
            total += arr[i] * arr[i];
        }

        return total;
    }


    public static void main(String[] args) {
        // Skriv två metoder, sum och kvadSum, som returnerar summan respektive summan av kvadraterna

        double[] arr = {2.5, 1.5, 3.0};

        System.out.println("sum     = " + sum(arr));
        System.out.println("kvadSum = " + kvadSum(arr));
    }
}