package cliente;

public class Remetente extends Cliente{
		
	public Remetente(String nomeCompleto, String endereco, int rg, Long cpf, String email, int telefone, int codigoRastreamento) {
		super.nomeCompleto = nomeCompleto;
		super.endereco = endereco;
		super.rg = rg;
		super.cpf = cpf;
		super.email = email;
		super.telefone = telefone;
		super.codigoRastreamento = codigoRastreamento;
	}
	
	public void VisualizarEncomendas() {
		System.out.println("Nome Completo : " + getNomeCompleto() + " CPF: " + getCpf() + " Código Rastreio: " + getCodigoRastreamento()); 
	}
}
