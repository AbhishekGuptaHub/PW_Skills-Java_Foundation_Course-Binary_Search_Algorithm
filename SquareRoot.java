import java.util.Scanner;

public class SquareRoot
{
    static int squareRoot(int n)
    {
        int low = 0, high = n, mid, ans = -1;

        while (low <= high)
        {
            mid = low + (high - low) / 2;

            if (mid * mid == n)
            {
                return mid;
            }
            else if (mid * mid < n)
            {
                ans = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();

        System.out.println("Square root: " + squareRoot(n));
    }
}
