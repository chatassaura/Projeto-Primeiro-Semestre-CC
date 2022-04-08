package sistema;

import java.util.Scanner;

public class SistemaVerificacao {	
	private String[] usuarios = new String[2]; 
	private int[] senhas = new int[2];
	Scanner leitor = new Scanner(System.in);
	
	public SistemaVerificacao(){
		this.usuarios[0] = "admin";
		this.usuarios[1] = "Fernanda";
		this.senhas[0] = 1234;
		this.senhas[1] = 245762;
	}

	public boolean verificaçãoLogin (String usuario, int senha, boolean logado){
		if(logado == true) {
			return true;
		}else {
			for (int i=0;i<usuarios.length;i++) {
				if(usuario.equals(this.usuarios[i]) && senha == this.senhas[i]) {
					return true;
				}
			}
		}
		return false;
		
	}
}
