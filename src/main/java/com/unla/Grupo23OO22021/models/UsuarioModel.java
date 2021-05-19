package com.unla.Grupo23OO22021.models;

import com.unla.Grupo23OO22021.entities.Documento;
import com.unla.Grupo23OO22021.entities.Perfil;

public class UsuarioModel {

	private long idUsuario;
	
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private String username;
	private String password;
	
	private Documento documento;
	private Perfil perfil;
	public UsuarioModel(long idUsuario, int dni, String nombre, String apellido, String email, String username,
			String password, Documento documento, Perfil perfil) {
		super();
		this.idUsuario = idUsuario;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.username = username;
		this.password = password;
		this.documento = documento;
		this.perfil = perfil;
	}
	
	public UsuarioModel(int dni, String nombre, String apellido, String email, String username, String password,
			Documento documento, Perfil perfil) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.username = username;
		this.password = password;
		this.documento = documento;
		this.perfil = perfil;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
}