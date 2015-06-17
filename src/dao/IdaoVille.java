package dao;

import java.util.List;

import model.Pays;
import model.Ville;



public interface IdaoVille {
	
	public List<Ville> getallVille();
	public List<Ville> getVillebyid(int id);
	public void addVille(Ville c);
	public void updateVille(Ville c );
	public void deleteVille(int i);
	public Pays getPaysByVille( int v);

}
