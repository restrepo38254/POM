package com.newtours.pruebas.stepdefinitions;


import java.util.List;

import com.newtours.pruebas.models.Usuario;
import com.newtours.pruebas.steps.InicioDeSesionSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class InicioDeSesionStepDefinitions {
	
	@Steps 
    InicioDeSesionSteps inicioDeSesionSteps; 

	@Dado("^que estoy en la pagina de inicio de NewTours$")
	public void queEstoyEnLaPaginaDeInicioDeNewTours() {
		inicioDeSesionSteps.abrirAplicacionNewTours();
	}

	@Cuando("^ingreso mis credenciales$")
	public void ingresoMisCredenciales(List<Usuario> listaUsuario) {
		 inicioDeSesionSteps.escribirUsuario(listaUsuario.get(0).getUsuario()); 
	     inicioDeSesionSteps.escribirClave(listaUsuario.get(0).getClave()); 
	     inicioDeSesionSteps.clickEnLogin(); 
	}

	@Entonces("^se valida el ingreso al sistema$")
	public void seValidaElIngresoAlSistema(List<Usuario> listaUsuario) {
	inicioDeSesionSteps.validarTextoInicio(listaUsuario.get(0).getMensaje());
	}

	@Entonces("^valido que no permite el ingreso al sistema$")
	public void validoQueNoPermiteElIngresoAlSistema(List<Usuario> listaUsuario) {
		inicioDeSesionSteps.validarTextoInicio(listaUsuario.get(0).getMensaje());
		}
}
