import java.util.Scanner;


public class Ex4_correção {

public static void main(String[] args) {
	

    
	Scanner ler = new Scanner(System.in);
    String name;
	int salario;
	double valor_aumento;
	double new_salario;
	
	System.out.print("Insira o nome do empregado\n");
        name = ler.nextLine();

	while(!("fim".equals(name)))	
        {	
         
        System.out.println("Insira salario: ");   
        salario = Integer.parseInt(ler.nextLine());
   
    
    if (salario>0){
    
    if (salario<500){
        
    valor_aumento = (salario/100)* 20;
    new_salario = salario + valor_aumento;
    System.out.println("Valor aumento: " + valor_aumento);
    System.out.println("Novo salario: "+ new_salario);
     }
         else {
    	    System.out.println("Você não tem direito a aumento.");
    	   
         }
    }
    
     System.out.print("Insira o nome do empregado\n");
     name = ler.nextLine();
    
    
   }
    ler.close();
    }
  
}
