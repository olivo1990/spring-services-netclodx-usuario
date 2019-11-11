package com.springboot.netclodx.models.interfaces;

import java.util.List;

import com.springboot.netclodx.models.entity.Menu;

public interface IMenuService {
	
	public List<Menu> buscarMenu(Long idPerfil);

}
