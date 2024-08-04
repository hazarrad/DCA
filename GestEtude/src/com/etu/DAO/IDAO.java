package com.etu.DAO;

import java.util.List;

public interface IDAO<TypeDTO> { // Interface générique à implémenter par tous les DAOs
	// Utilisation de la généricité avec le type <TypeDTO>
	public boolean create(TypeDTO typeDTO);

	public TypeDTO read(Object key);

	public List<TypeDTO> readAll();

	public boolean update(TypeDTO typeDTO);

	public boolean delete(Object key);
}