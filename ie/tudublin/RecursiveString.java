package ie.tudublin;

// Recursion is when code calls itself within its code. The example here is the swap function.
public class RecursiveString {
    public static void reverseString(char[] string, int i)
    {
        int n = string.length;
        if (i == n/2)
            return;
        swap(string, i, n-i-1);
        reverseString(string, i+1);
    }
    public static void swap(char []arr, int i, int j)
    {
        char temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        char[] string = "This will be reversed".toCharArray();
        reverseString(string, 0);
        System.out.println(String.valueOf(string));
    }
}
