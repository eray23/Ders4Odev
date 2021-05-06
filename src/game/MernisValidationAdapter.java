package game;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisValidationAdapter implements UserValidationService{
	
	@Override
	public boolean Validate(User user) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(user.getTc()), user.getFirstName(), user.getLastName(), user.getDateOfBirth().getYear());
		  } catch (NumberFormatException i) {
			   i.printStackTrace();
		  } catch (RemoteException i) {
		       i.printStackTrace();
		  }
		 return result;
		
		
	}
}
