package br.com.studiotrek;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControlePontoNovo {

	public void registrar(Funcionario funcionario, Boolean entrada) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dataFormatada = simpleDateFormat.format(calendar.getTime());

		if (entrada) {
			System.out.println("Entrada: " + funcionario.getNome() + " às " + dataFormatada);
		} else {
			System.out.println("Saida: " + funcionario.getNome() + " às " + dataFormatada);
		}

	}

}
