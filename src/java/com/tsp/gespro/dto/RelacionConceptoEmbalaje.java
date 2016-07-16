/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dto;

import com.tsp.gespro.dao.*;
import com.tsp.gespro.factory.*;
import com.tsp.gespro.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class RelacionConceptoEmbalaje implements Serializable
{
	/** 
	 * This attribute maps to the column ID_RELACION in the relacion_concepto_embalaje table.
	 */
	protected int idRelacion;

	/** 
	 * This attribute represents whether the attribute idRelacion has been modified since being read from the database.
	 */
	protected boolean idRelacionModified = false;

	/** 
	 * This attribute maps to the column ID_CONCEPTO in the relacion_concepto_embalaje table.
	 */
	protected int idConcepto;

	/** 
	 * This attribute represents whether the primitive attribute idConcepto is null.
	 */
	protected boolean idConceptoNull = true;

	/** 
	 * This attribute represents whether the attribute idConcepto has been modified since being read from the database.
	 */
	protected boolean idConceptoModified = false;

	/** 
	 * This attribute maps to the column ID_EMBALAJE in the relacion_concepto_embalaje table.
	 */
	protected int idEmbalaje;

	/** 
	 * This attribute represents whether the primitive attribute idEmbalaje is null.
	 */
	protected boolean idEmbalajeNull = true;

	/** 
	 * This attribute represents whether the attribute idEmbalaje has been modified since being read from the database.
	 */
	protected boolean idEmbalajeModified = false;

	/** 
	 * This attribute maps to the column CANTIDAD in the relacion_concepto_embalaje table.
	 */
	protected double cantidad;

	/** 
	 * This attribute represents whether the primitive attribute cantidad is null.
	 */
	protected boolean cantidadNull = true;

	/** 
	 * This attribute represents whether the attribute cantidad has been modified since being read from the database.
	 */
	protected boolean cantidadModified = false;

	/**
	 * Method 'RelacionConceptoEmbalaje'
	 * 
	 */
	public RelacionConceptoEmbalaje()
	{
	}

	/**
	 * Method 'getIdRelacion'
	 * 
	 * @return int
	 */
	public int getIdRelacion()
	{
		return idRelacion;
	}

	/**
	 * Method 'setIdRelacion'
	 * 
	 * @param idRelacion
	 */
	public void setIdRelacion(int idRelacion)
	{
		this.idRelacion = idRelacion;
		this.idRelacionModified = true;
	}

	/** 
	 * Sets the value of idRelacionModified
	 */
	public void setIdRelacionModified(boolean idRelacionModified)
	{
		this.idRelacionModified = idRelacionModified;
	}

	/** 
	 * Gets the value of idRelacionModified
	 */
	public boolean isIdRelacionModified()
	{
		return idRelacionModified;
	}

	/**
	 * Method 'getIdConcepto'
	 * 
	 * @return int
	 */
	public int getIdConcepto()
	{
		return idConcepto;
	}

	/**
	 * Method 'setIdConcepto'
	 * 
	 * @param idConcepto
	 */
	public void setIdConcepto(int idConcepto)
	{
		this.idConcepto = idConcepto;
		this.idConceptoNull = false;
		this.idConceptoModified = true;
	}

	/**
	 * Method 'setIdConceptoNull'
	 * 
	 * @param value
	 */
	public void setIdConceptoNull(boolean value)
	{
		this.idConceptoNull = value;
		this.idConceptoModified = true;
	}

	/**
	 * Method 'isIdConceptoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdConceptoNull()
	{
		return idConceptoNull;
	}

	/** 
	 * Sets the value of idConceptoModified
	 */
	public void setIdConceptoModified(boolean idConceptoModified)
	{
		this.idConceptoModified = idConceptoModified;
	}

	/** 
	 * Gets the value of idConceptoModified
	 */
	public boolean isIdConceptoModified()
	{
		return idConceptoModified;
	}

	/**
	 * Method 'getIdEmbalaje'
	 * 
	 * @return int
	 */
	public int getIdEmbalaje()
	{
		return idEmbalaje;
	}

	/**
	 * Method 'setIdEmbalaje'
	 * 
	 * @param idEmbalaje
	 */
	public void setIdEmbalaje(int idEmbalaje)
	{
		this.idEmbalaje = idEmbalaje;
		this.idEmbalajeNull = false;
		this.idEmbalajeModified = true;
	}

	/**
	 * Method 'setIdEmbalajeNull'
	 * 
	 * @param value
	 */
	public void setIdEmbalajeNull(boolean value)
	{
		this.idEmbalajeNull = value;
		this.idEmbalajeModified = true;
	}

	/**
	 * Method 'isIdEmbalajeNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmbalajeNull()
	{
		return idEmbalajeNull;
	}

	/** 
	 * Sets the value of idEmbalajeModified
	 */
	public void setIdEmbalajeModified(boolean idEmbalajeModified)
	{
		this.idEmbalajeModified = idEmbalajeModified;
	}

	/** 
	 * Gets the value of idEmbalajeModified
	 */
	public boolean isIdEmbalajeModified()
	{
		return idEmbalajeModified;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return double
	 */
	public double getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(double cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadNull = false;
		this.cantidadModified = true;
	}

	/**
	 * Method 'setCantidadNull'
	 * 
	 * @param value
	 */
	public void setCantidadNull(boolean value)
	{
		this.cantidadNull = value;
		this.cantidadModified = true;
	}

	/**
	 * Method 'isCantidadNull'
	 * 
	 * @return boolean
	 */
	public boolean isCantidadNull()
	{
		return cantidadNull;
	}

	/** 
	 * Sets the value of cantidadModified
	 */
	public void setCantidadModified(boolean cantidadModified)
	{
		this.cantidadModified = cantidadModified;
	}

	/** 
	 * Gets the value of cantidadModified
	 */
	public boolean isCantidadModified()
	{
		return cantidadModified;
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
		
		if (!(_other instanceof RelacionConceptoEmbalaje)) {
			return false;
		}
		
		final RelacionConceptoEmbalaje _cast = (RelacionConceptoEmbalaje) _other;
		if (idRelacion != _cast.idRelacion) {
			return false;
		}
		
		if (idRelacionModified != _cast.idRelacionModified) {
			return false;
		}
		
		if (idConcepto != _cast.idConcepto) {
			return false;
		}
		
		if (idConceptoNull != _cast.idConceptoNull) {
			return false;
		}
		
		if (idConceptoModified != _cast.idConceptoModified) {
			return false;
		}
		
		if (idEmbalaje != _cast.idEmbalaje) {
			return false;
		}
		
		if (idEmbalajeNull != _cast.idEmbalajeNull) {
			return false;
		}
		
		if (idEmbalajeModified != _cast.idEmbalajeModified) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadNull != _cast.cantidadNull) {
			return false;
		}
		
		if (cantidadModified != _cast.cantidadModified) {
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
		_hashCode = 29 * _hashCode + idRelacion;
		_hashCode = 29 * _hashCode + (idRelacionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idConcepto;
		_hashCode = 29 * _hashCode + (idConceptoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idConceptoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmbalaje;
		_hashCode = 29 * _hashCode + (idEmbalajeNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmbalajeModified ? 1 : 0);
		long temp_cantidad = Double.doubleToLongBits(cantidad);
		_hashCode = 29 * _hashCode + (int) (temp_cantidad ^ (temp_cantidad >>> 32));
		_hashCode = 29 * _hashCode + (cantidadNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (cantidadModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return RelacionConceptoEmbalajePk
	 */
	public RelacionConceptoEmbalajePk createPk()
	{
		return new RelacionConceptoEmbalajePk(idRelacion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.gespro.dto.RelacionConceptoEmbalaje: " );
		ret.append( "idRelacion=" + idRelacion );
		ret.append( ", idConcepto=" + idConcepto );
		ret.append( ", idEmbalaje=" + idEmbalaje );
		ret.append( ", cantidad=" + cantidad );
		return ret.toString();
	}

}