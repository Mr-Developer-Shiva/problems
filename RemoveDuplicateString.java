import java.util.Arrays;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        int[] arr = {7,3,2,6,4,5,1};
        System.out.println(Arrays.toString(alterDuplicate(arr)));
    }

    static int[] alterDuplicate(int[] arr)
    {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int left = 0 , right = arr.length -1;

        boolean is = true;

        for(int i = 0 ; i < arr.length ;i++)
        {
            if(is) result[i] = arr[right--];
            else result[i] = arr[left++];
            is = !is;
        }

        return result;
    }
}
