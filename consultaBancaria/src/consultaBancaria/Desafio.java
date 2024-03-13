package consultaBancaria;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        double consultaSaldo = 1500;
	        double recebeValor = 0;
	        double transfereValor = 0;
	        int opcaoDesejada = 0;

	        System.out.println(".....................................................................\n");
	        System.out.println("Dados do cliente:\n");
	        System.out.println("Nome do Cliente:.............: Paulo André Carminati");
	        System.out.println("Tipo de Conta:...............: Carrente");
	        System.out.println("Saldo atual:.................: R$ " + consultaSaldo);
	        System.out.println("\n.....................................................................");

	        while (opcaoDesejada != 4){

	            System.out.println("Operações:\n");
	            System.out.println("1 - Consultar o saldo");
	            System.out.println("2 - transferir valor");
	            System.out.println("3 - Receber valor");
	            System.out.println("4 - Sair\n");
	            System.out.println("\nDigite a opção desejada: ");
	            opcaoDesejada = scanner.nextInt();

	            if(opcaoDesejada == 1) {

	                System.out.println("Saldo do cliente: RS " + consultaSaldo);

	            }else if(opcaoDesejada == 2){

	                System.out.println("Digite o valor a ser transferido: R$ ");
	                recebeValor = scanner.nextDouble();

	                if(recebeValor > consultaSaldo){

	                    System.out.println("Você não tem saldo para realiza a transferência!");

	                }else{

	                    consultaSaldo -= recebeValor;
	                    System.out.println("Novo saldo: R$ " + consultaSaldo);
	                }
	            } else if (opcaoDesejada == 3) {

	                System.out.println("Valor recebido: R$");
	                transfereValor = scanner.nextDouble();
	                consultaSaldo += transfereValor;
	                System.out.println("Novo saldo: R$ " + consultaSaldo);

	            }else if(opcaoDesejada != 4){

	                System.out.println("Opção inválidade!\n");

	            }



	        }


	}

}
