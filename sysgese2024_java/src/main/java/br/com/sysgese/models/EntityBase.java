package br.com.sysgese.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public  abstract class EntityBase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "STATUS")
	private int Status;
	
	@Column(name = "DATA_CAD")
	private Date DataCad;
	
	@Column(name = "DATA_ALT")
	private Date DataAlt;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public Date getDataCad() {
		return DataCad;
	}
	public void setDataCad(Date dataCad) {
		DataCad = dataCad;
	}
	public Date getDataAlt() {
		return DataAlt;
	}
	public void setDataAlt(Date dataAlt) {
		DataAlt = dataAlt;
	}
	
	

}
