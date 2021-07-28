
public class No {
	
	private int conteudo;
	private No noReferencia = null;
	
	public No() {
	}
	
	public No(int conteudo) {
		this.conteudo = conteudo;
	}

	public int getConteudo() {
		return conteudo;
	}

	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}

	public No getNoReferencia() {
		return noReferencia;
	}

	public void setNoReferencia(No noReferencia) {
		this.noReferencia = noReferencia;
	}
	
	@Override
	public String toString() {
		return "dado{" +
				conteudo +
				"}";
	}
	
}