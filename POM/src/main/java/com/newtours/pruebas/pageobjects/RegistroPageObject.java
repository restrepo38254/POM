package com.newtours.pruebas.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("http://newtours.demoaut.com") 
public class RegistroPageObject extends PageObject {

	 By lblRegister = By.xpath("//a[contains(.,'REGISTER')]");
	 By txtNombre = By.name("firstName");
	 By txtApellido = By.name("lastName");
	 By txtTelefono = By.name("phone");
	 By txtCorreoElectronico = By.id("userName");
	 By txtDireccion1 = By.name("address1");
	 By txtDireccion2 = By.name("address2");
	 By txtCiudad = By.name("city");
	 By txtProvinciaEstado = By.name("state");
	 By txtCodigoPostal = By.name("postalCode");
	 By lstPais = By.name("country");
	 By txtNuevoUsuario = By.id("email");
	 By txtNuevaClave = By.name("password");
	 By txtConfirmarClave = By.name("confirmPassword");
	 By btnResgistar = By.name("register");
	 By textRegistroExitoso=By.xpath("//font [contains(.,'Dear')]");

	 	public void clickEnRegistro() { getDriver().findElement(lblRegister).click();}
	    public void escribirNombre(String nombre) {  getDriver().findElement(txtNombre).sendKeys(nombre);  } 
	    public void escribirApellido(String apellido) {  getDriver().findElement(txtApellido).sendKeys(apellido);  } 
	    public void escribirTelefono(String telefono) {  getDriver().findElement(txtTelefono).sendKeys(telefono);  } 
	    public void escribirCorreoElectronico(String correoelectronico) {  getDriver().findElement(txtCorreoElectronico).sendKeys(correoelectronico);  } 
	    public void escribirDireccion1(String direccion1) {  getDriver().findElement(txtDireccion1).sendKeys(direccion1);  } 
	    public void escribirDireccion2(String direccion2) {  getDriver().findElement(txtDireccion2).sendKeys(direccion2);  } 
	    public void escribirCiudad(String ciudad) {  getDriver().findElement(txtCiudad).sendKeys(ciudad);  } 
	    public void escribirProvincia(String provincia) {  getDriver().findElement(txtProvinciaEstado).sendKeys(provincia);  } 
	    public void escribirCodigoPostal(String codigopostal) {  getDriver().findElement(txtCodigoPostal).sendKeys(codigopostal);  } 
	    public void escribirPais(String pais) {  getDriver().findElement(lstPais).sendKeys(pais);  } 
	    public void escribirNuevoUsuario(String nuevousuario) {  getDriver().findElement(txtNuevoUsuario).sendKeys(nuevousuario);  } 
	    public void escribirNuevaClave(String nuevaclave) {  getDriver().findElement(txtNuevaClave).sendKeys(nuevaclave);  } 
	    public void escribirConfirmarClave(String confirmarclave) {  getDriver().findElement(txtConfirmarClave).sendKeys(confirmarclave);  } 
	    public void clickEnRegistrar() { getDriver().findElement(btnResgistar).click(); } 

	    public void validarTextoRegistro(String texto){
	       String textoObtenido = getDriver().findElement(textRegistroExitoso).getText();
	       assertThat(textoObtenido, containsString(texto));
	    
}

	
}
