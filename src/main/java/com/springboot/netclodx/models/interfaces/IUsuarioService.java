package com.springboot.netclodx.models.interfaces;

import com.springboot.netclodx.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
