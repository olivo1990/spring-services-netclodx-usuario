package com.springboot.netclodx.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.netclodx.models.dao.IUsuarioDao;
import com.springboot.netclodx.models.entity.Usuario;
import com.springboot.netclodx.models.interfaces.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService, UserDetailsService {
	
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByUsername(username);
		
		if(usuario ==  null) {
			logger.error("Error en el login: no existe el suario " + username + " en el sistema!");
			throw new UsernameNotFoundException("Error en el login: no existe el suario " + username + " en el sistema!");
		}
		
		List<GrantedAuthority> authorities = usuario.getPerfiles()
				.stream()
				.map(perfil -> new SimpleGrantedAuthority(perfil.getNombre()))
				.peek(authority -> logger.info("Role: " + authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEstado(), true, true, true, authorities);
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) {

		return usuarioDao.findByUsername(username);
	}

}
