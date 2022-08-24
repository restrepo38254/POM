#language:es 

Característica: Registro
	
		Esquema del escenario: Registro de usuario
    Dado que estoy en la pagina de inicio de NewTours
    Cuando ingreso los datos de registro
    |nombre|apellido|telefono|correoelectronico|direccion1|direccion2|ciudad|provincia|codigopostal|pais|nuevousuario|nuevaclave|confirmarclave| 
    |<nombre>|<apellido>|<telefono>|<correoelectronico>|<direccion1>|<direccion2>|<ciudad>|<provincia>|<codigopostal>|<pais>|<nuevousuario>|<nuevaclave>|<confirmarclave>|
    Entonces se valida el registro exitoso
    |mensaje|
    |<mensaje>|
    Ejemplos:  
    |nombre|apellido|telefono|correoelectronico|direccion1|direccion2|ciudad|provincia|codigopostal|pais|nuevousuario|nuevaclave|confirmarclave|mensaje|
    |Harol|Restrepo|3005593067|restrepo1@hotmail.com|Calle1|Calle2|Sabaneta|Antioquia|000000|Colombia|restrepo1|johan456|johan456|Dear|