package br.com.studiotrek;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControlePonto {
	public void registraEntrada(Funcionario funcionario) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dataFormatada = simpleDateFormat.format(calendar.getTime());
		System.out.println("Entrada: " + funcionario.getNome() + " às " + dataFormatada);
	}
	
	public void registraSaida(Funcionario funcionario) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dataFormatada = simpleDateFormat.format(calendar.getTime());
		System.out.println("Saida: " + funcionario.getNome() + " às " + dataFormatada);
	}
	
}
