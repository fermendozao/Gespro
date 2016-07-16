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

public class EstanteriaDescripcionDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EstanteriaDescripcionDao
	 */
	public static EstanteriaDescripcionDao create()
	{
		return new EstanteriaDescripcionDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EstanteriaDescripcionDao
	 */
	public static EstanteriaDescripcionDao create(Connection conn)
	{
		return new EstanteriaDescripcionDaoImpl( conn );
	}

}