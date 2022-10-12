package ie.tudublin;

// iterative = looping to repeat some code (example here is the for loop)
public class IterativeString {
    public static void reverse(String string)
    {
        char temp;
        int i = 0;
        int j = string.length()-1; //giving string length a shorter integer
        char []arr = string.toCharArray(); // separates every character in the string into an array

        // for loop to swap the start and end of the array with each other. i increases and j decreases as the loop goes on
        for(i=0; i<j; i++, j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(arr);
    }

    public static void main(String[] args)
    {
        String string = "Hello World";
        reverse(string);
    }
} 