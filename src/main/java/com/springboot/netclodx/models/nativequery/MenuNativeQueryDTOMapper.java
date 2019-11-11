package com.springboot.netclodx.models.nativequery;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.springboot.netclodx.models.entity.Menu;

public class MenuNativeQueryDTOMapper implements RowMapper<Menu> {
	
	@Override
	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
		Menu menu = new Menu();
		menu.setId(rs.getLong("id"));
		menu.setNombre(rs.getString("nombre"));
		menu.setUrl(rs.getString("url"));
		menu.setIcono(rs.getString("icono"));
		menu.setIdPadre(rs.getLong("id_padre"));
		menu.setEstado(rs.getBoolean("estado"));
        return menu;
	} 
}
