package br.com.logicaoo.aula3;

public class Nota {
	private Integer idEstudante;
	private Integer idGrade;
	
	public Integer getIdEstudante() {
		return idEstudante;
	}
	public void setIdEstudante(Integer idEstudante) {
		this.idEstudante = idEstudante;
	}
	public Integer getIdGrade() {
		return idGrade;
	}
	public void setIdGrade(Integer idGrade) {
		this.idGrade = idGrade;
	}
	public Nota(Integer idEstudante, Integer idGrade) {
		super();
		this.idEstudante = idEstudante;
		this.idGrade = idGrade;
	}
	
}
