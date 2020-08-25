package model;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String getEnunciado() {
		return enunciado;
	}
	
	
	
	
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "pergunta: " + enunciado;
	}
	
	public boolean corrigir(String respostaAluno) {
		
		if (resposta .equals(respostaAluno)) {
			return true;
		}
		else {
			return false;
		}
	}

}
