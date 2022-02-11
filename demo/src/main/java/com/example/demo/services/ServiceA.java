package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.TestRepository;

@Service
public class ServiceA {
	@Autowired
	private TestRepository tr;
	@Value("$(course.mesagge)")
	private String mensaje="holaa";
	
	public String sacaTexto() {
		return mensaje;
	}
	
	public List<User> consultaTabla() {
		return  tr.findAll();
		
	}
	public User borrarCampo(int id) {
		return tr.deleteById(id);
	}
	public User agregarCampo(User u) {
		return tr.save(u);
	}
}
