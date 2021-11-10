package modelo.bean;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

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
		if (nombre.length() != password.length()) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Error: La longitud del nombre y de la contraseña son diferentes."));
			return null;
		}

		if (nombre.equals("pirata")) {
			return "error";
		} else {
			return "ok";
		}
	}

	public void onDateSelect(SelectEvent event) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fecha escogida: " + event.getObject()));
	}
}
