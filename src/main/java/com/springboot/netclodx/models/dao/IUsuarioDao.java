package com.springboot.netclodx.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.netclodx.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	public Usuario findByUsername(String username);
}
