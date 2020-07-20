import java.util.Scanner;
public class highest {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int i,j,a[],n;
		a = new int[100];
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		j=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i+1]>a[i])
			{
				j=a[i+1];

			}

		}
			System.out.print(j);


	}

}