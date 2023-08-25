package com.uninter.aulaweb.demoweb.dao;

import java.util.List;

import com.uninter.aulaweb.demoweb.domain.Palavra;

public interface PalavraDao {

	void save(Palavra palavra);
	void update(Palavra palavra);
	void delete(Long id);
	Palavra findById(Long id);
	List<Palavra> findAll();
	
}
