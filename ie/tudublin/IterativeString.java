package ie.tudublin;

// Iterative functions loop to repeat some code
public class IterativeString {
    public static void reverseString(String string)
    {
        char temp;
        int i = 0;
        int j = 0;
        char []ch = string.toCharArray();

        for(i=0, j=string.length()-1; i<j; i++, j--)
        {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        System.out.println(ch);
    }

    public static void main(String[] args)
    {
        String string = "Hello World";
            reverseString(string);
    }
}
