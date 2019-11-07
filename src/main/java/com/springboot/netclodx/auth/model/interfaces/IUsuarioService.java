package com.springboot.netclodx.auth.model.interfaces;

import com.springboot.netclodx.auth.model.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
