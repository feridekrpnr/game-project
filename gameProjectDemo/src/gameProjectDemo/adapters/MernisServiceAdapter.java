package gameProjectDemo.adapters;

import gameProjectDemo.business.abstracts.GamerCheckService;
import gameProjectDemo.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		try {
			KPSPublicSoap client = new KPSPublicSoapProxy();
			boolean isValid =client.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()),
					gamer.getName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getDateOfBirth());
			return isValid;
		} catch (Exception e) {
			
			System.out.println("Giris bilgileri dogru degil");
		}
		
		return false;
	}

}
