public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.0, 2.0, -4.0, -2.0, 3.0, 6.0, -7.0, 1.0, 5.0, -3.0, 4.0, 9.0, -6.0, 0.0, -8.0};


        double sumPositive = 0;

        int countPositive = 0;
        boolean negativeFound = false;

// Проходим по каждому элементу массива
        for (double num : numbers) {

            if (num > 0) {
                if (negativeFound) {
                    sumPositive += num;
                    countPositive++;
                }
            }

            else if (num < 0) {
                negativeFound = true;
            }
        }

        if (countPositive > 0) {
            double averagePositive = sumPositive / countPositive;
            System.out.println("8.0, 2.0, -4.0, -2.0, 3.0, 6.0, -7.0, 1.0, 5.0, -3.0, 4.0, 9.0, -6.0, 0.0, -8.0 = " + averagePositive);
        }
    }
}