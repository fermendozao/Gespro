/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the sgfens_pedido_producto table.
 */
public class SgfensPedidoProductoPk implements Serializable
{
	protected int idPedido;

	protected int idConcepto;

	/** 
	 * This attribute represents whether the primitive attribute idPedido is null.
	 */
	protected boolean idPedidoNull;

	/** 
	 * This attribute represents whether the primitive attribute idConcepto is null.
	 */
	protected boolean idConceptoNull;

	/** 
	 * Sets the value of idPedido
	 */
	public void setIdPedido(int idPedido)
	{
		this.idPedido = idPedido;
	}

	/** 
	 * Gets the value of idPedido
	 */
	public int getIdPedido()
	{
		return idPedido;
	}

	/** 
	 * Sets the value of idConcepto
	 */
	public void setIdConcepto(int idConcepto)
	{
		this.idConcepto = idConcepto;
	}

	/** 
	 * Gets the value of idConcepto
	 */
	public int getIdConcepto()
	{
		return idConcepto;
	}

	/**
	 * Method 'SgfensPedidoProductoPk'
	 * 
	 */
	public SgfensPedidoProductoPk()
	{
	}

	/**
	 * Method 'SgfensPedidoProductoPk'
	 * 
	 * @param idPedido
	 * @param idConcepto
	 */
	public SgfensPedidoProductoPk(final int idPedido, final int idConcepto)
	{
		this.idPedido = idPedido;
		this.idConcepto = idConcepto;
	}

	/** 
	 * Sets the value of idPedidoNull
	 */
	public void setIdPedidoNull(boolean idPedidoNull)
	{
		this.idPedidoNull = idPedidoNull;
	}

	/** 
	 * Gets the value of idPedidoNull
	 */
	public boolean isIdPedidoNull()
	{
		return idPedidoNull;
	}

	/** 
	 * Sets the value of idConceptoNull
	 */
	public void setIdConceptoNull(boolean idConceptoNull)
	{
		this.idConceptoNull = idConceptoNull;
	}

	/** 
	 * Gets the value of idConceptoNull
	 */
	public boolean isIdConceptoNull()
	{
		return idConceptoNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SgfensPedidoProductoPk)) {
			return false;
		}
		
		final SgfensPedidoProductoPk _cast = (SgfensPedidoProductoPk) _other;
		if (idPedido != _cast.idPedido) {
			return false;
		}
		
		if (idConcepto != _cast.idConcepto) {
			return false;
		}
		
		if (idPedidoNull != _cast.idPedidoNull) {
			return false;
		}
		
		if (idConceptoNull != _cast.idConceptoNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idPedido;
		_hashCode = 29 * _hashCode + idConcepto;
		_hashCode = 29 * _hashCode + (idPedidoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idConceptoNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.gespro.dto.SgfensPedidoProductoPk: " );
		ret.append( "idPedido=" + idPedido );
		ret.append( ", idConcepto=" + idConcepto );
		return ret.toString();
	}

}