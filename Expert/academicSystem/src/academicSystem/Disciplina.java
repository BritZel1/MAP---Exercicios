package academicSystem;

import java.util.List;

public class Disciplina {
	private String horario;
	private String nome;
	private int codigo;
	private String sala;
	private List<Aluno> alunos;

	public Disciplina() {

	}

	public Disciplina(String horario, String nome, int codigo, String sala) {
		this.setHorario(horario);
		this.setNome(nome);
		this.setCodigo(codigo);
		this.setSala(sala);
	}

	public Disciplina(String horario, String nome, String sala, List<Aluno> alunos) {
		this.setHorario(horario);
		this.setNome(nome);
		this.setSala(sala);
		this.setAlunos(alunos);
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
