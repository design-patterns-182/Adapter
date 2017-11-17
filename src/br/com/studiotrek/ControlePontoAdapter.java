package br.com.studiotrek;

public class ControlePontoAdapter extends ControlePonto {

	private ControlePontoNovo controlePontoNovo;
	
	public ControlePontoAdapter() {
		this.controlePontoNovo = new ControlePontoNovo();
	}
	
	@Override
	public void registraEntrada(Funcionario funcionario) {
		this.controlePontoNovo.registrar(funcionario, true);
	}
	
	@Override
	public void registraSaida(Funcionario funcionario) {
		this.controlePontoNovo.registrar(funcionario, false);
	}
	
}
