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

public class ImagenPersonal implements Serializable
{
	/** 
	 * This attribute maps to the column ID_IMAGEN_PERSONAL in the imagen_personal table.
	 */
	protected int idImagenPersonal;

	/** 
	 * This attribute represents whether the attribute idImagenPersonal has been modified since being read from the database.
	 */
	protected boolean idImagenPersonalModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the imagen_personal table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_IMAGEN in the imagen_personal table.
	 */
	protected String nombreImagen;

	/** 
	 * This attribute represents whether the attribute nombreImagen has been modified since being read from the database.
	 */
	protected boolean nombreImagenModified = false;

	/** 
	 * This attribute maps to the column UTILIZAR in the imagen_personal table.
	 */
	protected short utilizar;

	/** 
	 * This attribute represents whether the primitive attribute utilizar is null.
	 */
	protected boolean utilizarNull = true;

	/** 
	 * This attribute represents whether the attribute utilizar has been modified since being read from the database.
	 */
	protected boolean utilizarModified = false;

	/**
	 * Method 'ImagenPersonal'
	 * 
	 */
	public ImagenPersonal()
	{
	}

	/**
	 * Method 'getIdImagenPersonal'
	 * 
	 * @return int
	 */
	public int getIdImagenPersonal()
	{
		return idImagenPersonal;
	}

	/**
	 * Method 'setIdImagenPersonal'
	 * 
	 * @param idImagenPersonal
	 */
	public void setIdImagenPersonal(int idImagenPersonal)
	{
		this.idImagenPersonal = idImagenPersonal;
		this.idImagenPersonalModified = true;
	}

	/** 
	 * Sets the value of idImagenPersonalModified
	 */
	public void setIdImagenPersonalModified(boolean idImagenPersonalModified)
	{
		this.idImagenPersonalModified = idImagenPersonalModified;
	}

	/** 
	 * Gets the value of idImagenPersonalModified
	 */
	public boolean isIdImagenPersonalModified()
	{
		return idImagenPersonalModified;
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
		this.idEmpresaModified = true;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
	}

	/**
	 * Method 'getNombreImagen'
	 * 
	 * @return String
	 */
	public String getNombreImagen()
	{
		return nombreImagen;
	}

	/**
	 * Method 'setNombreImagen'
	 * 
	 * @param nombreImagen
	 */
	public void setNombreImagen(String nombreImagen)
	{
		this.nombreImagen = nombreImagen;
		this.nombreImagenModified = true;
	}

	/** 
	 * Sets the value of nombreImagenModified
	 */
	public void setNombreImagenModified(boolean nombreImagenModified)
	{
		this.nombreImagenModified = nombreImagenModified;
	}

	/** 
	 * Gets the value of nombreImagenModified
	 */
	public boolean isNombreImagenModified()
	{
		return nombreImagenModified;
	}

	/**
	 * Method 'getUtilizar'
	 * 
	 * @return short
	 */
	public short getUtilizar()
	{
		return utilizar;
	}

	/**
	 * Method 'setUtilizar'
	 * 
	 * @param utilizar
	 */
	public void setUtilizar(short utilizar)
	{
		this.utilizar = utilizar;
		this.utilizarNull = false;
		this.utilizarModified = true;
	}

	/**
	 * Method 'setUtilizarNull'
	 * 
	 * @param value
	 */
	public void setUtilizarNull(boolean value)
	{
		this.utilizarNull = value;
		this.utilizarModified = true;
	}

	/**
	 * Method 'isUtilizarNull'
	 * 
	 * @return boolean
	 */
	public boolean isUtilizarNull()
	{
		return utilizarNull;
	}

	/** 
	 * Sets the value of utilizarModified
	 */
	public void setUtilizarModified(boolean utilizarModified)
	{
		this.utilizarModified = utilizarModified;
	}

	/** 
	 * Gets the value of utilizarModified
	 */
	public boolean isUtilizarModified()
	{
		return utilizarModified;
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
		
		if (!(_other instanceof ImagenPersonal)) {
			return false;
		}
		
		final ImagenPersonal _cast = (ImagenPersonal) _other;
		if (idImagenPersonal != _cast.idImagenPersonal) {
			return false;
		}
		
		if (idImagenPersonalModified != _cast.idImagenPersonalModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (nombreImagen == null ? _cast.nombreImagen != nombreImagen : !nombreImagen.equals( _cast.nombreImagen )) {
			return false;
		}
		
		if (nombreImagenModified != _cast.nombreImagenModified) {
			return false;
		}
		
		if (utilizar != _cast.utilizar) {
			return false;
		}
		
		if (utilizarNull != _cast.utilizarNull) {
			return false;
		}
		
		if (utilizarModified != _cast.utilizarModified) {
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
		_hashCode = 29 * _hashCode + idImagenPersonal;
		_hashCode = 29 * _hashCode + (idImagenPersonalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (nombreImagen != null) {
			_hashCode = 29 * _hashCode + nombreImagen.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreImagenModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) utilizar;
		_hashCode = 29 * _hashCode + (utilizarNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (utilizarModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ImagenPersonalPk
	 */
	public ImagenPersonalPk createPk()
	{
		return new ImagenPersonalPk(idImagenPersonal);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.gespro.dto.ImagenPersonal: " );
		ret.append( "idImagenPersonal=" + idImagenPersonal );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", nombreImagen=" + nombreImagen );
		ret.append( ", utilizar=" + utilizar );
		return ret.toString();
	}

}