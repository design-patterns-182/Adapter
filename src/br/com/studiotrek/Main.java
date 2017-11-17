package br.com.studiotrek;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		ControlePonto controlePonto = new ControlePonto();
		ControlePontoAdapter controlePontoAdapter = new ControlePontoAdapter();
		Funcionario funcionario = new Funcionario("Basilio Alves");
		
		controlePontoAdapter.registraEntrada(funcionario);
		Thread.sleep(3000);
		controlePontoAdapter.registraSaida(funcionario);
	}
	
}
