public class TestMax  {
    /** Main Method */
    public static void main(String[] args) {
        int i = 5;
        int j  = 2;
        int k =  max(i, j); // invoke max
        
        System.out.println("The maxium of "  + i + " and " + j + "  is " + k);
    }

    /** Return the max of two nums */
    public static int max(int num1, int num2) {
        int result; // undefined

        if (num1 > num2)
            result = num1;
        else
            result = num2;
        
        return result;
    }
}