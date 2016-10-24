package psaldobanco;

import java.util.Date;

public class SaldoResponse {
	private String name;
	private String agencia;
	private String conta;
	private Date date;
	private double saldo;
	

	public  String getName(){
		return this.name;
	}
	
	public String getAgencia(){
		return this.agencia;
	}
	
	public String getConta(){
		return this.conta;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public double getSaldo(){
		return this.saldo;
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
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
}
