package br.com.logicaoo.aula3;

public class Grade {
		private Integer id;
		private String idDisciplina;
		private String semestre;
		private Integer ano;
		private String professor;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getIdDisciplina() {
			return idDisciplina;
		}
		public void setIdDisciplina(String idDisciplina) {
			this.idDisciplina = idDisciplina;
		}
		public String getSemestre() {
			return semestre;
		}
		public void setSemestre(String semestre) {
			this.semestre = semestre;
		}
		public Integer getAno() {
			return ano;
		}
		public void setAno(Integer ano) {
			this.ano = ano;
		}
		public String getProfessor() {
			return professor;
		}
		public void setProfessor(String professor) {
			this.professor = professor;
		}
		public Grade(Integer id, String idDisciplina, String semestre, Integer ano, String professor) {
			super();
			this.id = id;
			this.idDisciplina = idDisciplina;
			this.semestre = semestre;
			this.ano = ano;
			this.professor = professor;
		}
		
}
