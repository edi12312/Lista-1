import java.util.Scanner;

public class ex3 {
	
	public void multTable()
	{
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.printf("Forneça o numero: \n");
		number = input.nextInt();
		
		for(int i = 0; i <= 9; i++)
		{
			System.out.printf("%s" + "x" + "%s " + "= " + "%s", i, number, i*number);
			System.out.println();
		}
		
		input.close();
		
	}

}
