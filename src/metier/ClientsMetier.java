package metier;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Clients;
import dao.IdaoClients;

public class ClientsMetier {

	IdaoClients daoClients;

	public List<Clients> getallClientss() {
		return daoClients.getallClients();

	}

	public List<Clients> getClientsbyid(int id) {

		return daoClients.getClientsbyid(id);

	}

	public void addClients(Clients b) {

		daoClients.addClients(b);

	}

	public void setdaoClients(IdaoClients daoClients) {
		this.daoClients = daoClients;
	}

	public void deleteClients(int i) {
		daoClients.deleteClients(i);
		;
	}

	public void updateClients(Clients c) {
		daoClients.updateClients(c);
	}

	public void imageClients(int i ,String nom, String chemin ) throws IOException, SQLException {
		
		daoClients.imageClients(i, nom, chemin);
		
		
	}
}
