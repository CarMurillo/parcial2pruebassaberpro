package com.example.mongodb.carlos.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "estudiante")
public class Estudiante {
	
	@Id
	private String id;
	private String user;
	private String password;
	private String identificacion;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private String registro;
	private int puntajetotal;
	private String niveltotal;
	private int comunicacionescrita;
	private String nivelcomunicacionescrita;
	private int razonamiento;
	private String nivelrazonamiento;
	private int lectura;
	private String nivellectura;
	private int competencias;
	private String nivelcompetencias;
	private int ingles;
	private String nivelingles;
	private int formulacionproyectos;
	private String nivelformulacion;
	private int pensamiento;
	private String nivelpensamiento;
	private int diseño;
	private String niveldiseño;
	private String niveltotalingles;
	private String estado;
	
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	

	public Estudiante(String id, String user, String password, String identificacion, String nombre, String apellido,
			String correo, String telefono, String registro, int puntajetotal, String niveltotal,
			int comunicacionescrita, String nivelcomunicacionescrita, int razonamiento, String nivelrazonamiento,
			int lectura, String nivellectura, int competencias, String nivelcompetencias, int ingles,
			String nivelingles, int formulacionproyectos, String nivelformulacion, int pensamiento,
			String nivelpensamiento, int diseño, String niveldiseño, String niveltotalingles, String estado) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.registro = registro;
		this.puntajetotal = puntajetotal;
		this.niveltotal = niveltotal;
		this.comunicacionescrita = comunicacionescrita;
		this.nivelcomunicacionescrita = nivelcomunicacionescrita;
		this.razonamiento = razonamiento;
		this.nivelrazonamiento = nivelrazonamiento;
		this.lectura = lectura;
		this.nivellectura = nivellectura;
		this.competencias = competencias;
		this.nivelcompetencias = nivelcompetencias;
		this.ingles = ingles;
		this.nivelingles = nivelingles;
		this.formulacionproyectos = formulacionproyectos;
		this.nivelformulacion = nivelformulacion;
		this.pensamiento = pensamiento;
		this.nivelpensamiento = nivelpensamiento;
		this.diseño = diseño;
		this.niveldiseño = niveldiseño;
		this.niveltotalingles = niveltotalingles;
		this.estado = estado;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getRegistro() {
		return registro;
	}


	public void setRegistro(String registro) {
		this.registro = registro;
	}


	public int getPuntajetotal() {
		return puntajetotal;
	}


	public void setPuntajetotal(int puntajetotal) {
		this.puntajetotal = puntajetotal;
	}


	public String getNiveltotal() {
		return niveltotal;
	}


	public void setNiveltotal(String niveltotal) {
		this.niveltotal = niveltotal;
	}


	public int getComunicacionescrita() {
		return comunicacionescrita;
	}


	public void setComunicacionescrita(int comunicacionescrita) {
		this.comunicacionescrita = comunicacionescrita;
	}


	public String getNivelcomunicacionescrita() {
		return nivelcomunicacionescrita;
	}


	public void setNivelcomunicacionescrita(String nivelcomunicacionescrita) {
		this.nivelcomunicacionescrita = nivelcomunicacionescrita;
	}


	public int getRazonamiento() {
		return razonamiento;
	}


	public void setRazonamiento(int razonamiento) {
		this.razonamiento = razonamiento;
	}


	public String getNivelrazonamiento() {
		return nivelrazonamiento;
	}


	public void setNivelrazonamiento(String nivelrazonamiento) {
		this.nivelrazonamiento = nivelrazonamiento;
	}


	public int getLectura() {
		return lectura;
	}


	public void setLectura(int lectura) {
		this.lectura = lectura;
	}


	public String getNivellectura() {
		return nivellectura;
	}


	public void setNivellectura(String nivellectura) {
		this.nivellectura = nivellectura;
	}


	public int getCompetencias() {
		return competencias;
	}


	public void setCompetencias(int competencias) {
		this.competencias = competencias;
	}


	public String getNivelcompetencias() {
		return nivelcompetencias;
	}


	public void setNivelcompetencias(String nivelcompetencias) {
		this.nivelcompetencias = nivelcompetencias;
	}


	public int getIngles() {
		return ingles;
	}


	public void setIngles(int ingles) {
		this.ingles = ingles;
	}


	public String getNivelingles() {
		return nivelingles;
	}


	public void setNivelingles(String nivelingles) {
		this.nivelingles = nivelingles;
	}


	public int getFormulacionproyectos() {
		return formulacionproyectos;
	}


	public void setFormulacionproyectos(int formulacionproyectos) {
		this.formulacionproyectos = formulacionproyectos;
	}


	public String getNivelformulacion() {
		return nivelformulacion;
	}


	public void setNivelformulacion(String nivelformulacion) {
		this.nivelformulacion = nivelformulacion;
	}


	public int getPensamiento() {
		return pensamiento;
	}


	public void setPensamiento(int pensamiento) {
		this.pensamiento = pensamiento;
	}


	public String getNivelpensamiento() {
		return nivelpensamiento;
	}


	public void setNivelpensamiento(String nivelpensamiento) {
		this.nivelpensamiento = nivelpensamiento;
	}


	public int getDiseño() {
		return diseño;
	}


	public void setDiseño(int diseño) {
		this.diseño = diseño;
	}


	public String getNiveldiseño() {
		return niveldiseño;
	}


	public void setNiveldiseño(String niveldiseño) {
		this.niveldiseño = niveldiseño;
	}


	public String getNiveltotalingles() {
		return niveltotalingles;
	}


	public void setNiveltotalingles(String niveltotalingles) {
		this.niveltotalingles = niveltotalingles;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
