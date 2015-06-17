package dao;

import java.util.List;
import java.util.Set;

import model.Pays;
import model.Ville;



public interface IdaoPays {
	
	public List<Pays> getallPays();
	public List<Pays> getPaysbyid(int id);
	public void addPays(Pays c);
	public void updatePays(Pays c );
	public void deletePays(int i);
	public Set<Ville> getAllVille(int id);

}
