package Reserva;
import java.util.ArrayList;
public class SistemaReserva {
	
	private ArrayList<Quarto> quartos;

	public SistemaReserva() {
		 quartos = new ArrayList<>();
	        // Adicionando quartos pré-definidos
	        quartos.add(new Quarto(101, "Simples", 150.0));
	        quartos.add(new Quarto(102, "Luxo", 300.0));
	        quartos.add(new Quarto(103, "Premium", 500.0));
	}
	public void reservarQuarto(Hospede hospede, int numeroQ) {
		 if (hospede.verificarMaiorIdade()) {
	            for (Quarto quarto : quartos) {
	                if (quarto.getNumero() == numeroQ) {
	                    if (quarto.isDisponivel()) {
	                        quarto.setDisponivel(false);
	                        System.out.println("Reserva realizada com sucesso para o hóspede " + hospede.getNome() + " no quarto " + numeroQ);
	                    } else {
	                        System.out.println("Desculpe, o quarto " + numeroQ + " já está reservado.");
	                    }
	                    return;
	                }
	            }
	            System.out.println("Quarto não encontrado.");
	            return;
	        } else {
	            System.out.println("O hóspede precisa ter mais de 18 anos para realizar uma reserva.");
	        }
	}
	public void cancelarReserva(int numeroQ) {
		for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQ) {
                if (!quarto.isDisponivel()) {
                    quarto.setDisponivel(true);
                    System.out.println("Reserva do quarto " + numeroQ + " foi cancelada.");
                } else {
                    System.out.println("O quarto " + numeroQ + " não está reservado.");
                }
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
	}
	public void ExibirQuartos() {
        System.out.println("Quartos disponíveis:");
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                System.out.println(quarto);
            }
        }
    }
}
