package com.nenosystems.service;

import java.util.List;

import com.nenosystems.dto.CollegeDTO;
import com.nenosystems.exception.ApplicationException;
import com.nenosystems.exception.DuplicateRecordException;

/**
 * Business Service Interface of College
 * 
 * @author SUNRAYS Technologies
 * @version 1.0
 * @Copyright (c) SUNRAYS Technologies
 */
public interface CollegeServiceInt {

	/**
	 * Add a College
	 * 
	 * @param dto
	 * @throws ApplicationException
	 * @throws DuplicateRecordException
	 *             : throws when College is already exists
	 */
	public long add(CollegeDTO dto) throws ApplicationException,
			DuplicateRecordException;

	/**
	 * Update a College
	 * 
	 * @param dto
	 * @throws ApplicationException
	 * @throws DuplicateRecordException
	 *             : throws when updated College is already exists
	 */
	public void update(CollegeDTO dto) throws ApplicationException,
			DuplicateRecordException;

	/**
	 * Delete a College
	 * 
	 * @param dto
	 * @throws ApplicationException
	 */
	public void delete(CollegeDTO dto) throws ApplicationException;

	/**
	 * Find College by Name
	 * 
	 * @param name
	 *            : get parameter
	 * @return dto
	 * @throws ApplicationException
	 */
	public CollegeDTO findByName(String name) throws ApplicationException;

	/**
	 * Find College by id
	 * 
	 * @param name
	 *            : get parameter
	 * @return dto
	 * @throws ApplicationException
	 */
	public CollegeDTO findById(long id) throws ApplicationException;

	/**
	 * Get List of Colleges
	 * 
	 * @return list : List of Colleges
	 * @throws ApplicationException
	 */
	public List list() throws ApplicationException;

	/**
	 * Get List of Colleges with pagination
	 * 
	 * @return list : List of Colleges
	 * @param pageNo
	 *            : Current Page No.
	 * @param pageSize
	 *            : Size of Page
	 * @throws ApplicationException
	 */
	public List list(int pageNo, int pageSize) throws ApplicationException;

	/**
	 * Search Colleges
	 * 
	 * @return list : List of Colleges
	 * @param dto
	 *            : Search Parameters
	 * @throws ApplicationException
	 */
	public List search(CollegeDTO dto) throws ApplicationException;

	/**
	 * Search Colleges with pagination
	 * 
	 * @return list : List of Colleges
	 * @param dto
	 *            : Search Parameters
	 * @param pageNo
	 *            : Current Page No.
	 * @param pageSize
	 *            : Size of Page
	 * @throws ApplicationException
	 */
	public List search(CollegeDTO dto, int pageNo, int pageSize)
			throws ApplicationException;

}