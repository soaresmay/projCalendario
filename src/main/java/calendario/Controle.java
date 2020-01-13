package calendario;

public class Controle {

	public Data proximoDia(Data dataAtual){
		Data proximoDia = new Data(0, 0, 0);
		//diaAtual for o ultimo dia do mes
		// diaAtual nao for ultimo dia do mes
		// diaAtual for o ultimo dia do ano
		if(dataAtual.getDia()!= getUltimoDiaDoMes(dataAtual.getMes(), dataAtual.getAno())) {
			proximoDia.setDia(dataAtual.getDia()+1);
			proximoDia.setMes(dataAtual.getMes());
			proximoDia.setAno(dataAtual.getAno());
	}else {
		proximoDia.setDia(1);
		proximoDia.setMes(dataAtual.getMes()+1);
		proximoDia.setAno(dataAtual.getAno());
		if(dataAtual.getMes() == 12 ) {
			proximoDia.setMes(1);
			proximoDia.setAno(dataAtual.getAno()+1);			
		}
	}
		
		return proximoDia;
	}
	
	
	
	private int getUltimoDiaDoMes(int mes, int ano) {
		int ultimoDia; 
		int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if(mes == 2 && ehbissexto(ano))
			ultimoDia = 29;
		else  
			ultimoDia = meses[mes-1];
		return ultimoDia;
	}
	private boolean ehbissexto(int ano) {
		boolean bissexto = false;
		if(ano % 4 == 0 && ano % 100 != 0) {
			bissexto = true;
		}else if(ano % 400 == 0) {
			bissexto = true;
		}
		return bissexto;
	}	
	

}
