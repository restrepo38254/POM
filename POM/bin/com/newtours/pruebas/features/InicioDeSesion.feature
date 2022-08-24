#language:es 


Característica: Inicio de Sesion 
	@LoginExitoso
  Esquema del escenario: Inicio de sesion exitoso

    Dado que estoy en la pagina de inicio de NewTours 
    Cuando ingreso mis credenciales 
    |usuario|clave| 
    |<usuario>|<clave>| 
    Entonces se valida el ingreso al sistema
    |mensaje|
    |<mensaje>|
    Ejemplos:  
    |usuario|clave|mensaje|
    |restrepo380|johan456|Use our Flight Finde|
        
      
	@LoginFallido
  Esquema del escenario: Inicio de sesion fallido

    Dado que estoy en la pagina de inicio de NewTours 
    Cuando ingreso mis credenciales 
    |usuario|clave| 
    |<usuario>|<clave>| 
    Entonces valido que no permite el ingreso al sistema 
    |mensaje|
    |<mensaje>|
    Ejemplos:  
      |usuario|clave|mensaje|
      |mngr255781 |claveInvalida|Welcome back|
      |usuarioInvalido|YjuvAjU2|Welcome back|
      |usuarioInvalido|claveInvalida|Welcome back|