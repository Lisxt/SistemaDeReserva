package Reserva;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//objetos
		SistemaReserva sistema = new SistemaReserva();
		System.out.printf("\n*-------------------------------------------------------------------*\n");
		
		System.out.printf("\nEntre com as infomações necessárias\n");
		
		System.out.printf(" Insira o Nome:");
		String nome = sc.next();

		System.out.printf(" Insira o CPF:");
		String cpf = sc.next();
		
		System.out.printf(" Insira o ano de nascimento:");
		int nascimento = sc.nextInt();
		
		System.out.printf("\n*-------------------------------------------------------------------*\n");
		
		Hospede hospede = new Hospede(nome, cpf, nascimento);
		
		sistema.ExibirQuartos();
		System.out.printf("\n*-------------------------------------------------------------------*\n");
		
		System.out.println("Digite o número do quarto que deseja reservar:");
        int numeroQ = sc.nextInt();
        
        sistema.reservarQuarto(hospede, numeroQ);
        
        sistema.ExibirQuartos();
        System.out.printf("\n*-------------------------------------------------------------------*\n");
        
        System.out.println("Deseja cancelar a reserva? 1-sim ou 2-não.");
        int r = sc.nextInt();
        if(r == 1){
        	 System.out.println("Digite o número do quarto que deseja cancelar a reserva:");
             numeroQ = sc.nextInt();
        	 sistema.cancelarReserva(numeroQ);
        	 sistema.ExibirQuartos();
        }else {
        	  sistema.ExibirQuartos();
        	  sc.close();
        }
        System.out.printf("\n*-------------------------------------------------------------------*\n");
        
}
	
//	System.out.printf("\nInformações do quarto que deseja\n");
//	System.out.printf(" Insira o Numero:");
//	int numero = sc.nextInt();
	
//	System.out.printf(" Escolha um Tipo de quarto:\n 1-Standard\n 2-Master\n 3-Deluxe");
//	String tipoQuarto = sc.next();
//	sc.close();
//	System.out.printf("\n*----------------------------*\n");
	
//	Hospede hospede = new Hospede(nome, cpf, nascimento);
//	hospede.exibir();
	
//	Quarto quarto = new Quarto(numero, tipoQuarto, 0);
//	quarto.exibir();
}
