
import java.util.Scanner;
public class Solution {
    public int maximumGain(String name, int firstValue, int secondValue) {
        int totalGain = 0;
        String pattern = "ab|ba";

        while (name.contains("ab") || name.contains("ba")) {
            String modifiedName = name.replaceAll(pattern, "");
            int gain = (name.length() - modifiedName.length()) / 2;

            if (firstValue >= secondValue) {
                totalGain += gain * firstValue;
            } else {
                totalGain += gain * secondValue;
            }

            name = modifiedName;
        }

        return totalGain;
    }
}

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.maximumGain(name, firstValue, secondValue);
        System.out.println(result);
    }
}
