import java.util.Scanner;

public class MinimumInRotatedSortedArray
{
    static int minimumElement(int [] arr)
    {
        int low = 0, high = arr.length - 1, mid, minEle = -1;

        while (low <= high)
        {
            mid = low + (high - low) / 2;

            if (arr[mid] > arr[high])
            {
                low = mid + 1;
            }
            else
            {
                minEle = arr[mid];
                high = mid - 1;
            }
        }

        return minEle;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of elements in a rotated sorted array: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter all the elements of the array below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum Element in the array: " + minimumElement(arr));
    }
}
