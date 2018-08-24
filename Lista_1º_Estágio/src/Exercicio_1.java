import java.util.Scanner;
public class Exercicio_1 {

public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int salário;
	int perc_aumento;
	double valor_aumento;
	double new_salário;
	
	System.out.println("Insira salário: ");
    salário = ler.nextInt();
    System.out.println("Insira o percentual de aumento");
    perc_aumento = ler.nextInt();
    
    valor_aumento = (salário/100)* perc_aumento;
    new_salário = salário + valor_aumento;
    
    System.out.println("Valor aumento: " + valor_aumento);
    System.out.println("Novo salário: "+ new_salário);
    
    
    ler.close();
}
}
