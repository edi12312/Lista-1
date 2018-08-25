import java.util.Scanner;
public class Exercicio_2 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float num;
		int x;
		
		x = 1;
		
		while (x<=10) {
		
			System.out.println("Insira número: ");
	        num = read.nextInt();
		    if (num!=0){
		     num = (num%2);
		       if (num!=0){
	            System.out.println("Impar");}
		        else {
	            System.out.println("Par");
		}
        }
     x++;}
   read.close();	
    }	
}

