package br.com.projetox.classes;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Daniel Programa de demonstração de conhecimentos
 *
 */
public class ProjetoX {

	/*
	 * Função principal do ProjetoX
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inicia conhecendo o usuário

		// Imprime mensagem na tela
		System.out.println("Qual o seu nome?");
		// Interagindo com o usuário
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();
		System.out.println("Bem vindo, " + nome);

		int sairMenu = 1;
		// lastro de repetição do menu principal
		while (sairMenu != 0) {
			// Cria um menu
			System.out.println("************** Menu **************");
			System.out.println("* Escolha uma opção:              ");
			System.out.println("**********************************");
			System.out.println("* Para Operações Básicas______(1)");
			System.out.println("* Para Raizes_________________(2)");
			System.out.println("* Para Calcular a Área________(3)");
			System.out.println("* Para Fibonacci______________(4)");
			System.out.println("* Para Selecionar Carta_______(5)");
			System.out.println("* Para Sortear Dado___________(6)");
			System.out.println("* Para Conta Bancária_________(7)");
			System.out.println("* Para Calcula Média__________(8)");
			System.out.println("* Para Sair___________________(9)");
			System.out.println("**********************************");
			// Pergunta a opção
			int operacao = 0;
			System.out.print("Qual opção você deseja " + nome + "?  ");
			operacao = s.nextInt();
			// Estrutura condicional switch case
			switch (operacao) {

			// Case 1 de Operações Basicas

			case 1:
				int sairOperacaoBasica = 1;
				// lastro de repetição do sub menu 1 de operações Basicas
				while (sairOperacaoBasica != 0) {
					System.out.print("Digite um numero inteiro:");
					double num1 = s.nextInt();
					System.out.print("Digite outro numero inteiro:");
					double num2 = s.nextInt();
					System.out.println("***********************");
					System.out.println("*Digite uma operação:  ");
					System.out.println("*Soma_______________(1)");
					System.out.println("*Subtração__________(2)");
					System.out.println("*Multiplicação______(3)");
					System.out.println("*Divisão____________(4)");
					System.out.println("*Sair_______________(5)");
					System.out.println("************************");
					double x = s.nextInt();
					OperacaoBasica op = new OperacaoBasica();
					if (x == 1)
						System.out.println(op.soma(num1, num2));
					else if (x == 2)
						System.out.println(op.subtracao(num1, num2));
					else if (x == 3)
						System.out.println(op.multiplicacao(num1, num2));
					else if (x == 4)
						System.out.println(op.divisao(num1, num2));
					else if (x == 5) {
						sairOperacaoBasica = 0;
						break;
					} else
						System.out.println("Opção Inválida!");

					System.out.println("Deseja fazer outras operação? Sim(1) Não(0)");
					sairOperacaoBasica = s.nextInt();
				}
				break;

			// Case 2 de Raizes

			case 2:
				int sairRaiz = 1;
				// lastro de repetição do sub menu 2 de Raizes
				while (sairRaiz != 0) {
					Raiz num = new Raiz();

					System.out.println("***********************");
					System.out.println("*Escolha a Raiz:  ");
					System.out.println("*Raiz Quadrada_______(1)");
					System.out.println("*Raiz Cubica_________(2)");
					System.out.println("*Sair________________(3)");
					System.out.println("************************");
					System.out.print("Digite uma opção: ");
					int x = s.nextInt();
					if (x == 1) {
						System.out.println("Digite um numero inteiro:");
						System.out.println(num.raiz2(s.nextInt()));
					} else if (x == 2) {
						System.out.println("Digite um numero inteiro:");
						System.out.println(num.raiz3(s.nextInt()));
					} else if (x == 3) {
						sairRaiz = 0;
						break;
					} else
						System.out.println("Opção Inválida!");

					System.out.println("Deseja fazer outra raiz? Sim(1) Não(0)");
					sairRaiz = s.nextInt();
				}
				break;
			// Case 3 de Calcula Area
			case 3:
				int sairCalculaArea = 1;
				// lastro de repetição do sub menu 3 Calcula Area
				while (sairCalculaArea != 0) {
					System.out.println("******************************");
					System.out.println("*Escolha a forma geométrica:  ");
					System.out.println("*Quadrado__________________(1)");
					System.out.println("*Retângulo_________________(2)");
					System.out.println("*Triangulo_________________(3)");
					System.out.println("*Losango___________________(4)");
					System.out.println("*Trapézio__________________(5)");
					System.out.println("*Circulo___________________(6)");
					System.out.println("*Sair______________________(7)");
					System.out.println("******************************");

					double x = s.nextInt();
					CalculaArea area = new CalculaArea();

					System.out.print("Digite o valor da base:");
					double base = s.nextInt();
					System.out.print("Digite o valor da altura:");
					double altura = s.nextInt();

					if (x == 1)
						System.out.println(area.quadrado(base));
					else if (x == 2)
						System.out.println(area.retangulo(base, altura));
					else if (x == 3)
						System.out.println(area.triangulo(base, altura));
					else if (x == 4)
						System.out.println(area.losango(base, altura));
					else if (x == 5) {
						System.out.print("Digite o valor da baseMaior:");
						double baseMaior = s.nextInt();
						System.out.print("Digite o valor da baseMenor:");
						double baseMenor = s.nextInt();
						System.out.print("Digite o valor da altura:");
						double alturaTra = s.nextInt();
						System.out.println(area.trapezio(baseMaior, baseMenor, alturaTra));
					} else if (x == 6) {
						System.out.print("Digite o valor do Raio:");
						double raio = s.nextInt();
						System.out.println(area.circulo(raio));
					} else if (x == 7) {
						sairCalculaArea = 0;
						break;
					} else
						System.out.println("Opção Inválida!");

					System.out.println("Deseja escolher outra forma? Sim(1) Não(0)");
					sairCalculaArea = s.nextInt();
				}
				break;
			// Case 4 de Fibonacci
			case 4:
				int sairFibonacci = 1;
				// lastro de repetição do sub menu 4 Fibonacci
				while (sairFibonacci != 0) {
					System.out.println("Até que numero exibir a sequencia? ");
					int numero = s.nextInt();
					Fibonacci n = new Fibonacci();
					System.out.println(n.FibonacciCalc(numero));
					System.out.println("Deseja iniciar outra sequencia? Sim(1) Não(0)");
					sairFibonacci = s.nextInt();
				}
				break;
			// Case 5 de Seleciona Carta
			case 5:
				int sairSelecionaCarta = 1;
				// lastro de repetição do sub menu 5 Sorteia Carta
				while (sairSelecionaCarta != 0) {
					SelecionaCarta novaCarta = new SelecionaCarta();
					System.out.println("Sorteia uma carta: ");
					novaCarta.Baralho();
					System.out.println("Deseja selecionar outra carta? Sim(1) Não(0)");
					sairSelecionaCarta = s.nextInt();
				}
				break;
			// Case 6 de Sortear Dado
			case 6:
				int sairSelecionaDado = 1;
				// lastro de repetição do sub menu 6 Sorteia Dado
				while (sairSelecionaDado != 0) {
					SorteiaDado sd = new SorteiaDado();
					System.out.println("Qual o seu palpite?");
					int palpite = s.nextInt();
					System.out.println("\n");
					if (palpite <= 6)
						System.out.println(sd.Sorteando(palpite));
					else
						System.out.println("Opcção Inválida!");

					System.out.println("\n");
					System.out.println("Deseja iniciar sorteio do dado outra vez? Sim(1) Não(0)");
					sairSelecionaDado = s.nextInt();
				}
				break;
			// Case 7 de Conta Bancária
			case 7:
				int sairContaBancaria = 1;
				// Chama o a classe do método ContaMetodo
				ContaMetodo conta = new ContaMetodo();
				System.out.println("Crie uma conta!");
				// Cria um cliente
				System.out.println("Primeiro digite seu nome: ");
				s.nextLine();
				conta.cliente = s.nextLine();
				// Cria um saldo
				System.out.print("Digite o saldo inicial: ");
				conta.saldo = s.nextDouble();
				System.out.println("Pronto conta criada com sucesso!");
				// lastro de repetição do sub menu 6 Sorteia Dado
				while (sairContaBancaria != 0) {
					// Exibi o sub menu da Conta
					System.out.println("***********************");
					System.out.println("*Escolha uma operação: ");
					System.out.println("*Exibir Saldo_______(1)");
					System.out.println("*Efetuar Saque______(2)");
					System.out.println("*Efetuar Deposito___(3)");
					System.out.println("*Transferência______(4)");
					System.out.println("*Sair_______________(5)");
					System.out.println("************************");
					double opcao = s.nextInt();
					// Verifica a opção do menu com if else
					if (opcao == 1)
						conta.exibeSaldo();
					else if (opcao == 2) {
						System.out.print("Informe o valor do saque: ");
						double saque = s.nextInt();
						conta.saca(saque);
						conta.exibeSaldo();
					} else if (opcao == 3) {
						System.out.print("Informe o valor do depostito: ");
						double deposito = s.nextInt();
						conta.deposita(deposito);
						conta.exibeSaldo();
					} else if (opcao == 4) {
						// Cria uma nova conta
						ContaMetodo destino = new ContaMetodo();
						System.out.println("Crie uma nova conta!");
						// Cria um cliente
						System.out.print("Primeiro digite o nome da conta: ");
						s.nextLine();
						destino.cliente = s.nextLine();
						// Cria um saldo
						System.out.print("Digite o saldo da conta: ");
						destino.saldo = s.nextDouble();
						destino.exibeSaldo();
						System.out.print("Qual valor tranferir? ");
						conta.trasnferePara(destino, s.nextDouble());
						conta.exibeSaldo();
						destino.exibeSaldo();
					} else if (opcao == 5) {
						sairContaBancaria = 0;
						break;
					} else
						System.out.println("Opção Inválida!");
					System.out.println("Deseja continuar na conta? Sim(1) Não(0)");
					sairContaBancaria = s.nextInt();
				}
				break;
			// Case 8 do Calcula Média de notas
			case 8:
				int sairMediaNotas = 1;
				// Lastro de repetição SubMenu 9 Médias de Notas
				while (sairMediaNotas != 0) {
					// Calcula de Média de notas
					System.out.println("Qual opção voce deseja?");
					// Exibi o sub menu da Media de Notas
					System.out.println("***********************");
					System.out.println("*Escolha uma opção: ");
					System.out.println("Um aluno____________(1)");
					System.out.println("*Uma turma__________(2)");
					System.out.println("*Dois Alunos________(3)");
					System.out.println("*Quatro Provas______(4)");
					System.out.println("*Sair_______________(5)");
					System.out.println("************************");
					double x = s.nextInt();
					// chama a classe Calcula Media
					CalculaMedia media = new CalculaMedia();
					// Condição do SubMenu de Media de Notas Um Aluno
					if (x == 1) {
						// Primeira nota
						System.out.println("Entre com a primeira nota: ");
						double nota1 = s.nextDouble();
						// Segunda nota
						System.out.println("Entre com a segunda nota: ");
						double nota2 = s.nextDouble();
						// Exibe a media chamando uma função da classe CalculaMedia
						System.out.println("A média do aluno foi: " + media.MediaUmAluno(nota1, nota2));
					}
					// Condição do SubMenu de Media de Notas Uma Turma
					else if (x == 2) {
						// Numero de alunos
						System.out.println("Quantos Alunos são ?");
						int numAlunos = s.nextInt();
						System.out.println(media.MediaUmaTurma(numAlunos));
					}
					// Condição do SubMenu de Media de Notas Dois Alunos
					else if (x == 3) {
						// Primeiro aluno e primeira nota
						System.out.println("Entre com o nome do primeiro Aluno: ");
						s.nextLine();
						String nomeAluno1 = s.nextLine();
						System.out.println("Entre com a primeira nota: ");
						double nota1Aluno1 = s.nextDouble();
						System.out.println("Entre com a segunda nota: ");
						double nota2Alunoa1 = s.nextDouble();
						// Segundo aluno e segunda nota
						System.out.println("Entre com o nome do segundo Aluno: ");
						s.nextLine();
						String nomeAluno2 = s.nextLine();
						System.out.println("Entre com a primeira nota: ");
						double nota1Aluno2 = s.nextDouble();
						System.out.println("Entre com a segunda nota: ");
						double nota2Aluno2 = s.nextDouble();
						// Exibe a media chamando uma função da classe CalculaMedia
						System.out.println("A média do aluno " + nomeAluno1 + " foi: "
								+ media.MediaUmAluno(nota1Aluno1, nota2Alunoa1));
						System.out.println("A média do aluno " + nomeAluno2 + " foi: "
								+ media.MediaUmAluno(nota1Aluno2, nota2Aluno2));
					}
					// Condição do SubMenu de Media de Notas Quatro Provas
					else if (x == 4) {
						// Primeira nota
						System.out.println("Entre com a nota da primeira prova: ");
						double nota1 = s.nextDouble();
						// Segunda nota
						System.out.println("Entre com a nota da segunda prova:: ");
						double nota2 = s.nextDouble();
						// Terceira nota
						System.out.println("Entre com a nota da primeira prova: ");
						double nota3 = s.nextDouble();
						// Quarta nota
						System.out.println("Entre com a nota da segunda prova:: ");
						double nota4 = s.nextDouble();
						// Exibe a media chamando uma função da classe CalculaMedia
						System.out.println(
								"A média do aluno foi: " + media.MediaQuatroProvas(nota1, nota2, nota3, nota4));
					}
					// Condição do SubMenu de Media de Notas Sair
					else if (x == 5) {
						sairMediaNotas = 0;
						break;
					} else {
						System.out.println("Opção Inválida!");
					}
					System.out.println("Deseja continuar a calcular a média? Sim(1) Não(0)");
					sairMediaNotas = s.nextInt();
				}
				break;
			case 9:
				break;
			default:
				System.out.println("Você digitou uma operação inválida.");
			}// Fechamento do Switch
			System.out.println("Deseja ir para menu principal? Sim(1) Não(0)");
			sairMenu = s.nextInt();
		} // Fechamento do while do menu principal
		System.out.println("Fim do Programa!!");
	}// Fechamento do método main
}// Fechamento da classe ProjetoX
