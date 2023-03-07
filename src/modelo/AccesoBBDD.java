package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBBDD {

	Conector conexion = new Conector();

public void insertarUsuario(Usuario usuario) {
		
		try {
			PreparedStatement insertarU = conexion.getConexion().prepareStatement("INSERT INTO usuarios (nombre_apellido, dni, codigo) VALUES (?,?,?)");
			insertarU.setString(1, usuario.getNombre_apellido());
			insertarU.setString(2, usuario.getDni());
			insertarU.setString(3, usuario.getCodigo());
			
			insertarU.execute();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> comprobarCodigo() {
		
		ArrayList<String> codigosbbdd = new ArrayList<String>();
		try {
			PreparedStatement comprobarCodigo = conexion.getConexion().prepareStatement("SELECT codigo FROM usuarios");
			comprobarCodigo.execute();
			ResultSet codigos = comprobarCodigo.executeQuery();

			while (codigos.next()) {
				codigosbbdd.add(codigos.getString("codigo"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return codigosbbdd;
	}
	
	public ArrayList<Inscripcion> conseguirIns(int idAct){
		
		ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
		
		try {
			PreparedStatement conseguirIns = conexion.getConexion().prepareStatement("SELECT * FROM inscripciones WHERE id_actividad = ?");
			conseguirIns.setInt(1, idAct);
			
			conseguirIns.execute();
			
			ResultSet inscripcionesbbdd = conseguirIns.executeQuery();
			
			while(inscripcionesbbdd.next()) {
				Inscripcion inscrips = new Inscripcion();
				
				inscrips.setId(inscripcionesbbdd.getInt("id"));
				inscrips.setId_usuario(inscripcionesbbdd.getInt("id_usuario"));
				inscrips.setId_actividad(inscripcionesbbdd.getInt("id_actividad"));
				
				inscripciones.add(inscrips);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return inscripciones;
	}
	
	public ArrayList<Usuario> conseguirUsuarios(){
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			PreparedStatement conseguirU = conexion.getConexion().prepareStatement("SELECT * FROM usuarios");
			conseguirU.execute();

			ResultSet usuariosbbdd = conseguirU.executeQuery();
			
			while (usuariosbbdd.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(usuariosbbdd.getInt("id"));
				usuario.setNombre_apellido(usuariosbbdd.getString("nombre_apellido"));
				usuario.setDni(usuariosbbdd.getString("dni"));
				usuario.setCodigo(usuariosbbdd.getString("codigo"));
				
				usuarios.add(usuario);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}
	
	public void cambiarDias(int idAct, String dias) {
		
		try {
			PreparedStatement cambiarDias = conexion.getConexion().prepareStatement("UPDATE ACTIVIDADES SET dias_semana= ? WHERE ID = ?");
			cambiarDias.setString(1, dias);
			cambiarDias.setInt(2, idAct);
			
			cambiarDias.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}				
	}
	
	public ArrayList<Actividad> conseguirIDactividad(String nombreAct) {
		
		ArrayList<Actividad> idActividad = new ArrayList<Actividad>();
		
		try {
			PreparedStatement idAct = conexion.getConexion().prepareStatement("SELECT id FROM actividades WHERE nombre = ?");
			idAct.setString(1, nombreAct);
			
			ResultSet id = idAct.executeQuery();
			
			while(id.next()) {
				Actividad actividad = new Actividad();
				actividad.setId(id.getInt("id"));
				
				idActividad.add(actividad);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return idActividad;
	}
}
