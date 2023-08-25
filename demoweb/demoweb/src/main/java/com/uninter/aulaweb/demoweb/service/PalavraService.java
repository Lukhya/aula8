package com.uninter.aulaweb.demoweb.service;

import java.util.List;

import com.uninter.aulaweb.demoweb.domain.Palavra;




public interface PalavraService {
	void salvar(Palavra palavra);

    void editar(Palavra palavra);

    void excluir(Long id);

    Palavra buscarPorId(Long id);
    
    List<Palavra> buscarTodos();



}
