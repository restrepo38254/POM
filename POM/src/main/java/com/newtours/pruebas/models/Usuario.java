package com.newtours.pruebas.models;

public class Usuario {

	private String usuario;
    private String clave; 
    private String mensaje;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoelectronico;
    private String direccion1;
    private String direccion2;
    private String ciudad;
    private String provincia;
    private String codigopostal;
    private String pais;
    private String nuevousuario;
    private String nuevaclave;
    private String confirmarclave;
    

    public Usuario(String usuario, String clave, String mensaje, String nombre, String apellido, String telefono, String correoelectronico, String direccion1, String direccion2, 
    		String ciudad, String provincia, String codigopostal, String pais, String nuevousuario, String nuevaclave, String confirmarclave) { 

        this.usuario = usuario;
        this.clave = clave; 
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoelectronico = correoelectronico;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigopostal = codigopostal;
        this.pais = pais;
        this.nuevousuario = nuevousuario;
        this.nuevaclave = nuevaclave;
        this.confirmarclave = confirmarclave;
       

    } 

    public String getUsuario() {  return usuario;  } 
    public String getClave() {    return clave;    }
    public String getMensaje() {   return mensaje;  }
    public String getNombre() {   return nombre;  }
    public String getApellido() {   return apellido;  }
    public String getTelefono() {   return telefono;  }
    public String getCorreoElectronico() {   return correoelectronico;  }
    public String getDireccion1() {   return direccion1;  }
    public String getDireccion2() {   return direccion2;  }
    public String getCiudad() {   return ciudad;  }
    public String getProvincia() {   return provincia;  }
    public String getCodigoPostal() {   return codigopostal;  }
    public String getPais() {   return pais;  }
    public String getNuevoUsuario() {   return nuevousuario;  }
    public String getNuevaClave() {   return nuevaclave;  }
    public String getConfirmarClave() {   return confirmarclave;  }
}