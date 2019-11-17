package com.springboot.netclodx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.netclodx.models.entity.Menu;
import com.springboot.netclodx.models.entity.Usuario;
import com.springboot.netclodx.models.interfaces.IMenuService;
import com.springboot.netclodx.models.interfaces.IUsuarioService;

@CrossOrigin(origins = { "http://localhost:4200", "*" })
@RestController
@RequestMapping("/api/usuarios")
public class RestUsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IMenuService menuService;
	
	@PostMapping("/buscar")
	public Usuario buscar(@RequestParam Long id) {
		return usuarioService.findByUserId(id);
	}
	
	@PostMapping("/buscar-menu")
	public List<Menu> buscarMenu(@RequestParam Long idPerfil) {
		return menuService.buscarMenu(idPerfil);
	}

}
