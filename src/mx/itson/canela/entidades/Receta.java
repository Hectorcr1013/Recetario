/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.canela.enumeradores.Dificultad;

/**
 *
 * @author julio
 */
public class Receta {

    /**
     * @return the nombre
     */
    private String nombre;
    private String descripcion;
    private int numeroPorciones;
    private int tiempo;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    private Usuario usuario;
    private List<Ingrediente> ingredientes;
    private List<Paso> pasos;
    private Dificultad dificultad;
    
    
    /**
     * 
     * @param json The parameter for deserializar method
     * @return the receta
     */
    public Receta deserializar(String json){
        Receta receta = new Receta();
        try{
            receta = new Gson().fromJson(json, Receta.class);
        } catch(Exception ex){
            System.err.println("Ocurrio un error: " + ex.getMessage());
        }
        return receta;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the numeroPorciones
     */
    public int getNumeroPorciones() {
        return numeroPorciones;
    }

    /**
     * @param numeroPorciones the numeroPorciones to set
     */
    public void setNumeroPorciones(int numeroPorciones) {
        this.numeroPorciones = numeroPorciones;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the ingredientes
     */
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the pasos
     */
    public List<Paso> getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    /**
     * @return the dificultad
     */
    public Dificultad getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

}
