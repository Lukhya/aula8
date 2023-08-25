package com.uninter.aulaweb.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uninter.aulaweb.demoweb.dao.PalavraDao;
import com.uninter.aulaweb.demoweb.domain.Palavra;



@Service @Transactional(readOnly=false)

public class PalavraServiceImpl implements PalavraService {
	
	@Autowired
	private PalavraDao dao;

	@Override
	public void salvar(Palavra palavra) {
		dao.save(palavra);
		
	}

	@Override
	public void editar(Palavra palavra) {
		dao.update(palavra);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly=true)
	public Palavra buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly=true)
	public List<Palavra> buscarTodos() {
		
		return dao.findAll();
	}

	
}
