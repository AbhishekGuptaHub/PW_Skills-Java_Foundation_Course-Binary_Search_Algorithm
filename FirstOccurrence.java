import java.util.Scanner;

public class FirstOccurrence
{
    static int firstOccurrence(int [] arr, int target)
    {
        int low = 0, high = arr.length - 1, mid, index = -1;

        while (low <= high)
        {
            mid = low + (high - low) / 2;

            if (arr[mid] == target)
            {
                index = mid;
                high = mid - 1;
            }
            else if (arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of elements in an array: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter all the elements of the array below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.print("Enter element whose first occurrence is to be found: ");
        target = sc.nextInt();

        System.out.println("Required first occurrence is at index: " + firstOccurrence(arr, target));
    }
}
