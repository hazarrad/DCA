package com.etu.DAO;

import java.util.List;

public interface IDAO<TypeDTO> { // Interface g�n�rique � impl�menter par tous les DAOs
	// Utilisation de la g�n�ricit� avec le type <TypeDTO>
	public boolean create(TypeDTO typeDTO);

	public TypeDTO read(Object key);

	public List<TypeDTO> readAll();

	public boolean update(TypeDTO typeDTO);

	public boolean delete(Object key);
}