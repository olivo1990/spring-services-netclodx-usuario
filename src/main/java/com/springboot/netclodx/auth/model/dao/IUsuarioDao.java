package com.springboot.netclodx.auth.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.netclodx.auth.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	public Usuario findByUsername(String username);
}
