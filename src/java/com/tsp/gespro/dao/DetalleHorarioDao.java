/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.gespro.dao;

import java.util.Date;
import com.tsp.gespro.dto.*;
import com.tsp.gespro.exceptions.*;

public interface DetalleHorarioDao
{
	/** 
	 * Inserts a new row in the detalle_horario table.
	 */
	public DetalleHorarioPk insert(DetalleHorario dto) throws DetalleHorarioDaoException;

	/** 
	 * Updates a single row in the detalle_horario table.
	 */
	public void update(DetalleHorarioPk pk, DetalleHorario dto) throws DetalleHorarioDaoException;

	/** 
	 * Deletes a single row in the detalle_horario table.
	 */
	public void delete(DetalleHorarioPk pk) throws DetalleHorarioDaoException;

	/** 
	 * Returns the rows from the detalle_horario table that matches the specified primary-key value.
	 */
	public DetalleHorario findByPrimaryKey(DetalleHorarioPk pk) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'ID_DETALLE_HORARIO = :idDetalleHorario'.
	 */
	public DetalleHorario findByPrimaryKey(int idDetalleHorario) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria ''.
	 */
	public DetalleHorario[] findAll() throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'ID_DETALLE_HORARIO = :idDetalleHorario'.
	 */
	public DetalleHorario[] findWhereIdDetalleHorarioEquals(int idDetalleHorario) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'ID_HORARIO = :idHorario'.
	 */
	public DetalleHorario[] findWhereIdHorarioEquals(int idHorario) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'DIA = :dia'.
	 */
	public DetalleHorario[] findWhereDiaEquals(String dia) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'HORA_ENTRADA = :horaEntrada'.
	 */
	public DetalleHorario[] findWhereHoraEntradaEquals(Date horaEntrada) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'HORA_SALIDA = :horaSalida'.
	 */
	public DetalleHorario[] findWhereHoraSalidaEquals(Date horaSalida) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'DIA_DESCANSO = :diaDescanso'.
	 */
	public DetalleHorario[] findWhereDiaDescansoEquals(int diaDescanso) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'COMIDA_SALIDA = :comidaSalida'.
	 */
	public DetalleHorario[] findWhereComidaSalidaEquals(Date comidaSalida) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'COMIDA_ENTRADA = :comidaEntrada'.
	 */
	public DetalleHorario[] findWhereComidaEntradaEquals(Date comidaEntrada) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'PERIODO_COMIDA = :periodoComida'.
	 */
	public DetalleHorario[] findWherePeriodoComidaEquals(int periodoComida) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the criteria 'TOLERANCIA = :tolerancia'.
	 */
	public DetalleHorario[] findWhereToleranciaEquals(int tolerancia) throws DetalleHorarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the detalle_horario table that match the specified arbitrary SQL statement
	 */
	public DetalleHorario[] findByDynamicSelect(String sql, Object[] sqlParams) throws DetalleHorarioDaoException;

	/** 
	 * Returns all rows from the detalle_horario table that match the specified arbitrary SQL statement
	 */
	public DetalleHorario[] findByDynamicWhere(String sql, Object[] sqlParams) throws DetalleHorarioDaoException;

}