package com.cursoudemy.springboot.entidades;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_ordem")
public class Ordem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ordem;
	private Instant momento;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Usuario cliente;
	
	public Ordem() {
		
	}

	public Ordem(Long id_ordem, Instant momento, Usuario cliente) {
		super();
		this.id_ordem = id_ordem;
		this.momento = momento;
		this.cliente = cliente;
	}

	public Long getId_ordem() {
		return id_ordem;
	}

	public void setId_ordem(Long id_ordem) {
		this.id_ordem = id_ordem;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_ordem == null) ? 0 : id_ordem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordem other = (Ordem) obj;
		if (id_ordem == null) {
			if (other.id_ordem != null)
				return false;
		} else if (!id_ordem.equals(other.id_ordem))
			return false;
		return true;
	}
	
	
}
