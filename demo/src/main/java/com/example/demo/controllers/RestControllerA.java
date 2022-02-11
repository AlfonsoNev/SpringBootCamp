package com.example.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.services.ServiceA;


@RestController
public class RestControllerA {
	//OJO NO NEWS!!!!
	@Autowired
	ServiceA s;
	@RequestMapping(method = RequestMethod.GET,value ="/hello")
	@ResponseBody
	public String sacaTexto() {
		
		
		return s.sacaTexto();
	}
	//CONSULTAR
	
	@RequestMapping(method = RequestMethod.GET,value ="/test")
	@ResponseBody
	public List<User> getUser() {		
		return s.consultaTabla();
	}
	
	//BORRAR
	
	@RequestMapping(method = RequestMethod.DELETE,value ="/users/{id}")
	@ResponseBody
	public User borrarId(@PathVariable int id) {
		return s.borrarCampo(id);
	}
	
	// AGREGAR
	@RequestMapping(method = RequestMethod.POST,value ="/user")
	@ResponseBody
	public User agregar(@RequestBody User u) {
		return s.agregarCampo(u);
	}
}
