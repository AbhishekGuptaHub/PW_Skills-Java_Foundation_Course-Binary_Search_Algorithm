import java.util.Scanner;

public class BinarySearchRecursive
{
    static boolean binarySearch(int [] arr, int low, int high, int target)
    {
        if (low > high)
        {
            return false;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
        {
            return true;
        }

        if (arr[mid] > target)
        {
            return binarySearch(arr, low, mid - 1, target);
        }
        else
        {
            return binarySearch(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of elements in a sorted array: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter all the elements of the array below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.print("Enter element to be searched: ");
        target = sc.nextInt();

        if (binarySearch(arr, 0, n - 1, target))
        {
            System.out.println("Element found in the array!");
        }
        else
        {
            System.out.println("Element not found in the array!");
        }
    }
}
