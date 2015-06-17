package dao;

import java.util.List;

import model.CreditImmobilier;



public interface IdaoCreditImmobilier {
	
	public List<CreditImmobilier> getallCreditImmobilier();
	public List<CreditImmobilier> getCreditImmobilierbyid(int id);
	public void addCreditImmobilier(CreditImmobilier c);
	public void updateCreditImmobilier(CreditImmobilier c );
	public void deleteCreditImmobilier(int i);

}
