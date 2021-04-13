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
		
		//atribuições para variáveis
		int opcao, tipo, tot = 0, resp = 0;
		String s, m, sabor;
		double valor;
		
		//Criação entidade
		Sorvete sv = new Sorvete();
		
		//Começo da estrutura de repetição
		do {
			
			show();//Menu, método no final
			opcao = ler.nextInt();
			
			
			switch (opcao) {
			case 1:

				do {
					System.out.println(" ");
					System.out.println("Qual tipo você deseja? \n1 - Sorvete Artesanal \n2 - Sorvete Italiano");
					tipo = ler.nextInt();

					if (tipo == 1) {
						//Criação do sorvete e atribuição do objeto (tipo de sorvete)
						SorveteArtesanal sa = new SorveteArtesanal();
						System.out.println("Ok, então vamos inserir os dados!");
						System.out.println("Qual Sabor você deseja adicionar?");
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
						tot++;//contador para verificação

					} else if (tipo == 2) {

						SorveteItaliano si = new SorveteItaliano();
						System.out.println("Ok, então vamos inserir os dados!");
						System.out.println("Qual Sabor você deseja adicionar?");
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
						tot++;//contador para verificação
					}

					System.out.println("Deseja adicionar novo sabor? \n1 - Sim \n2 - Não");
					resp = ler.nextInt();

				} while (resp == 1);

				break;

			case 2:
				//verificação para saber se tem objetos adicionados
				if (tot == 0) {
					
					System.out.println("Não exitem produtos cadastrados para remover :/");
					
				} else {
					
					System.out.println("Vou Listar para você os produtos adicionados: ");
					System.out.println(" ");
					
					
					//listagem de sorvete
					for (Sorvete sorvete : listaSorvete) {
						System.out.println("Sabor: " + sorvete.getSabor() + "||Marca: " + sorvete.getMarca() + "||Valor: R$"
										+ sorvete.getValor() + "||" + sorvete.getTipo().getClass().getSimpleName());
						System.out.println(" ");
						System.out.println("***********************************");
						System.out.println("Digite o Sabor que deseja remover: ");
						sabor = ler.next();
						//verificação para deletar
						if (sorvete.getSabor().equals(sabor)) {
							listaSorvete.remove(sorvete);// removendo sorvete
							tot--;//retirando do contador
							System.out.println("deletado");
							break;
						} else {//caso não exista o sabor para ser deletado
							System.out.println("Esse sabor não existe");
						}
					}
				}
				break;

			case 3:
				if (tot == 0) { // conferindo se exitem produtos cadastrados
					System.out.println("Não exitem produtos cadastrados!");
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
			escolha();//método de escolha
			resp = ler.nextInt();
		} while (resp == 1);
		System.out.println("Até a próxima!"); // finalização do programa
	}

	public static void show() {
		System.out.println("**********************************");
		System.out.println("*Bem Vindo a Sorveteria Xega Mais*");
		System.out.println("**********************************");
		System.out.println("    Escolha a opção desejada      ");
		System.out.println("1 - Inserir Sorvete \n2 - Deletar Sorvete \n3 - Mostrar Sorvetes disponíveis");

	}
	public static void escolha() {
		System.out.println("\n");
		System.out.println("***********************************");
		System.out.println("1 - Para voltar ao menu principal ou \n2 - Sair do sistema");
		System.out.println("***********************************");
		
		
	}
}
