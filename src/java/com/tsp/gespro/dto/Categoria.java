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

public class Categoria implements Serializable
{
	/** 
	 * This attribute maps to the column id_categoria in the categoria table.
	 */
	protected int idCategoria;

	/** 
	 * This attribute represents whether the attribute idCategoria has been modified since being read from the database.
	 */
	protected boolean idCategoriaModified = false;

	/** 
	 * This attribute maps to the column nombre_categoria in the categoria table.
	 */
	protected String nombreCategoria;

	/** 
	 * This attribute represents whether the attribute nombreCategoria has been modified since being read from the database.
	 */
	protected boolean nombreCategoriaModified = false;

	/** 
	 * This attribute maps to the column descripcion_categoria in the categoria table.
	 */
	protected String descripcionCategoria;

	/** 
	 * This attribute represents whether the attribute descripcionCategoria has been modified since being read from the database.
	 */
	protected boolean descripcionCategoriaModified = false;

	/** 
	 * This attribute maps to the column id_categoria_padre in the categoria table.
	 */
	protected int idCategoriaPadre;

	/** 
	 * This attribute represents whether the primitive attribute idCategoriaPadre is null.
	 */
	protected boolean idCategoriaPadreNull = true;

	/** 
	 * This attribute represents whether the attribute idCategoriaPadre has been modified since being read from the database.
	 */
	protected boolean idCategoriaPadreModified = false;

	/** 
	 * This attribute maps to the column id_empresa in the categoria table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the categoria table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/**
	 * Method 'Categoria'
	 * 
	 */
	public Categoria()
	{
	}

	/**
	 * Method 'getIdCategoria'
	 * 
	 * @return int
	 */
	public int getIdCategoria()
	{
		return idCategoria;
	}

	/**
	 * Method 'setIdCategoria'
	 * 
	 * @param idCategoria
	 */
	public void setIdCategoria(int idCategoria)
	{
		this.idCategoria = idCategoria;
		this.idCategoriaModified = true;
	}

	/** 
	 * Sets the value of idCategoriaModified
	 */
	public void setIdCategoriaModified(boolean idCategoriaModified)
	{
		this.idCategoriaModified = idCategoriaModified;
	}

	/** 
	 * Gets the value of idCategoriaModified
	 */
	public boolean isIdCategoriaModified()
	{
		return idCategoriaModified;
	}

	/**
	 * Method 'getNombreCategoria'
	 * 
	 * @return String
	 */
	public String getNombreCategoria()
	{
		return nombreCategoria;
	}

	/**
	 * Method 'setNombreCategoria'
	 * 
	 * @param nombreCategoria
	 */
	public void setNombreCategoria(String nombreCategoria)
	{
		this.nombreCategoria = nombreCategoria;
		this.nombreCategoriaModified = true;
	}

	/** 
	 * Sets the value of nombreCategoriaModified
	 */
	public void setNombreCategoriaModified(boolean nombreCategoriaModified)
	{
		this.nombreCategoriaModified = nombreCategoriaModified;
	}

	/** 
	 * Gets the value of nombreCategoriaModified
	 */
	public boolean isNombreCategoriaModified()
	{
		return nombreCategoriaModified;
	}

	/**
	 * Method 'getDescripcionCategoria'
	 * 
	 * @return String
	 */
	public String getDescripcionCategoria()
	{
		return descripcionCategoria;
	}

	/**
	 * Method 'setDescripcionCategoria'
	 * 
	 * @param descripcionCategoria
	 */
	public void setDescripcionCategoria(String descripcionCategoria)
	{
		this.descripcionCategoria = descripcionCategoria;
		this.descripcionCategoriaModified = true;
	}

	/** 
	 * Sets the value of descripcionCategoriaModified
	 */
	public void setDescripcionCategoriaModified(boolean descripcionCategoriaModified)
	{
		this.descripcionCategoriaModified = descripcionCategoriaModified;
	}

	/** 
	 * Gets the value of descripcionCategoriaModified
	 */
	public boolean isDescripcionCategoriaModified()
	{
		return descripcionCategoriaModified;
	}

	/**
	 * Method 'getIdCategoriaPadre'
	 * 
	 * @return int
	 */
	public int getIdCategoriaPadre()
	{
		return idCategoriaPadre;
	}

