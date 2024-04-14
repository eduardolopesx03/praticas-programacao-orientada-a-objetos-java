package devflix;

public class Serie extends Filme{
	private int temporadas;
	private int episodiosPorTemporadas;
	private int temporadaAtual;
	private int episodioAtual;
	
	public Serie(String nome, int temporadas, int episodiosPorTemporadas) {
		super(nome);
		this.temporadas = temporadas;
		this.episodiosPorTemporadas = episodiosPorTemporadas;
		this.temporadaAtual = 1;
		this.episodioAtual = 1;
	}
	
	public void play(int temporada, int episodio) {
		if (validarEpisodio(temporada, episodio)) {
			this.temporadaAtual = temporada;
			this.episodioAtual = episodio;
			System.out.println("Play: " + toString());
		}
		else {
			System.out.println("Episódio inválido!");
		}
	}
	
	private boolean validarEpisodio(int temporada, int episodio) {
		if (temporada == 0 || episodio == 0) {
			return false;
		}
		
		if (temporada > temporadas || episodio > episodiosPorTemporadas) {
			return false;
		}

		return true;
	}
	
	
	// Os métodos especificos da classe
	@Override
	public String toString() {
		String informacao = String.format("Serie %s %dx%02d (audio %s, legenda %s)", getNome(), temporadaAtual, episodioAtual, getAudio(), getLegenda());
		return informacao;
	}
	
	
	// Métodos getters e setters
	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getEpisodiosPorTemporadas() {
		return episodiosPorTemporadas;
	}

	public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
		this.episodiosPorTemporadas = episodiosPorTemporadas;
	}

	public int getTemporadaAtual() {
		return temporadaAtual;
	}

	public void setTemporadaAtual(int temporadaAtual) {
		this.temporadaAtual = temporadaAtual;
	}

	public int getEpisodioAtual() {
		return episodioAtual;
	}

	public void setEpisodioAtual(int episodioAtual) {
		this.episodioAtual = episodioAtual;
	}
}
