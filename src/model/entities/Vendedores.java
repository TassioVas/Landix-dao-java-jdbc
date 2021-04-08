package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Vendedores implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer codvend;
	private String dsnome;
	private Integer cdtab;
	private Date dtnasc;
	
	public Vendedores() {
		
	}

	public Vendedores(Integer codvend, String dsnome, Integer cdtab, Date dtnasc) {
		this.codvend = codvend;
		this.dsnome = dsnome;
		this.cdtab = cdtab;
		this.dtnasc = dtnasc;
	}

	public Integer getcodvend() {
		return codvend;
	}

	public void setcodvend(Integer codvend) {
		this.codvend = codvend;
	}

	public String getdsnome() {
		return dsnome;
	}

	public void setdsnome(String dsnome) {
		this.dsnome = dsnome;
	}

	public Integer getcdtab() {
		return cdtab;
	}

	public void setcdtab(Integer cdtab) {
		this.cdtab = cdtab;
	}

	public Date getdtnasc() {
		return dtnasc;
	}

	public void setdtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codvend == null) ? 0 : codvend.hashCode());
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
		Vendedores other = (Vendedores) obj;
		if (codvend == null) {
			if (other.codvend != null)
				return false;
		} else if (!codvend.equals(other.codvend))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "vendedores [codvend=" + codvend + ", dsnome=" + dsnome + ", cdtab=" + cdtab + ", dtnasc=" + dtnasc
				+ "]";
	}

	public void setIdtipo(int int1) {
		// TODO Auto-generated method stub
		
	}
}