	/**
	 * Method 'setIdCategoriaPadre'
	 * 
	 * @param idCategoriaPadre
	 */
	public void setIdCategoriaPadre(int idCategoriaPadre)
	{
		this.idCategoriaPadre = idCategoriaPadre;
		this.idCategoriaPadreNull = false;
		this.idCategoriaPadreModified = true;
	}

	/**
	 * Method 'setIdCategoriaPadreNull'
	 * 
	 * @param value
	 */
	public void setIdCategoriaPadreNull(boolean value)
	{
		this.idCategoriaPadreNull = value;
		this.idCategoriaPadreModified = true;
	}

	/**
	 * Method 'isIdCategoriaPadreNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdCategoriaPadreNull()
	{
		return idCategoriaPadreNull;
	}

	/** 
	 * Sets the value of idCategoriaPadreModified
	 */
	public void setIdCategoriaPadreModified(boolean idCategoriaPadreModified)
	{
		this.idCategoriaPadreModified = idCategoriaPadreModified;
	}

	/** 
	 * Gets the value of idCategoriaPadreModified
	 */
	public boolean isIdCategoriaPadreModified()
	{
		return idCategoriaPadreModified;
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
	 * Method 'getIdEstatus'
	 * 
	 * @return int
	 */
	public int getIdEstatus()
	{
		return idEstatus;
	}

	/**
	 * Method 'setIdEstatus'
	 * 
	 * @param idEstatus
	 */
	public void setIdEstatus(int idEstatus)
	{
		this.idEstatus = idEstatus;
		this.idEstatusModified = true;
	}

	/** 
	 * Sets the value of idEstatusModified
	 */
	public void setIdEstatusModified(boolean idEstatusModified)
	{
		this.idEstatusModified = idEstatusModified;
	}

	/** 
	 * Gets the value of idEstatusModified
	 */
	public boolean isIdEstatusModified()
	{
		return idEstatusModified;
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
		
		if (!(_other instanceof Categoria)) {
			return false;
		}
		
		final Categoria _cast = (Categoria) _other;
		if (idCategoria != _cast.idCategoria) {
			return false;
		}
		
		if (idCategoriaModified != _cast.idCategoriaModified) {
			return false;
		}
		
		if (nombreCategoria == null ? _cast.nombreCategoria != nombreCategoria : !nombreCategoria.equals( _cast.nombreCategoria )) {
			return false;
		}
		
		if (nombreCategoriaModified != _cast.nombreCategoriaModified) {
			return false;
		}
		
		if (descripcionCategoria == null ? _cast.descripcionCategoria != descripcionCategoria : !descripcionCategoria.equals( _cast.descripcionCategoria )) {
			return false;
		}
		
		if (descripcionCategoriaModified != _cast.descripcionCategoriaModified) {
			return false;
		}
		
		if (idCategoriaPadre != _cast.idCategoriaPadre) {
			return false;
		}
		
		if (idCategoriaPadreNull != _cast.idCategoriaPadreNull) {
			return false;
		}
		
		if (idCategoriaPadreModified != _cast.idCategoriaPadreModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
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
		_hashCode = 29 * _hashCode + idCategoria;
		_hashCode = 29 * _hashCode + (idCategoriaModified ? 1 : 0);
		if (nombreCategoria != null) {
			_hashCode = 29 * _hashCode + nombreCategoria.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreCategoriaModified ? 1 : 0);
		if (descripcionCategoria != null) {
			_hashCode = 29 * _hashCode + descripcionCategoria.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionCategoriaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCategoriaPadre;
		_hashCode = 29 * _hashCode + (idCategoriaPadreNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idCategoriaPadreModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CategoriaPk
	 */
	public CategoriaPk createPk()
	{
		return new CategoriaPk(idCategoria);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.gespro.dto.Categoria: " );
		ret.append( "idCategoria=" + idCategoria );
		ret.append( ", nombreCategoria=" + nombreCategoria );
		ret.append( ", descripcionCategoria=" + descripcionCategoria );
		ret.append( ", idCategoriaPadre=" + idCategoriaPadre );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEstatus=" + idEstatus );
		return ret.toString();
	}

}