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
 * This class represents the primary key of the sgfens_pedido_impuesto table.
 */
public class SgfensPedidoImpuestoPk implements Serializable
{
	protected int idPedido;

	protected int idImpuesto;

	/** 
	 * This attribute represents whether the primitive attribute idPedido is null.
	 */
	protected boolean idPedidoNull;

	/** 
	 * This attribute represents whether the primitive attribute idImpuesto is null.
	 */
	protected boolean idImpuestoNull;

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
	 * Sets the value of idImpuesto
	 */
	public void setIdImpuesto(int idImpuesto)
	{
		this.idImpuesto = idImpuesto;
	}

	/** 
	 * Gets the value of idImpuesto
	 */
	public int getIdImpuesto()
	{
		return idImpuesto;
	}

	/**
	 * Method 'SgfensPedidoImpuestoPk'
	 * 
	 */
	public SgfensPedidoImpuestoPk()
	{
	}

	/**
	 * Method 'SgfensPedidoImpuestoPk'
	 * 
	 * @param idPedido
	 * @param idImpuesto
	 */
	public SgfensPedidoImpuestoPk(final int idPedido, final int idImpuesto)
	{
		this.idPedido = idPedido;
		this.idImpuesto = idImpuesto;
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
	 * Sets the value of idImpuestoNull
	 */
	public void setIdImpuestoNull(boolean idImpuestoNull)
	{
		this.idImpuestoNull = idImpuestoNull;
	}

	/** 
	 * Gets the value of idImpuestoNull
	 */
	public boolean isIdImpuestoNull()
	{
		return idImpuestoNull;
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
		
		if (!(_other instanceof SgfensPedidoImpuestoPk)) {
			return false;
		}
		
		final SgfensPedidoImpuestoPk _cast = (SgfensPedidoImpuestoPk) _other;
		if (idPedido != _cast.idPedido) {
			return false;
		}
		
		if (idImpuesto != _cast.idImpuesto) {
			return false;
		}
		
		if (idPedidoNull != _cast.idPedidoNull) {
			return false;
		}
		
		if (idImpuestoNull != _cast.idImpuestoNull) {
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
		_hashCode = 29 * _hashCode + idImpuesto;
		_hashCode = 29 * _hashCode + (idPedidoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idImpuestoNull ? 1 : 0);
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
		ret.append( "com.tsp.gespro.dto.SgfensPedidoImpuestoPk: " );
		ret.append( "idPedido=" + idPedido );
		ret.append( ", idImpuesto=" + idImpuesto );
		return ret.toString();
	}

}