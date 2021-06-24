package exercicio4;

public class Avaliacao {
	private String disciplina;
	private String aluno;
	private double nota;
	
	
	public Avaliacao(String disciplina, String aluno, double nota) {
		this.disciplina = disciplina;
		this.aluno = aluno;
		this.nota = nota;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public String getAluno() {
		return aluno;
	}


	public void setAluno(String aluno) {
		this.aluno = aluno;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
