package com.newtours.pruebas.steps;


import com.newtours.pruebas.pageobjects.RegistroPageObject;

import net.thucydides.core.annotations.Step;

public class RegistroSteps {

	RegistroPageObject registroPOM=new RegistroPageObject(); 
	
	@Step 
    public void abrirAplicacionNewTours() { registroPOM.open();  } 
	@Step 
    public void clickEnRegistro() { registroPOM.clickEnRegistro();  } 
    @Step 
    public void escribirNombre(String nombre) { registroPOM.escribirNombre(nombre); } 
    @Step 
    public void escribirApellido(String apellido) { registroPOM.escribirApellido(apellido); } 
    @Step 
    public void escribirTelefono(String telefono) { registroPOM.escribirTelefono(telefono); } 
    @Step 
    public void escribirCorreoElectronico(String correoelectronico) { registroPOM.escribirCorreoElectronico(correoelectronico); } 
    @Step 
    public void escribirDireccion1(String direccion1) { registroPOM.escribirDireccion1(direccion1); } 
    @Step 
    public void escribirDireccion2(String direccion2) { registroPOM.escribirDireccion2(direccion2); } 
    @Step 
    public void escribirCiudad(String ciudad) { registroPOM.escribirCiudad(ciudad); } 
    @Step 
    public void escribirProvincia(String provincia) { registroPOM.escribirProvincia(provincia); } 
    @Step 
    public void escribirCodigoPostal(String codigopostal) { registroPOM.escribirCodigoPostal(codigopostal); } 
    @Step 
    public void escribirPais(String pais) { registroPOM.escribirPais(pais); } 
    @Step 
    public void escribirNuevoUsuario(String nuevousuario) { registroPOM.escribirNuevoUsuario(nuevousuario); } 
    @Step 
    public void escribirNuevaClave(String nuevaclave) { registroPOM.escribirNuevaClave(nuevaclave); } 
    @Step 
    public void escribirConfirmarClave(String confirmarclave) { registroPOM.escribirConfirmarClave(confirmarclave); } 
    @Step 
    public void clickEnRegistrar() { registroPOM.clickEnRegistrar();  } 
    @Step 
    public void validarTextoRegistro(String texto) { registroPOM.validarTextoRegistro(texto);
    } 
}
