package com.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Clientes;


public interface ClientesDAO extends JpaRepository<Clientes, Long>{

}
