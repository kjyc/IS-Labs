package modelo.bean;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("TipoUsuarioConverter")
public class TipoUsuarioConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String newValue) throws ConverterException {
		return LoginBean.getObject(newValue);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) throws ConverterException {
		if (value == null)
			return "";
		return value.toString();
	}

}
