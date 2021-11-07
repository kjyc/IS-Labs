package modelo.bean;

import java.util.Date;

public class LoginBean {
	private String nombre;
	private String password;
	private Date fecha;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String comprobar() {
		if (nombre.equals("pirata")) {
			return "error";
		} else {
			return "ok";
		}
	}
}
