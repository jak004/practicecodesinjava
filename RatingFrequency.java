public class RatingFrequency {
    public static void main(String[] args) {
        // Array of student ratings
        int[] ratings = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 2, 5, 3, 4, 5, 3, 1};

        // Array to store frequency of each rating (index 0 corresponds to rating 1, index 4 to rating 5)
        int[] frequency = new int[5];

        // Count the frequency of each rating
        for (int rating : ratings) {
            if (rating >= 1 && rating <= 5) {
                frequency[rating - 1]++;
            } else {
                System.out.println("Invalid rating: " + rating);
            }
        }

        // Display the frequency of each rating
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Rating " + (i + 1) + ": " + frequency[i] + " times");
        }
    }

    
}
