package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

//LE PASAMOS EL NOMBRE DEL POJO Y EL TIPO DE DATO QUE TIENE EL ID
@Repository
public interface TestRepository extends JpaRepository<User,Integer>{
	
	//DECLARAR LOS METODOS Y EL NOMBRE DE LA QUERY
	List<User> findAll();
	User deleteById(int id);
	User save(User u);
	
}
