package br.com.fiap.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_SISTEMAS")
@SequenceGenerator(name="sistemas",sequenceName="SQ_TB_SISTEMAS", allocationSize = 1)
public class Sistemas {
	
	
	@Id
	@GeneratedValue(generator="sistemas",strategy=GenerationType.SEQUENCE)
	@Column(name="cod_sistema")
	private int codigo;
	
	@Column(name="nom_sistema")
	private String nome;
	
	
	//1 sistema para muitos casos
	//Mappedy by na onde nao vai a chave classe mae
	@OneToMany(mappedBy="cod_sistema")
	private List<Caso> casos = new ArrayList<>();
	
	
	
	
	
	

}
