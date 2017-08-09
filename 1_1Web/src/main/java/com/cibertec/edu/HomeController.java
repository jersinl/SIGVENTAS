package com.cibertec.edu;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entidades.entEmpleado;
import negocios.negEmpleado;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {		
		return new ModelAndView("home", "command", new entEmpleado());
	}
	
	
	@RequestMapping(value = "/Inicio", method = RequestMethod.GET)
	public ModelAndView Principal() { 
		return new ModelAndView("/frmPrincipal", "command", new entEmpleado());

	}
	
	@RequestMapping(value = "/VerificarAcceso", method = RequestMethod.POST)
	public String VerificarAcceso(@ModelAttribute("SpringWeb")entEmpleado u, 
									ModelMap model, HttpServletRequest req) {	
		try {
			String _Usuario = u.getUsuario();
			String _Password = u.getPassword();
			entEmpleado ux = negEmpleado.Instancia().VerificarAcceso(_Usuario, _Password);
			//grabamos objeto usuario en la sesion
			req.getSession().setAttribute("usuario", ux);
			return "frmPrincipal";
		} catch (ArithmeticException e) {
			model.addAttribute("mensaje", e.getMessage());				
			model.addAttribute("command", u);
			return "home";
		} catch (Exception e) {
			model.addAttribute("mensaje", e.getMessage());
			return "frmError";
		}
	}
}
