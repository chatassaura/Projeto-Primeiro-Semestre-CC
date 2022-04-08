package sistema;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import cliente.Destinatario;
import cliente.Remetente;
import encomenda.Objeto;

public class SistemaHermes{


	public static void main(String[] args) {		
		// Entrada de dados
		Scanner leitor = new Scanner(System.in);
		SistemaVerificacao verificacao = new SistemaVerificacao();	
		List<Remetente> remetentes = new ArrayList<>();
		List<Destinatario> destinatarios = new ArrayList<>();
		List<Objeto> objetos = new ArrayList<>();
		Random random = new Random();
		boolean logado = false;
		
		// DADOS PRE CADASTRADOS
		remetentes.add(new Remetente("Fernanda", "Pindamonhangaba 123", 455155483, 42232026850L, "feehssm@live.com", 971040948, 1000));
		destinatarios.add(new Destinatario("Jose Rosa", "Lagoa azul 999", 13151235, 213151132L, "jrmneto@gmail.com", 213564, 1000 ));
		objetos.add(new Objeto("Caixa", 123, 123, 132, 123,1000, "Rua blablabla"));	
		
		remetentes.add(new Remetente("Fernanda","Rua aurora", 455155483, 42232026850L, "feehssm@live.com", 971040948, 2000));
		destinatarios.add(new Destinatario("Jose Rosa","Rua Aurora", 13151235, 213151132L, "jrmneto@gmail.com", 213564, 2000 ));
		objetos.add(new Objeto("Caixa", 123, 123, 132, 123,2000, "Rua blablabla"));	
		
		do{
			//Tela inicial do sistema
			System.out.println("***********HERMES EXPRESS**********");		
			System.out.println("1- Restrear Encomenda \n2- Acessar área do Funcionário \n3- Sair do Sistema \nEscolha a opção desejada: ");
			int opcao = leitor.nextInt();		
			switch(opcao){
				case 1: 
					System.out.println("Insira o código de rastreamento");
					int codPesq = leitor.nextInt();
					boolean encontrou = false;
					
					System.out.println("\n********** CÓDIGO PESQUISADO: " + codPesq + "***********\n");
					
					for(Objeto objeto:objetos){
						if(codPesq == objeto.getCodigoRastreamento()) {
							System.out.println("********** LOCALIZAÇÃO ***********");
							System.out.println(" - " + objeto.getUltimaLocalizacao()+"\n" );
							encontrou = true;
						}
					}
					if(encontrou == false) {
						System.out.println("Registro não encontrado. \n");
					}
					
					
				break;
					
				case 2:
					//Recebendo Informações
					String usuario = " ";
					int senha = 0;
					
					if(logado == false) {
						System.out.println("\n*****Área do Funcionário*****");
						System.out.println("\nInsira o Usuário: ");
						usuario = leitor.next();
						
						System.out.println("\nInsira o Senha: ");
						senha = leitor.nextInt();
					}
						if(verificacao.verificaçãoLogin(usuario, senha, logado)) {
							System.out.println("**Logado**");
							System.out.println("1- Cadastrar Encomenda \n2- Editar Cliente \n3- Excluir cliente"
									+ " \n4- Visualizar todas as encomendas \n5- Visualizar apenas uma encomenda"
									+ " \n6- Sair do sistema \nEscolha a opção desejada: ");
									logado = true;
							opcao = leitor.nextInt();	
							switch(opcao){
								case 1:
										System.out.println("****** CADASTRAR REMETENTE******");
										System.out.println("Insira o Nome Completo: ");
										String NomeReme = leitor.next(); 
										System.out.println("Insira o Endereço: ");
										String endReme = leitor.next();
										System.out.println("Insira o RG: ");
										int rgReme = leitor.nextInt();
										System.out.println("Insira o CPF: ");
										Long cpfReme = leitor.nextLong();
										System.out.println("Insira o Email: ");
										String emailReme = leitor.next();
										System.out.println("Insira o Telefone: ");
										int telReme = leitor.nextInt();
										boolean verifReme = false;
										if(NomeReme != null && rgReme != 0 && cpfReme != 0 && emailReme != null && telReme != 0)  {
											verifReme = true;
										}
	
										System.out.println("****** CADASTRAR DESTINATARIO******");
										System.out.println("Insira o Nome Completo: ");
										String NomeDest = leitor.next();
										System.out.println("Insira o Endereço: ");
										String endDest = leitor.next();
										System.out.println("Insira o RG: ");
										int rgDest = leitor.nextInt();
										System.out.println("Insira o CPF: ");
										Long cpfDest = leitor.nextLong();
										System.out.println("Insira o Email: ");
										String emailDest = leitor.next();
										System.out.println("Insira o Telefone: ");
										int telDest = leitor.nextInt();
										boolean verifDest = false;
										
										if(NomeDest != null && rgDest != 0 && cpfDest != 0 && emailDest != null && telDest != 0)  {
											verifDest = true;
										}
										
										
										System.out.println("****** CADASTRAR PRODUTO******");
										System.out.println("Insira o Tipo: ");
										String tipo = leitor.next();
										
										System.out.println("Insira o Peso (em g): ");
										double peso = leitor.nextDouble();	
										
										while(peso < 300 || peso > 3000) {
											System.out.println("Insira um Peso valido (em g): ");
											peso = leitor.nextDouble();	
										}										
										
										System.out.println("Insira a Largura(em cm): ");
										double largura = leitor.nextDouble();
										
										while(largura < 11 || largura > 105) {
											System.out.println("Insira uma Largura valida (em g): ");
											largura = leitor.nextDouble();	
										}			
										
										System.out.println("Insira o Altura(em cm): ");
										double altura = leitor.nextDouble();
										
										while(altura < 2 || altura > 105) {
											System.out.println("Insira uma Altura valida(em g): ");
											altura = leitor.nextDouble();	
										}			
										
										System.out.println("Insira o Comprimento(em cm): ");
										double comprimento = leitor.nextDouble();	
										
										while(comprimento < 16 || comprimento > 105) {
											System.out.println("Insira um comprimento valido(em g): ");
											comprimento = leitor.nextDouble();	
										}			
										
										System.out.println("Insira a Localização Atual: ");
										String localizacaoAtual = leitor.next();
										
										boolean verifObj = false;
										
										if(tipo != null && peso != 0 && largura != 0 && altura != 0 && comprimento != 0)  {
											verifObj = true;
										}									
										
										if(verifDest == true && verifObj == true && verifReme == true) {	
											// FINALIZAR E GERAR CODIGO DE RASTREAMENTO		
											int codRastreamento; 
											codRastreamento = random.nextInt(10000);
				
											remetentes.add(new Remetente(NomeReme, endReme ,rgReme, cpfReme, emailReme, telReme, codRastreamento));
											destinatarios.add(new Destinatario(NomeDest, endDest, rgDest, cpfDest, emailDest, telDest,codRastreamento ));
											objetos.add(new Objeto(tipo, peso, largura, altura, comprimento,codRastreamento, localizacaoAtual));																												
											
											System.out.println("\nCadastro concluído com sucesso, O código de Radtreamento foi Gerado: \n");
											System.out.println("******* " + codRastreamento + " *******\n\n");
										}							
								break;
							
							case 2:	
								System.out.println("****** EDITAR ENCOMENDA ******");
								System.out.println("Digite o Codigo de Rastreio: ");
								codPesq = leitor.nextInt();
							    encontrou = false;
								int posicao = 0;
								int index = 0;
																
								System.out.println("\n********** CÓDIGO PESQUISADO: " + codPesq + "***********\n");
								
								for(Remetente remetente:remetentes){
									if(codPesq == remetente.getCodigoRastreamento()) {
										System.out.println("********** REMETENTE ***********\n");
										remetente.MostrarCliente();
										encontrou = true;
										index = posicao;
										
									}
									posicao++;
								}
								
								if(encontrou == true) {
									System.out.println("deseja editar o Remetente? \n1- sim \n2- não \n");
									int escolha = leitor.nextInt();
									if (escolha == 1) {
										remetentes.get(index).alterarCliente();
									}
									
								}
									
								for(Destinatario destinatario:destinatarios){
									if(codPesq == destinatario.getCodigoRastreamento()) {
										System.out.println("********** DESTINATARIO ***********\n");
										destinatario.MostrarCliente();
									}
								}
								
								if(encontrou == true) {
									System.out.println("deseja editar o Destinatario? \n1- sim \n2- não \n");
									int escolha = leitor.nextInt();
									if (escolha == 1) {
										destinatarios.get(index).alterarCliente();
									}
									
								}
								
								
								for(Objeto objeto:objetos){
									if(codPesq == objeto.getCodigoRastreamento()) {
										System.out.println("********** OBJETO ***********\n");
										objeto.MostrarProduto();
									}
								}
								if(encontrou == true) {
									System.out.println("deseja editar o Objeto? \n1- sim \n2- não \n");
									int escolha = leitor.nextInt();
									if (escolha == 1) {
										objetos.get(index).alterarObjeto();
									}
									
								}
								
								if(encontrou == false) {
									System.out.println("Registro não encontrado.");
								} 							
							break;
							
							case 3:
								System.out.println("****** EXCLUIR ENCOMENDA ******");
								System.out.println("Digite o Codigo de Rastreio: ");
								codPesq = leitor.nextInt();
								encontrou = false;
								posicao = 0;
								index = 0;
															
								System.out.println("\n********** CÓDIGO PESQUISADO: " + codPesq + "***********\n");
								
								for(Remetente remetente:remetentes){
									if(codPesq == remetente.getCodigoRastreamento()) {
										System.out.println("********** REMETENTE ***********\n");
										remetente.MostrarCliente();
										encontrou = true;
										index = posicao;
									}
									posicao++;
								}
								for(Destinatario destinatario:destinatarios){
									if(codPesq == destinatario.getCodigoRastreamento()) {
										System.out.println("********** DESTINATARIO ***********\n");
										destinatario.MostrarCliente();
									}
								}
								for(Objeto objeto:objetos){
									if(codPesq == objeto.getCodigoRastreamento()) {
										System.out.println("********** OBJETO ***********\n");
										objeto.MostrarProduto();
									}
								}
								
								if(encontrou == false) {
									System.out.println("Registro não encontrado.");
								} else {
									System.out.println("Deseja Realmente excluir? \n1-Sim \n2- Não");
									int escolha = leitor.nextInt();
									
									if(escolha == 1) {
										remetentes.remove(index);
										destinatarios.remove(index);
										objetos.remove(index);
									}									
								}

							break;
							
							case 4:
								System.out.println("****** VISUALIZAR TODAS AS ENCOMENDAS ******");
								for(Remetente remetente:remetentes) {
									remetente.VisualizarEncomendas();
								}
															
							break;
							
							case 5:
								System.out.println("****** VISUALIZAR APENAS UMA ENCOMENDA ******");
								System.out.println("Digite o Codigo de Rastreio: ");
								codPesq = leitor.nextInt();
								encontrou = false;
								
								System.out.println("\n********** CÓDIGO PESQUISADO: " + codPesq + "***********\n");
								
								for(Remetente remetente:remetentes){
									if(codPesq == remetente.getCodigoRastreamento()) {
										System.out.println("********** REMETENTE ***********\n");
										remetente.MostrarCliente();
										encontrou = true;
									}
								}
								for(Destinatario destinatario:destinatarios){
									if(codPesq == destinatario.getCodigoRastreamento()) {
										System.out.println("********** DESTINATARIO ***********\n");
										destinatario.MostrarCliente();
									}
								}
								for(Objeto objeto:objetos){
									if(codPesq == objeto.getCodigoRastreamento()) {
										System.out.println("********** OBJETO ***********\n");
										objeto.MostrarProduto();
									}
								}
								
								if(encontrou == false) {
									System.out.println("Registro não encontrado.");
								}
							break;
							
							case 6:		
								System.exit(0);
								leitor.close();
							default:
								System.out.println("OPÇÃO INVÁLIDA");
						}
					}else{
						System.out.println("Usuario ou Senha Inválida.");
					}
					
				break;	
				
				case 3:
					System.out.println("\n*****Sistema Encerrado*****");
					System.exit(0);
					leitor.close();
					
				default:
					System.out.println("OPÇÃO INVÁLIDA");
			}					
			
			
			
		}while(true);			
	}
}
