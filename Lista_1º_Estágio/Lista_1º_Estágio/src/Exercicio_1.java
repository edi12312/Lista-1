import java.util.Scanner;
public class Exercicio_1 {

public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int sal�rio;
	int perc_aumento;
	double valor_aumento;
	double new_sal�rio;
	
	System.out.println("Insira sal�rio: ");
    sal�rio = ler.nextInt();
    System.out.println("Insira o percentual de aumento");
    perc_aumento = ler.nextInt();
    
    valor_aumento = (sal�rio/100)* perc_aumento;
    new_sal�rio = sal�rio + valor_aumento;
    
    System.out.println("Valor aumento: " + valor_aumento);
    System.out.println("Novo sal�rio: "+ new_sal�rio);
    
    
    ler.close();
}
}
