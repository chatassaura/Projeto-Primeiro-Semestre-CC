package cliente;

import java.util.Scanner;

public abstract class Cliente{
	//Atributos semelhantes entre destinatario e remetentes
	protected String nomeCompleto;
	protected int rg;
	protected Long cpf;
	protected String endereco;
	protected String email;
	protected int telefone;	
	protected int codigoRastreamento;
	
	Scanner leitor = new Scanner(System.in);
	
	//Metodos
	public void MostrarCliente() {
		System.out.println("Nome Completo : " + getNomeCompleto() + "Endereço: "+ getEndereco() + "\nRG: " + getRg()+ "\nCPF: " + getCpf() 
		+ "\nEmail: " + getEmail() + "\nTelefone: " + getTelefone());
	}
	
	public void alterarCliente() {
		System.out.println("Digite novo Nome Completo: ");
		setNomeCompleto(leitor.next());
		System.out.println("Digite novo Endereço Completo: ");
		setEndereco(leitor.next());
		System.out.println("Digite novo RG: ");
		setRg(leitor.nextInt());
		System.out.println("Digite novo CPF: ");
		setCpf(leitor.nextLong());
		System.out.println("Digite novo Email: ");
		setEmail(leitor.next());
		System.out.println("Digite novo Telefone: ");
		setTelefone(leitor.nextInt());
	}
	
	//get and set
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCodigoRastreamento() {
		return codigoRastreamento;
	}
	public void setCodigoRastreamento(int codigoRastreamento) {
		this.codigoRastreamento = codigoRastreamento;
	}
		
}
