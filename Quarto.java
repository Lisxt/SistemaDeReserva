package Reserva;

public class Quarto {
//atributos 
	private int numero;
	private String tipoQuarto;
	private double preco;
	private boolean disponivel;
//contrutor
	public Quarto(int numero, String tipoQuarto, double preco) {
	    this.numero = numero;
	    this.tipoQuarto = tipoQuarto;
	    this.preco = preco;
	    this.disponivel = true; // O quarto está disponível ao ser criado
	}
//metodos de acesso
	//get - permitir que outras partes do código leiam o valor da variável sem permitir alterações diretas
	
	public int getNumero() {
		return numero;
	}
	public String getTipoQuarto() {
		return tipoQuarto;
	}
	public double getPreco() {
		return preco;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	//set - usado para modificar o valor de uma variável privada.
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//public void setTipoQuarto(String tipoQuarto) {
	//	this.tipoQuarto = tipoQuarto;
	//}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public String toString() {
        return "Quarto " + "numero=" + numero + ", tipo='" + tipoQuarto + '\'' + ", preco=" + preco;
       }
}