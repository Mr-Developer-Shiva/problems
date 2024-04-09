public class alternateDigitSum{
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
    }

    static int alternateDigitSum(int n)
    {
        String str = Integer.toString(n);
        int sum = 0;
        int sign = 1; //Initially positive

        for(int i = 0 ; i < str.length();i++)
        {
            char ch = str.charAt(i);
            int digit = Character.getNumericValue(ch);

           sum = sum + sign * digit ;
           sign = -sign ;
        }
        return sum;
    }
}