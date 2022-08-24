package com.newtours.pruebas.steps;

import com.newtours.pruebas.pageobjects.InicioDeSesionPageObject;

import net.thucydides.core.annotations.Step;

public class InicioDeSesionSteps {
	
	InicioDeSesionPageObject inicioDeSesionPOM=new InicioDeSesionPageObject(); 

    @Step 
    public void abrirAplicacionNewTours() { 
        inicioDeSesionPOM.open(); 
    } 

    @Step 
    public void escribirUsuario(String usuario) { 
        inicioDeSesionPOM.escribirUsuario(usuario); 
    } 
    
    @Step 
    public void escribirClave(String clave) { 
        inicioDeSesionPOM.escribirClave(clave); 
    } 

    @Step 
    public void clickEnLogin() { 
        inicioDeSesionPOM.clickEnLogin(); 
    } 

    @Step 
    public void validarTextoInicio(String texto) { 
         inicioDeSesionPOM.validarTextoInicio(texto);
    } 

}
