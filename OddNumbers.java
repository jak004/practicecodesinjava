import java.util.ArrayList;

public class OddNumbers{
    public static void main(String[] args) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        
        // Collect odd numbers between 0 and 10
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                oddNumbers.add(i);
            }
        }
        
        // Print collected odd numbers
        System.out.println("Odd numbers:");
        for (int num : oddNumbers) {
            System.out.println(num);
        }
        
        // Sort odd numbers in descending order using bubble sort
        for (int i = 0; i < oddNumbers.size() - 1; i++) {
            for (int j = 0; j < oddNumbers.size() - i - 1; j++) {
                if (oddNumbers.get(j) < oddNumbers.get(j + 1)) {
                    // Swap elements
                    int temp = oddNumbers.get(j);
                    oddNumbers.set(j, oddNumbers.get(j + 1));
                    oddNumbers.set(j + 1, temp);
                }
            }
        }
        
        // Print sorted odd numbers
        System.out.println("Sorted odd numbers in descending order:");
        for (int num : oddNumbers) {
            System.out.println(num);
        }
    }
}
