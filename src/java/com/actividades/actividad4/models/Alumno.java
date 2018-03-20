package com.actividades.actividad4.models;

/**
 *
 * @author ruben
 */
public class Alumno {
    
    private Integer id;
    private String nombre;
    private String apellidos;
    private String matricula;
    private String sexo;

    public Alumno() {
    }
    
    public Alumno(Integer id, String nombre, String apllidos, String matricula, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apllidos;
        this.matricula = matricula;
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
    
}
