package exemplo;

public class ContaNetflix {
	private String idiomaPreferencial;
	private String resolucaoTela;
	
	public void entrar() {
		bucarPreferenciasDoUsuario();
		identificarResolucao();
	}
	 
	private void bucarPreferenciasDoUsuario() {
		idiomaPreferencial = "PT-BR";
	}
	
	private void identificarResolucao() {
		resolucaoTela = "Full HD";
	}
	
	public void assistirFilme(String nomeFilme) {
		System.out.println("Iniciando o filme " + nomeFilme);
		System.out.println("Carregando o filme na resolução " + resolucaoTela);
		carregarAudioFilme();
	}
	
	private void carregarAudioFilme() {
		if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
			System.out.println("Carregando o áudio em " + idiomaPreferencial);
		}
		else {
			System.out.println("Carregando o áudio em EN-US");
		}
	}
	
}
