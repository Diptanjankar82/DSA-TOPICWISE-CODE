import java.util.Scanner;

public class Prom {
    public int maximumGain(String name, int firstValue, int secondValue) {
        int totalGain = 0;
        int abCount = 0;
        int baCount = 0;

        for (char c : name.toCharArray()) {
            if (c == 'a') {
                if (baCount > 0) {
                    baCount--;
                    totalGain += secondValue;
                } else {
                    abCount++;
                }
            } else if (c == 'b') {
                if (abCount > 0) {
                    abCount--;
                    totalGain += firstValue;
                } else {
                    baCount++;
                }
            }
        }

        return totalGain;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String name = scanner.nextLine();

        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();

        Prom solution = new Prom();
        int result = solution.maximumGain(name, firstValue, secondValue);
        System.out.println("Maximum gain: " + result);

        scanner.close();
    }
}


