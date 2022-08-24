#language:es 

@Caracteristica: Inicio de Sesion 

  @Esquema: Inicio de sesion fallidos 

    Dado que estoy en la pagina de inicio de gurubank 

    Cuando ingreso mis credenciales 

    |usuario|clave| 

    |<usuario>|<clave>| 

    Entonces valido la presencia de una alerta 


    Ejemplos:  

      |Usuario|Clave| 

      |mngr255781 |claveInvalida| 

      |usuarioInvalido|YjuvAjU2| 

      |usuarioInvalido|claveInvalida| 