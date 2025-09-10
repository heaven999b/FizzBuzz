package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);

        int count2 = multiples(50, 2, 7);
        System.out.println(count2);
    }

    public static int multiples(int n, int a, int b) {
        int su = 0;
        for (int i = 1; i < n; i++) {
            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB) {
                su++;
            }
        }
        return su;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
