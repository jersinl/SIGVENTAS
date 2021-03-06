package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import entidades.entCargo;
import entidades.entEmpleado;
import entidades.entGenero;
import entidades.entPersona;
import entidades.entSucursal;

public class daoEmpleado {
	
	public static daoEmpleado _Instancia;
	private daoEmpleado() {};
	public static daoEmpleado Instancia() {
		if (_Instancia == null) {
			_Instancia = new daoEmpleado();
		}
		return _Instancia;
	}
	
	public entEmpleado VerificarAcceso(String _Usuario, String _Pass) throws Exception {
		Connection cn = null;
		entEmpleado u = null;
		try {

			cn = Conexion.Instancia().getConnection();
			CallableStatement cst = cn.prepareCall("{call VerificarAcceso(?,?)}");
			cst.setString(1, _Usuario);
			cst.setString(2, _Pass);
			ResultSet rs = cst.executeQuery();
			if (rs.next()) {
				u = new entEmpleado();
				u.setIdEmpleado(rs.getInt(1));
				u.setUsuario(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setFechaIngreso(rs.getDate(4));
				u.setFechaTermino(rs.getDate(5));
				u.setEstado(rs.getBoolean(6));
					entPersona c = new entPersona();
					c.setIdPersona(rs.getInt(7));
					c.setDni(rs.getString(8));
					c.setNombres(rs.getString(9));
					c.setApellidos(rs.getString(10));
					entGenero sexo = new entGenero();
					sexo.setIdgenero(rs.getInt(11));
					sexo.setNombre(rs.getString(12));
					sexo.setResumido(rs.getString(13));
					c.setSexo(sexo);
					c.setFechaNacimiento(rs.getDate(14));
					c.setTelefono(rs.getInt(15));
					c.setCorreo(rs.getString(16));
				u.setIdPersona(c);
					entCargo car =  new entCargo();
					car.setIdCargo(rs.getInt(17));
					car.setNombre(rs.getString(18));
					car.setSueldo(rs.getDouble(19));
					car.setIngreso(rs.getTime(20));
					car.setSalida(rs.getTime(21));
				u.setIdCargo(car);
					entSucursal s = new entSucursal();
					s.setIdSucursal(rs.getInt(22));
					s.setNombre(rs.getString(23));
					s.setDireccion(rs.getString(24));
				u.setIdSucursal(s);
					
				System.out.println("Usuario ok!");
			}
			return u;
		} catch (Exception e) {
			System.out.println("(Persistencia)Nose se puede conectar con el usuario!!!!!! :(  : "+e);
			throw e;
		} finally {
			cn.close();
		}
	}


	
	public ArrayList<entEmpleado> ListarEmpleados()throws Exception{
		entEmpleado emp = null;
		ArrayList<entEmpleado> listaEmpls = null;
		Connection cn = null;
		CallableStatement cstm = null;
		ResultSet rs = null;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call splistarEmpleados}");
		rs = cstm.executeQuery();
		listaEmpls =  new ArrayList<entEmpleado>();
		while(rs.next()){
			emp= new entEmpleado();
			emp.setIdEmpleado(rs.getInt(1));
			emp.setUsuario(rs.getString(2));
			emp.setPassword(rs.getString(3));
			emp.setFechaIngreso(rs.getDate(4));
			emp.setFechaTermino(rs.getDate(5));
			emp.setEstado(rs.getBoolean(6));
				entPersona p = new entPersona();
				p.setIdPersona(rs.getInt(7));
				p.setDni(rs.getString(8));
				p.setNombres(rs.getString(9));
				p.setApellidos(rs.getString(10));
				p.setFechaNacimiento(rs.getDate(11));
				p.setTelefono(rs.getInt(12));
				p.setCorreo(rs.getString(13));
			
				entGenero g = new entGenero();
				g.setIdgenero(rs.getInt(14));
				g.setNombre(rs.getString(15));
				g.setResumido(rs.getString(16));
				p.setSexo(g);
			emp.setIdPersona(p);
				entCargo c = new entCargo();
				c.setIdCargo(rs.getInt(17));
				c.setNombre(rs.getString(18));
				c.setSueldo(rs.getDouble(19));
				c.setIngreso(rs.getTime(20));
				c.setSalida(rs.getTime(21));
			emp.setIdCargo(c);
				entSucursal s = new entSucursal();
				s.setIdSucursal(rs.getInt(22));
				s.setNombre(rs.getString(23));
				s.setDireccion(rs.getString(24));
			emp.setIdSucursal(s);
			listaEmpls.add(emp);
		}
		System.out.println("(Persistencia)listado exitoso... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Nose puede listar!!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
		rs.close();
	}
	return listaEmpls;
	
	}
	
	public boolean insertarEmpleado(entEmpleado emp)throws Exception{
		Connection cn = null;
		CallableStatement cstm = null;
		boolean insertar = false;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spInsertarEmpleado(?,?,?,?,?,?,?,?,?,?,?,?)}");

