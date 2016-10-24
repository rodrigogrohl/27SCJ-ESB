package psaldobanco;

import java.util.Date;

import javax.jws.WebService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@WebService
public class ContaBanco implements IContaBanco{
	static final double SALDO=5000;
	public SaldoResponse getSaldo(SaldoRequest sreq){
		
			SaldoResponse sres = new SaldoResponse();
			sres.setAgencia(sreq.getAgencia());
			sres.setConta(sreq.getConta());
			sres.setName(sreq.getName());
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			sres.setDate(date);
			sres.setSaldo(SALDO);
		return sres; 
	}
}
