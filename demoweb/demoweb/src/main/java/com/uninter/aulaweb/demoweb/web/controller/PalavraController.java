package com.uninter.aulaweb.demoweb.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.uninter.aulaweb.demoweb.domain.Palavra;
import com.uninter.aulaweb.demoweb.service.PalavraService;

@Controller
@RequestMapping("/palavras")
public class PalavraController {
@Autowired
	private PalavraService service;

	@GetMapping("/cadastrar")
	public String cadastrar(Palavra palavra) {
		return "/palavra/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model ) {
		model.addAttribute("palavras", service.buscarTodos());
		return "palavra/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(@Valid Palavra palavra,BindingResult result,RedirectAttributes attr) {
		if (result.hasErrors()) {
			return "/palavra/cadastro";
		}
		
		service.salvar(palavra);
		attr.addFlashAttribute("success", "Palavra salva com sucesso.");
		return "redirect:/palavras/cadastrar";
	}
@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("palavra", service.buscarPorId(id));
		return "/palavra/cadastro";
	}

@PostMapping("/editar")
public String editar(@Valid Palavra palavra,BindingResult result,RedirectAttributes attr) {
	if (result.hasErrors()) {
		return "/palavra/cadastro";
	}
	service.editar(palavra);
	attr.addFlashAttribute("success", "Palavra editada com sucesso.");
	return "redirect:/palavras/cadastrar";
}

@GetMapping("/excluir/{id}")
public String excluir(@PathVariable("id") Long id, ModelMap model) {
	service.excluir(id);
	model.addAttribute("success", "Palavra excluída com sucesso.");
	return listar(model);
}

	

	
}
