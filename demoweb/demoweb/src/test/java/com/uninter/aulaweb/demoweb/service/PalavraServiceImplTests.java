package com.uninter.aulaweb.demoweb.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.uninter.aulaweb.demoweb.domain.Palavra;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class PalavraServiceImplTests {
	@Autowired
	private PalavraService service;
	@Test
	void testSalvar() {
		Palavra pl = new Palavra();
		
		pl.setNome("Software");
		pl.setSignificado("soft");
	}

	@Test
	void testEditar() {
		fail("Not yet implemented");
	}

	@Test
	void testExcluir() {
		fail("Not yet implemented");
	}

	@Test
	void testBuscarPorId() {
		fail("Not yet implemented");
	}

	@Test
	void testBuscarTodos() {
		fail("Not yet implemented");
	}

}
