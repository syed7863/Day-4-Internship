package syed;

public class Pattern6 {

	public static void main(String[] args) {
		for( int i=1;i<=4;i++)
		{
			for(int k=1;k<=3-i+1;k++)
			{
				System.out.println("");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}

	}

}
