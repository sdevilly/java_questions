package ie.tudublin;

public class FrequencyOfArray {

    public static void Frequency(int[] array)
    {
        int maxcount = 0; // counter for most frequent number
        int number = 0; // the number element of the array
        int l = array.length; // giving array length a shorter integer

        // nested for loop to loop through each number element of the array and increase the amount of times a number has been visited.
        for(int i=0; i<l; i++) {
            int count = 0;
            for (int j=0; j<l; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            // if the count is greater than the previous maxcount, it becomes the maxcount and whatever number triggered it becomes the most frequent number in the array.
            if (count > maxcount) {
                maxcount = count;
                number = array[i];
            }
        }
        
        System.out.println("Most frequent number in this array is: "+number+ " and it appears " +maxcount+ " times.");
        
    }
    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 9, 9 };
        Frequency(array);
        }
    }