import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Pair {
    int val;
    int idx;

    Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

public class LargestArea_Histogram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) arr[i] = Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
    }
}

class Solution {
    public long maximumArea(long hist[], long n) {
        ArrayList<Integer> left = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < hist.length; i++) {
            while (!stack.isEmpty() && hist[i] <= hist[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                left.add(-1);
            } else {
                left.add(stack.peek());
            }
            stack.push(i);
        }

        ArrayList<Integer> right = new ArrayList<>();
        stack.clear();

        for (int i = hist.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && hist[i] <= hist[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                right.add((int) n);
            } else {
                right.add(stack.peek());
            }
            stack.push(i);
        }

        Collections.reverse(right);

        long maxArea = 0;

        for (int i = 0; i < n; i++) {
            long width = right.get(i) - left.get(i) - 1;
            long area = width * hist[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}

