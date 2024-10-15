import java.util.*;

public class mock_exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find the number with the maximum frequency
        int result = findMaxFrequency(arr);
        
        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
    
    public static int findMaxFrequency(int[] arr) {
        // Count the frequency of each number in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Initialize variables to store maximum frequency and the corresponding number
        int maxFrequency = 0;
        int maxFrequencyNumber = Integer.MAX_VALUE; // Initialize with max value of integer
        
        // Iterate through the frequency map
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            
            // If the current frequency is greater than the maximum frequency encountered so far,
            // update the maximum frequency and the corresponding number
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyNumber = number;
            } else if (frequency == maxFrequency) {
                // If there are multiple numbers with the same maximum frequency, choose the smallest one
                maxFrequencyNumber = Math.min(maxFrequencyNumber, number);
            }
        }
        
        return maxFrequencyNumber;
    }
}