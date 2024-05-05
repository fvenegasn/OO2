package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	
	private Boolean acceso;
	private DatabaseAccess dataBase;
	
	public DatabaseProxy(DatabaseAccess dataBase) {
		acceso=false;
		this.dataBase=dataBase;
	}
	
	public Boolean chequearAcceso() {
		return acceso;
	}
	
	public void login(String clave) {
		if(clave.equals("OO2")) acceso=true;
	}
	
	public void logout() {
		this.acceso=false;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(chequearAcceso()) {
			return dataBase.getSearchResults(queryString);
		}
			throw new RuntimeException("No estas logueado.");
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(chequearAcceso()) {
			return dataBase.insertNewRow(rowData);
		}
		throw new RuntimeException("No estas logueado.");
	}

}
