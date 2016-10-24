package psaldobanco;

public class SaldoRequest {
	private String name;
	private String agencia;
	private String conta;
	
	public  String getName(){
		return this.name;
	}
	public String getAgencia(){
		return this.agencia;
	}
	public String getConta(){
		return this.conta;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	public void setConta(String conta){
		this.conta = conta;
	}
	
}
