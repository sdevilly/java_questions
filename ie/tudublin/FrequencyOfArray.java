package ie.tudublin;

public class FrequencyOfArray {

    public static void Frequency(int[] array)
    {
        int maxcount = 0;
        int number = 0;
        int temp = 0;
        for(int i=0; i<array.length; i++) {
            int count = 0;
            for (int j=0; j<array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                number = array[i];
            }
            // else if (count == maxcount){
            //     temp = number;
            //     number = array[i];
            // }
        }
        
        System.out.println("Most frequent number in this array is: "+number+ /*+temp+*/ " and it appears " +maxcount+ " times.");
        
    }
    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 9, 9 };
        Frequency(array);
        }
    }