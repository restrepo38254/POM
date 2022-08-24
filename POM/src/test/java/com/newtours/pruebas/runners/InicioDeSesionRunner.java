package com.newtours.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src\\test\\resources\\com\\newtours\\pruebas\\features\\InicioDeSesion.feature",
		glue = "com.newtours.pruebas.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class InicioDeSesionRunner {

}

