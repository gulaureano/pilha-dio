
public class Pilha {
	
	No contagemReferencia;
	
	public Pilha() {
		this.contagemReferencia = null;
	}
	
	public boolean isEmpty() {
		return this.contagemReferencia == null ? true : false;
	}
	
	public No top() {
		return contagemReferencia;
	}
	
	public void push(No proximoNo) {
		No noAuxiliar = contagemReferencia;
		contagemReferencia = proximoNo;
		contagemReferencia.setNoReferencia(noAuxiliar);
	}
	
	public No pop() {
		if (!isEmpty()) {
			return contagemReferencia = contagemReferencia.getNoReferencia();
		}
		return null; 
	}
	
	@Override
	public String toString(){
		String retornoString = "------------\n";
		No noDeReferencia = contagemReferencia;
		
		while(true) {
			if (noDeReferencia != null) {
				retornoString += "n?mero{";
				retornoString += noDeReferencia.getConteudo() + "}\n";
				noDeReferencia = noDeReferencia.getNoReferencia();
			}
			else {
			break;
			}
		}
		return retornoString;
	}
	
}
