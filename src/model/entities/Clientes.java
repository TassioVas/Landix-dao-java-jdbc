package model.entities;

import java.io.Serializable;

public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer cdcl;
	private String dsnome;
	private Integer idtipo;
	private Integer cdvend;
	private Double dslim;
	
	private Vendedores vendedores;
		
	public Clientes() {
	}

	public Clientes(Integer cdcl, String dsnome, Integer idtipo, Integer cdvend, Double dslim) {
		super();
		this.cdcl = cdcl;
		this.dsnome = dsnome;
		this.idtipo = idtipo;
		this.cdvend = cdvend;
		this.dslim = dslim;
	}

	public Integer getCdcl() {
		return cdcl;
	}

	public void setCdcl(Integer cdcl) {
		this.cdcl = cdcl;
	}

	public String getDsnome() {
		return dsnome;
	}

	public void setDsnome(String dsnome) {
		this.dsnome = dsnome;
	}

	public Integer getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(Integer idtipo) {
		this.idtipo = idtipo;
	}

	public Integer getCdvend() {
		return cdvend;
	}

	public void setCdvend(Integer cdvend) {
		this.cdvend = cdvend;
	}

	public Double getDslim() {
		return dslim;
	}

	public void setDslim(Double dslim) {
		this.dslim = dslim;
	}
	public Vendedores getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedores vendedores) {
		this.vendedores = vendedores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdcl == null) ? 0 : cdcl.hashCode());
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
		Clientes other = (Clientes) obj;
		if (cdcl == null) {
			if (other.cdcl != null)
				return false;
		} else if (!cdcl.equals(other.cdcl))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clientes [cdcl=" + cdcl + ", dsnome=" + dsnome + ", idtipo=" + idtipo + ", cdvend=" + cdvend
				+ ", dslim=" + dslim + "]";
	}
}
