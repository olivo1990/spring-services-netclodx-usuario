package com.springboot.netclodx.models.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.netclodx.models.entity.Menu;
import com.springboot.netclodx.models.interfaces.IMenuService;
import com.springboot.netclodx.models.nativequery.MenuNativeQueryDTOMapper;

@Service
public class MenuService implements IMenuService {
	
	@Autowired 
	private DataSource dataSource;
	
	@Override
	@Transactional(readOnly = true)
	public List<Menu> buscarMenu(Long idPerfil) {

		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		
		Map<String, Object> params = new HashMap<>();
		params.put("id_perfil", idPerfil);
        String sql = "SELECT m.* FROM menu_perfil AS mp INNER JOIN menu AS m ON (m.id = mp.id_menu) WHERE m.estado = 1 AND mp.id_perfil = :id_perfil";
		
		List <Menu> ListaMenu =  jdbcTemplate.query(sql, params, new MenuNativeQueryDTOMapper());
		
		return ListaMenu;
	}

}