		cstm.setString(1,emp.getUsuario());
		cstm.setString(2,emp.getPassword());
		cstm.setDate(3, emp.getFechaTermino());
		cstm.setString(4, emp.getIdPersona().getDni());
		cstm.setString(5, emp.getIdPersona().getNombres());
		cstm.setString(6, emp.getIdPersona().getApellidos());
		cstm.setInt(7, emp.getIdPersona().getSexo().getIdgenero());
		cstm.setDate(8, emp.getIdPersona().getFechaNacimiento());
		cstm.setInt(9, emp.getIdPersona().getTelefono());
		cstm.setString(10, emp.getIdPersona().getCorreo());
		cstm.setInt(11, emp.getIdCargo().getIdCargo());
		cstm.setInt(12, emp.getIdSucursal().getIdSucursal());
		
		
		
		int x = cstm.executeUpdate();
		if(x>0){insertar = true;}
		
		System.out.println("(Persistencia)Registro de Empleado Exitoso... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)error al resgistrar Empleado !!!!!! :-(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
	}
	return insertar;
	
	}
	
	
	
	public boolean EditarEmpleado(entEmpleado emp)throws Exception{
		Connection cn = null;
		CallableStatement cstm = null;
		boolean editar = false;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spEditarEmpleado(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
		System.out.println(emp);
		cstm.setString(1,emp.getUsuario());
		cstm.setString(2,emp.getPassword());
		cstm.setDate(3,emp.getFechaTermino());
		cstm.setString(4, emp.getIdPersona().getDni());
		cstm.setString(5, emp.getIdPersona().getNombres());
		cstm.setString(6, emp.getIdPersona().getApellidos());
		cstm.setInt(7, emp.getIdPersona().getSexo().getIdgenero());
		cstm.setDate(8, emp.getIdPersona().getFechaNacimiento());
		cstm.setInt(9, emp.getIdPersona().getTelefono());
		cstm.setString(10, emp.getIdPersona().getCorreo());
		cstm.setInt(11, emp.getIdCargo().getIdCargo());
		cstm.setInt(12, emp.getIdSucursal().getIdSucursal());
		cstm.setInt(13, emp.getIdEmpleado());
		cstm.setInt(14, emp.getIdPersona().getIdPersona());
		
		int x = cstm.executeUpdate();
		if(x>0){editar = true;}
		
		System.out.println("(Persistencia)actualizacion de Empleado exitoso... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Error al actualizar Empleado !!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
	}
	return editar;
	
	}
	
	public boolean EliminarEmpleado(int idEmpleado)throws Exception{
		Connection cn = null;
		CallableStatement cstm = null;
		boolean eliminar = false;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spEliminarEmpleado(?)}");
		cstm.setInt(1,idEmpleado);
				
		int x = cstm.executeUpdate();
		if(x>0){eliminar = true;}
		
		System.out.println("(Persistencia)Se Elimino Empleado... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Nose puede Eliminar la Empleado !!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
	}
	return eliminar;
	
	}
	
	public boolean DarBajaEmpleado(int idEmpleado)throws Exception{
		Connection cn = null;
		CallableStatement cstm = null;
		boolean eliminar = false;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spCambiarEstado(?)}");
		cstm.setInt(1,idEmpleado);
				
		int x = cstm.executeUpdate();
		if(x>0){eliminar = true;}
		
		System.out.println("(Persistencia)Se Dio de baja Empleado... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Nose puede Dar de baja el Empleado !!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
	}
	return eliminar;
	
	}
	

	public entEmpleado devolverEmpId(int  idEmp)throws Exception{
		Connection cn = null;
		CallableStatement cstm = null;
		
		ResultSet rs = null;
		entEmpleado emp= null;
		boolean editar = false;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spDevolverEmpleado(?)}");
		cstm.setInt(1,idEmp);
		rs = cstm.executeQuery();
		while(rs.next()){
			emp= new entEmpleado();
			emp.setIdEmpleado(rs.getInt(1));
			emp.setUsuario(rs.getString(2));
			emp.setPassword(rs.getString(3));
			emp.setFechaIngreso(rs.getDate(4));
			emp.setFechaTermino(rs.getDate(5));
			emp.setEstado(rs.getBoolean(6));
				entPersona p = new entPersona();
				p.setIdPersona(rs.getInt(7));
				p.setDni(rs.getString(8));
				p.setNombres(rs.getString(9));
				p.setApellidos(rs.getString(10));
				p.setFechaNacimiento(rs.getDate(11));
				p.setTelefono(rs.getInt(12));
				p.setCorreo(rs.getString(13));
				entGenero g = new entGenero();
				g.setIdgenero(rs.getInt(14));
				g.setNombre(rs.getString(15));
				g.setResumido(rs.getString(16));
				p.setSexo(g);
			emp.setIdPersona(p);
				entCargo c = new entCargo();
				c.setIdCargo(rs.getInt(17));
				c.setNombre(rs.getString(18));
				c.setSueldo(rs.getDouble(19));
				c.setIngreso(rs.getTime(20));
				c.setSalida(rs.getTime(21));
			emp.setIdCargo(c);
				entSucursal s = new entSucursal();
				s.setIdSucursal(rs.getInt(22));
				s.setNombre(rs.getString(23));
				s.setDireccion(rs.getString(24));
			emp.setIdSucursal(s);
		}
		System.out.println("(Persistencia)devolverEmpleadoId exitoso... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Error al devolverEmpleadoId !!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
		rs.close();
	}
	return emp;
	
	}

	
}
