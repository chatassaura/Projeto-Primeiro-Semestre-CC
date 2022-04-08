package encomenda;

import java.util.Scanner;

public class Objeto {	
	
	//Atributos dos Objeto 
	private String tipo;
	private double peso;
	private double Largura;
	private double altura;
	private double comprimento;
	private double codigoRastreamento;
	private String ultimaLocalizacao;
	
	Scanner leitor = new Scanner(System.in);
	
	public Objeto(String tipo, double peso, double largura, double altura, double comprimento, int codigoRastreamento, String ultimaLocalizacao) {
		this.tipo = tipo;
		this.peso = peso;
		this.Largura = largura;
		this.altura = altura;
		this.comprimento = comprimento;
		this.codigoRastreamento = codigoRastreamento;
		this.ultimaLocalizacao = ultimaLocalizacao;
	}
	
	public void alterarObjeto() {
		System.out.println("Digite o Novo tipo: ");
		setTipo(leitor.next());
		System.out.println("Digite o Novo Peso: ");
		setPeso(leitor.nextDouble());
		System.out.println("Digite a Nova Largura: ");
		setLargura(leitor.nextDouble());
		System.out.println("Digite a Nova Altura: ");
		setAltura(leitor.nextDouble());
		System.out.println("Digite o Novo Comprimento: ");
		setComprimento(leitor.nextDouble());
	}
	
	public void MostrarProduto() {
		System.out.println("Tipo do Produto: " + getTipo() + "\nPeso: " + getPeso() + "\nAltura: " + getAltura() + "\nComprimento: "
				+ getComprimento() + "\nLargura: " + getLargura());
	}
	

	//Atributos dos Geters and seters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getLargura() {
		return Largura;
	}
	
	public void setLargura(double largura) {
		Largura = largura;
	}
	
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getCodigoRastreamento() {
		return codigoRastreamento;
	}

	public void setCodigoRastreamento(double codigoRastreamento) {
		this.codigoRastreamento = codigoRastreamento;
	}

	public String getUltimaLocalizacao() {
		return ultimaLocalizacao;
	}

	public void setUltimaLocalizacao(String ultimaLocalizacao) {
		this.ultimaLocalizacao = ultimaLocalizacao;
	}
	
	
}
