package com.newtours.pruebas.stepdefinitions;

import java.util.List;

import com.newtours.pruebas.models.Usuario;
import com.newtours.pruebas.steps.RegistroSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RegistroStepDefinitions {
	@Steps 
    RegistroSteps registroSteps; 
	
	
	@Cuando("^ingreso los datos de registro$")
	public void ingresoLosDatosDeRegistro(List<Usuario> listausuario) {
		registroSteps.clickEnRegistro();
	    registroSteps.escribirNombre(listausuario.get(0).getNombre());
	    registroSteps.escribirApellido(listausuario.get(0).getApellido());
	    registroSteps.escribirTelefono(listausuario.get(0).getTelefono());
	    registroSteps.escribirCorreoElectronico(listausuario.get(0).getCorreoElectronico());
	    registroSteps.escribirDireccion1(listausuario.get(0).getDireccion1());
	    registroSteps.escribirDireccion2(listausuario.get(0).getDireccion2());
	    registroSteps.escribirCiudad(listausuario.get(0).getCiudad());
	    registroSteps.escribirProvincia(listausuario.get(0).getProvincia());
	    registroSteps.escribirCodigoPostal(listausuario.get(0).getCodigoPostal());
	    registroSteps.escribirPais(listausuario.get(0).getPais());
	    registroSteps.escribirNuevoUsuario(listausuario.get(0).getNuevoUsuario());
	    registroSteps.escribirNuevaClave(listausuario.get(0).getNuevaClave());
	    registroSteps.escribirConfirmarClave(listausuario.get(0).getConfirmarClave());
	    registroSteps.clickEnRegistrar();
	}

	@Entonces("^se valida el registro exitoso$")
	public void seValidaElRegistroExitoso(List<Usuario> listausuario) {
		registroSteps.validarTextoRegistro(listausuario.get(0).getMensaje());
	}
}
