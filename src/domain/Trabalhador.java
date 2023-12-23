package domain;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.control.ProgressBar;

public class Trabalhador extends Task<Void> {
	
	private String nome;
	private int qtd;
	private int tempo;
	private ProgressBar barra;
	
	public Trabalhador(String nome, int qtd, int tempo, ProgressBar barra) {
		this.nome = nome;
		this.qtd = qtd;
		this.tempo = tempo;
		this.barra = barra;
	}
	
	@Override
	protected Void call() throws Exception {
		double incremento = 1.0/qtd;
		for(int i=0; i<qtd; i++) {
			try {
				Thread.sleep(tempo*1000);
				Platform.runLater(()-> {
					barra.setProgress(barra.getProgress()+incremento);
				});
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public void produzir() {
		barra.setProgress(0);
		double incremento = 1.0/qtd;
		for(int i=0; i<qtd; i++) {
			try {
				Thread.sleep(tempo*1000);
				barra.setProgress(barra.getProgress()+incremento);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public ProgressBar getBarra() {
		return barra;
	}

	public void setBarra(ProgressBar barra) {
		this.barra = barra;
	}
	
	
	
}
