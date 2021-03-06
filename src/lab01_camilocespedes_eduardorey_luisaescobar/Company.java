/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_camilocespedes_eduardorey_luisaescobar;

/**
 * Clase que representa una compañía perteneciente a user
 * @author Camilo Cespedes
 */
public class Company {
    /*
    Atributos
    */
    private String name, catchPhrase, bs;

    /**
     * Constructor no vacío de la clase Company
     * @param name Nombre de compañia
     * @param catchPhrase catchPhrase de compañía
     * @param bs bs de compañía
     */
    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    /**
     * Metodo que permite acceder al nombre de una compañia
     * @return String correspondiente al nombre de una compañia
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo que permite acceder a la catchPhrase de una compañia
     * @return String correspondiente a la catchPhrase de una compañia
     */
    public String getCatchPhrase() {
        return catchPhrase;
    }

    /**
     * Metodo que permite acceder al bs de una compañia
     * @return String correspondiente al bs de una compañia
     */
    public String getBs() {
        return bs;
    }

    /**
     * Metodo que condensa la informacion de una compañia
     * @return StringBuffer que contiene la información textual de una comañia condensada y organizada
     */
    public StringBuffer show() {
        StringBuffer sb = new StringBuffer("Company: {\n");
        sb.append("\t"+this.name+"\n");
        sb.append("\t"+this.catchPhrase+"\n");
        sb.append("\t"+this.bs+"\n}");
        return sb;
    }
    
}
