package ie.tudublin;

// recursion = code calling itself within code (example here is the change function)
public class RecursiveString {
    public static void reverse(char[] string, int i)
    {
        int l = string.length-1; // giving string length a shorter integer
        if (i == l/2) // ensures that the array stops once i reaches the midway point of the array
            return;
        change(string, i, l-i);
        reverse(string, i+1);
    }
    // changes the start and end of the array with each other
    public static void change(char []arr, int i, int j)
    {
        char temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        char[] string = "Hello World 2".toCharArray();
        reverse(string, 0);
        System.out.println(String.valueOf(string));
    }
}
