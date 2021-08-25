package br.org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tb_postagens")
public class Postagem {
	//criar indetificador que gera automaticamente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//forçar o usuario a digitar um titulo que os parametros seja de 5 a 100 e caso o usuatio nao digite exiba a mensagem
	@NotNull(message = "O atributo título é obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo título deve ter no minimo 5 e no maximo 100 caracteres")
	private String titulo;
	//forçar o usuario a digitar um titulo que os parametros seja de 5 a 100 e caso o usuatio nao digite exiba a mensagem
	@NotNull(message = "O atributo texto é obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo texto deve ter no minimo 5 e no maximo 1000 caracteres")
	private String texto;
	//prenche data pegando do sistemas
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis()); //para add os milisegundos
	//Get e settings 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
