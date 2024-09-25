package Reserva;
public class Hospede {
		//atributos 
			private String nome;
			private String cpf;
			private int nascimento;

		//contrutores
			
			public Hospede (String nome) {
				this.nome = nome;
			}
			
			public Hospede (String nome, String cpf, int nascimento) {
				this.nome = nome;
				this.cpf = cpf;
				this.nascimento = nascimento;
			}
				
		//metodos de acesso
			//get - permitir que outras partes do código leiam o valor da variável sem permitir alterações diretas

			public String getNome() {
				return nome;
			}
			public String getCpf() {
				return cpf;
			}
			public int getData() {
				return nascimento;
			}

		//metodos
			public boolean verificarMaiorIdade() {
				int idade = 2024 - nascimento;
				return idade > 18;
		}
}
