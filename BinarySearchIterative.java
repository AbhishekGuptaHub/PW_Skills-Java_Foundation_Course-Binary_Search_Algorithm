import java.util.Scanner;

public class BinarySearchIterative
{
    static boolean binarySearch(int [] arr, int target)
    {
        int left = 0, right = arr.length - 1, mid;

        while (left <= right)
        {
            mid = left + (right - left) / 2;

            if (arr[mid] == target)
            {
                return true;
            }
            else if (arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return false;
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

        if (binarySearch(arr, target))
        {
            System.out.println("Element found in the given array!");
        }
        else
        {
            System.out.println("Element not found in the given array!");
        }
    }
}
