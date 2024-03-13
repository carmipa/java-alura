package br.com.alura.bytebank.main;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100.0;
		contaDoPaulo.deposita(5000);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000.0);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesspo ");
		}else {
			System.out.println("Faltou dinheiro!");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		
		

	}

}
