package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Sorvete;
import entidade.SorveteArtesanal;
import entidade.SorveteItaliano;

public class Controle extends App_Test {

	public static void main(String[] args) {
		//ArrayList para entidade Sorvete
		List<Sorvete> listaSorvete = new ArrayList<Sorvete>();
		
		//leitura de valores
		Scanner ler = new Scanner(System.in);
		
		//atribui��es para vari�veis
		int opcao, tipo, tot = 0, resp = 0;
		String s, m, sabor;
		double valor;
		
		//Cria��o entidade
		Sorvete sv = new Sorvete();
		
		//Come�o da estrutura de repeti��o
		do {
			
			show();//Menu, m�todo no final
			opcao = ler.nextInt();
			
			
			switch (opcao) {
			case 1:

				do {
					System.out.println(" ");
					System.out.println("Qual tipo voc� deseja? \n1 - Sorvete Artesanal \n2 - Sorvete Italiano");
					tipo = ler.nextInt();

					if (tipo == 1) {
						//Cria��o do sorvete e atribui��o do objeto (tipo de sorvete)
						SorveteArtesanal sa = new SorveteArtesanal();
						System.out.println("Ok, ent�o vamos inserir os dados!");
						System.out.println("Qual Sabor voc� deseja adicionar?");
						s = ler.next();
						sv.setSabor(s);
						System.out.println("Qual a marca do produto?");
						m = ler.next();
						sv.setMarca(m);
						System.out.println("Qual valor do produto?");
						valor = ler.nextDouble();
						sv.setValor(valor);
						sv.setTipo(sa); // tipo de sorvete 
						listaSorvete.add(sv); //salvando na lista de sorvetes
						tot++;//contador para verifica��o

					} else if (tipo == 2) {

						SorveteItaliano si = new SorveteItaliano();
						System.out.println("Ok, ent�o vamos inserir os dados!");
						System.out.println("Qual Sabor voc� deseja adicionar?");
						s = ler.next();
						sv.setSabor(s);
						System.out.println("Qual a marca do produto?");
						m = ler.next();
						sv.setMarca(m);
						System.out.println("Qual valor do produto?");
						valor = ler.nextDouble();
						sv.setValor(valor);
						sv.setTipo(si);// tipo de sorvete
						listaSorvete.add(sv);// salvando na lista de sorvetes
						tot++;//contador para verifica��o
					}

					System.out.println("Deseja adicionar novo sabor? \n1 - Sim \n2 - N�o");
					resp = ler.nextInt();

				} while (resp == 1);

				break;

			case 2:
				//verifica��o para saber se tem objetos adicionados
				if (tot == 0) {
					
					System.out.println("N�o exitem produtos cadastrados para remover :/");
					
				} else {
					
					System.out.println("Vou Listar para voc� os produtos adicionados: ");
					System.out.println(" ");
					
					
					//listagem de sorvete
					for (Sorvete sorvete : listaSorvete) {
						System.out.println("Sabor: " + sorvete.getSabor() + "||Marca: " + sorvete.getMarca() + "||Valor: R$"
										+ sorvete.getValor() + "||" + sorvete.getTipo().getClass().getSimpleName());
						System.out.println(" ");
						System.out.println("***********************************");
						System.out.println("Digite o Sabor que deseja remover: ");
						sabor = ler.next();
						//verifica��o para deletar
						if (sorvete.getSabor().equals(sabor)) {
							listaSorvete.remove(sorvete);// removendo sorvete
							tot--;//retirando do contador
							System.out.println("deletado");
							break;
						} else {//caso n�o exista o sabor para ser deletado
							System.out.println("Esse sabor n�o existe");
						}
					}
				}
				break;

			case 3:
				if (tot == 0) { // conferindo se exitem produtos cadastrados
					System.out.println("N�o exitem produtos cadastrados!");
				} else {
					System.out.println("Sovetes :");
					System.out.println(" ");
					//listagem de sorvetes
					for (Sorvete sorvete : listaSorvete) {
						System.out.println("Sabor: " + sorvete.getSabor() + "||Marca: " + sorvete.getMarca() + "||Valor: R$"
										+ sorvete.getValor() + "||" + sorvete.getTipo().getClass().getSimpleName());
						
					}
				}
				break;
			}
			escolha();//m�todo de escolha
			resp = ler.nextInt();
		} while (resp == 1);
		System.out.println("At� a pr�xima!"); // finaliza��o do programa
	}

	public static void show() {
		System.out.println("**********************************");
		System.out.println("*Bem Vindo a Sorveteria Xega Mais*");
		System.out.println("**********************************");
		System.out.println("    Escolha a op��o desejada      ");
		System.out.println("1 - Inserir Sorvete \n2 - Deletar Sorvete \n3 - Mostrar Sorvetes dispon�veis");

	}
	public static void escolha() {
		System.out.println("\n");
		System.out.println("***********************************");
		System.out.println("1 - Para voltar ao menu principal ou \n2 - Sair do sistema");
		System.out.println("***********************************");
		
		
	}
}
