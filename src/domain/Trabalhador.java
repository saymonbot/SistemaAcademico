package domain;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.control.ProgressBar;

public class Trabalhador extends Task<Void> {
	
	private String nome;
	private int quantidade;
	private int tempo;
	private ProgressBar barra;
	
	public Trabalhador(String nome, int quantidade, int tempo, ProgressBar barra) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.tempo = tempo;
		this.barra = barra;
	}
	
	@Override
	protected Void call() throws Exception {
		double incremento = 1.0/quantidade;
		for(int i=0; i<quantidade; i++) {
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
		double incremento = 1.0/quantidade;
		for(int i=0; i<quantidade; i++) {
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

	public int getquantidade() {
		return quantidade;
	}

	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
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
