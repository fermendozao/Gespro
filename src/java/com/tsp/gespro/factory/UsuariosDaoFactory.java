/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.factory;

import java.sql.Connection;
import com.tsp.gespro.dao.*;
import com.tsp.gespro.jdbc.*;

public class UsuariosDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return UsuariosDao
	 */
	public static UsuariosDao create()
	{
		return new UsuariosDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return UsuariosDao
	 */
	public static UsuariosDao create(Connection conn)
	{
		return new UsuariosDaoImpl( conn );
	}

}