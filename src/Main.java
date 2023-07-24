import java.util.Scanner;
public class Main {
    public static void countPrime(int n )
    {
        int count=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(i==n/i)
                {
                    count++;
                }
                else {
                    count+=2;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int num=scanner.nextInt();
        if(num==0 || num==1)
        {
            System.out.println(0);
        }
        else
        {
            countPrime(num);

        }
    }
}