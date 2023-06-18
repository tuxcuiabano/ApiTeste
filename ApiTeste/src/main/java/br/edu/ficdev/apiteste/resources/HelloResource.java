/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ficdev.apiteste.resources;

/**
 *
 * @author pedroclarindodasilvaneto
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bonjour")
public class HelloResource {
/*
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String direBonjour() {
        return "Bonjour, tout le monde!";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHTMLHello() {
        return "<html><title>Hello</title><body><h1>Bonjour, tout le monde!</h1><body></html>";
    }
    */
    
    @GET
@Produces(MediaType.APPLICATION_JSON)
public String sayJsonHello() {
    return "{\"name\":\"greeting\", \"message\":\"Bonjour tout le monde!\"}";
}

}
