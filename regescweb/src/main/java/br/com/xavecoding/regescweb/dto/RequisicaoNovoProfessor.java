package br.com.xavecoding.regescweb.dto;
import java.math.BigDecimal;

import br.com.xavecoding.models.Professor;
import br.com.xavecoding.models.StatusProfessor;

//Classe DTO: Data Transfer Object
public class RequisicaoNovoProfessor {
	private String nome;	
	private BigDecimal salario;
	private StatusProfessor statusProfessor;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public StatusProfessor getStatusProfessor() {
		return statusProfessor;
	}
	public void setStatusProfessor(StatusProfessor statusProfessor) {
		this.statusProfessor = statusProfessor;
	}
	
	public Professor toProfessor() {
		Professor professor = new Professor();
		professor.setNome(this.nome);
		professor.setSalario(this.salario);
		professor.setStatusProfessor(this.statusProfessor);
		
		return professor;
	}
	
	@Override
	public String toString() {
		return "RequisicaoNovoProfessor [nome=" + nome + ", salario=" + salario + ", statusProfessor=" + statusProfessor
				+ "]";
	}
	
	
	
	
	
	
	

}
