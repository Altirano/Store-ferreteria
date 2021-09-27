package com.API;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.ClientesDAO;
import com.Model.Clientes;



@RestController 
@RequestMapping ("clientes")

public class ClientesAPI {
	
	@Autowired
	private ClientesDAO clientesDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Clientes clientes) {
		clientesDAO.save(clientes);
	
}
	 @GetMapping("/listar")
		public List<Clientes> listar(){
			
			return clientesDAO.findAll();
		
}
	 @DeleteMapping("/eliminar/{id}")
		public void eliminar(@PathVariable("id")long id) {
			clientesDAO.deleteById(id);
				 
}
	 @PutMapping("/actualizar")
		public void actualiza(@RequestBody Clientes clientes) {
			clientesDAO.save(clientes);
} 
}


