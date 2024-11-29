package br.com.sysgese.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="PERFIL")
public class Perfil extends EntityBase {

	@Column(name="DESCRICAO", nullable = false)
	private String Descricao;
	

}
