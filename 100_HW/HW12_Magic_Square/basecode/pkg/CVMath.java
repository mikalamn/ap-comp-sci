package pkg;

	public class CVMath {    
    // Method to find the mid value (already provided)
    public static int findMid(int one, int two, int three) {
        return (one + two + three - Math.min(one, Math.min(two, three)) - Math.max(one, Math.max(two, three)));
    }
    
    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    // Method to print the first n special squares
    public static void specialSquare(int n) {
        int count = 0;
        int k = 1;
        
        while (count < n) {
            // Sum of first k numbers: k * (k + 1) / 2
            int sum = k * (k + 1) / 2;
            
            // Check if the sum is a perfect square
            if (isPerfectSquare(sum)) {
                System.out.println(sum); // print the special square
                count++;
            }
            k++;
        }
    }
}


