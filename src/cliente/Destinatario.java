package cliente;

public class Destinatario extends Cliente{
	
	public Destinatario(String nomeCompleto, String endereco, int rg, Long cpf, String email, int telefone, int codigoRastreamento) {
		super.nomeCompleto = nomeCompleto;
		super.endereco = endereco;
		super.rg = rg;
		super.cpf = cpf;
		super.email = email;
		super.telefone = telefone;
		super.codigoRastreamento = codigoRastreamento;
	}
}
