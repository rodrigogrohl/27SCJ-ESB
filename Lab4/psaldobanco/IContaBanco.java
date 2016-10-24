package psaldobanco;

import javax.jws.WebService;

@WebService
public interface IContaBanco {
	public SaldoResponse getSaldo(SaldoRequest sreq);
}
