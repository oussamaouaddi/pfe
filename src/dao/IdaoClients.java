package dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import model.Clients;



public interface IdaoClients {
	
	public List<Clients> getallClients();
	public List<Clients> getClientsbyid(int id);
	public void addClients(Clients c);
	public void updateClients(Clients c );
	public void deleteClients(int i);
	public void imageClients( int i ,String nom, String chemin) throws IOException, SQLException;
	public void DocumentsClients(int i );
}
