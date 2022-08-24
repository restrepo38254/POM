package com.newtours.pruebas.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("http://newtours.demoaut.com") 
public class InicioDeSesionPageObject extends PageObject{

	 By txtUsuario=By.name("userName"); 

	    By txtClave=By.name("password"); 

	    By btnLogIn=By.name("login"); 
	    
	    By textError=By.xpath("//font [contains(.,'Welcome') or contains (.,'Use our')]");

	     

	    public void escribirUsuario(String usuario) { 

	        getDriver().findElement(txtUsuario).sendKeys(usuario); 

	    } 

	     

	    public void escribirClave(String clave) { 

	        getDriver().findElement(txtClave).sendKeys(clave); 

	    } 

	     

	    public void clickEnLogin() { 

	        getDriver().findElement(btnLogIn).click(); 

	    } 

	     

	    public void validarTextoInicio(String texto){
	        String textoObtenido = getDriver().findElement(textError).getText();
	        assertThat(textoObtenido, containsString(texto));
	    }
}
