package com.cibertec.edu;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entidades.entCargo;
import entidades.entEmpleado;
import entidades.entSucursal;
import negocios.negCargos;
import negocios.negEmpleado;
import negocios.negSucursales;

@Controller
public class EmpleadoController {

	@RequestMapping(value = "/Empleados/Lista", method = RequestMethod.GET)
	public ModelAndView Lista(HttpServletRequest req) {		
		ModelAndView m = new ModelAndView("/Empleados/Listar");	//ruta dentro del WEB-INF
		try {
			ArrayList<entEmpleado> listita = 
					negEmpleado.Instancia().ListarEmpleados();
			m.addObject("listita", listita);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
	@RequestMapping(value = "/Empleado/New", method = RequestMethod.GET)
	public ModelAndView NuevoEmpleado() { 
		ModelAndView m = new ModelAndView("/Empleados/Nuevo","command",new entEmpleado());
		ArrayList<entSucursal> sucs= null;
		ArrayList<entCargo> carg = null;
		try {
			 sucs = negSucursales.Instancia().ListarSucursales();
			 carg = negCargos.Instancia().ListarCargos();
		} catch (Exception e) {
			// TODO: handle exception
		}
		m.addObject("listaSuc", sucs);
		m.addObject("listaCar", carg);
		return m;

	}
	
	
	@RequestMapping(value = "/Empleado/GrabarNuevo", method = RequestMethod.POST)
	public ModelAndView GrabarNuevo(@ModelAttribute entEmpleado emp) { 
		try {
			boolean inserto;
			inserto= negEmpleado.Instancia().insertarEmp(emp);
			return new ModelAndView("redirect:/Empleados/Lista?msj=Se inserto satisfactoriamente");
		} catch (Exception e) {
			return new ModelAndView("redirect:/frmError");	
		}

	}
	
	@RequestMapping(value = "/Empleado/Editar", method = RequestMethod.GET)
	public ModelAndView EditarOficina(HttpServletRequest req) {
		ModelAndView m = null;
		ArrayList<entSucursal> sucs= null;
		ArrayList<entCargo> carg = null;
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			System.out.println(id);
			entEmpleado e = negEmpleado.Instancia().devolverEmpId(id);
			System.out.println(e);
			sucs = negSucursales.Instancia().ListarSucursales();
			carg = negCargos.Instancia().ListarCargos();
			m= new ModelAndView("/Empleados/Editar", "command", e);
		} catch (Exception ex) {
			return new ModelAndView("redirect:/frmError");	
		}

		m.addObject("listaSuc", sucs);
		m.addObject("listaCar", carg);
		return m;
	}
	
	
	@RequestMapping(value = "/Empleado/GrabarEditar", method = RequestMethod.POST)
	public ModelAndView GrabarEditar(@ModelAttribute entEmpleado e) { 
		try {
			boolean inserto;
			inserto= negEmpleado.Instancia().EditarEmp(e);
			System.out.println(e.toString());
			if(inserto==true)
			return new ModelAndView("redirect:/Empleados/Lista?msj=Se edito satisfactoriamente");
			else
				return new ModelAndView("redirect:/Empleados/Lista?msj=No se Edito");	
		} catch (Exception ex) {
			return new ModelAndView("redirect:/frmError");	
		}

	}
	
	@RequestMapping(value = "/Empleado/Eliminar", method = RequestMethod.GET)
	public ModelAndView EliminarEmpleado(HttpServletRequest req) {
		entEmpleado e = null;
		try {			
			int id = Integer.parseInt(req.getParameter("id"));
			System.out.println(id);
			e = negEmpleado.Instancia().devolverEmpId(id);
			ModelAndView m = new ModelAndView("/Empleados/eliminar", "command", e);
			m.addObject("emple",e);
			return m;
		} catch (Exception ex) {
			return new ModelAndView("redirect:/frmError");	
		}
	}
	
	@RequestMapping(value = "/Empleado/GrabarEliminar", method = RequestMethod.GET)
	public ModelAndView GrabarEliminar(HttpServletRequest req) { 
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			boolean inserto;
			inserto= negEmpleado.Instancia().EliminarEmp(id);
			
			if(inserto==true)
			return new ModelAndView("redirect:/Empleados/Lista?msj=Se elimino satisfactoriamente");
			else
				return new ModelAndView("redirect:/Empleados/Lista?msj=No se Elimino");	
		} catch (Exception ex) {
			return new ModelAndView("redirect:/frmError");	
		}

	}
	
	@ModelAttribute("sucursales")
	 public ArrayList<entSucursal> populateCountryList() {
	   
	  //Data referencing for java skills list box
		 ArrayList<entSucursal> sucs = null;
		 try {
			sucs = negSucursales.Instancia().ListarSucursales();
		} catch (Exception e) {
			// TODO: handle exception
		}   
	  return sucs;
	 }
}