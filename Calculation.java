public class Calculation {

    public void sum(int a, int b) {
        System.out.println("The sum is : " + (a + b));
    }

    public void difference(int a, int b) {
        int difference;
        difference = a - b;
        System.out.println("The difference is: " + Math.abs(difference));
    }

    public double average(int[] arr) {
        int sum = 0;
        double average;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = this.avgCalculator(sum, arr.length);
        return average;
    }

    private double avgCalculator(int sum, int arrayLength) {
        return sum / arrayLength;
    }
}
