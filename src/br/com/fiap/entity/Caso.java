package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TAB_CASO_TESTE")
@SequenceGenerator(name="caso",sequenceName="SQ_TB_CASO", allocationSize = 1)
public class Caso {

	@Id
	@GeneratedValue(generator="caso",strategy=GenerationType.SEQUENCE)
	@Column(name="cod_caso_teste")
	private int codigo;
	
	@Column(name="nom_caso_teste")
	private String nome;
	
	@Column(name="desc_caso_teste")
	private String descricao;
	
	@ManyToOne()
	@JoinColumn(name="cd_sistema")
	private Sistemas sistema;
	
	@OneToMany(mappedBy="caso")
	private List<Item> item = new ArrayList<>();
	
	
	
}
