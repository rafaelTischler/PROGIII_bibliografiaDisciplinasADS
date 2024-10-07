package bibliografiaDisciplinas;

public class Disciplina {

	private String nome;
	private String cargaHoraria;
	private String semestre;
	private String ementa;
	private String bibliografiaBasica;
	private String professor;

	public Disciplina() {

	}

	public Disciplina(String nome, String cargaHoraria, String semestre, String ementa, String bibliografiaBasica,
			String professor) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.semestre = semestre;
		this.ementa = ementa;
		this.bibliografiaBasica = bibliografiaBasica;
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getBibliografiaBasica() {
		return bibliografiaBasica;
	}

	public void setBibliografiaBasica(String bibliografiaBasica) {
		this.bibliografiaBasica = bibliografiaBasica;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
