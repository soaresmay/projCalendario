package calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class ControleTest {
	private Controle controle;
	
	@Before
	public  void inicializaçao() {
		this.controle = new Controle();
	}
	
	
	@Test 
	public void verificaProximoDiaDentroDoMesmoMes(){
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(30,1,2020));
		Data proximoDiaEsperado = new Data(31,1,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);		
	}
	@Test 
	public void verificaProximoDiaDentroDoMesmoMes29para30(){
		
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(29,1,2020));
		Data proximoDiaEsperado = new Data(30,1,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
		
	}
	@Test
	public void verificaProximoDiaDepoisDoDia31() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(31,1,2020));
		Data proximoDiaEsperado = new Data(1,2,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
			
	}
	
	@Test
	public void verificaProximoDiaDepoisDoDia30ParaDia31() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(30,1,2020));
		Data proximoDiaEsperado = new Data(31,1,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);			
	}
	
	@Test
	public void verificarMesDefevereiro28Para01() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(28,2,2019));
		Data proximoDiaEsperado = new Data(01,3,2019);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);			
	}
	@Test
	public void verificarMesDefevereiro() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(28,2,2020));
		Data proximoDiaEsperado = new Data(29,2,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);			
	}
	@Test
	public void verificarMesDefevereiro29Para001() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(29,2,2020));
		Data proximoDiaEsperado = new Data(1,3,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);			
	}
	

	@Test
	public void verificaViradaDoAno() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(31,12,2020));
		Data proximoDiaEsperado = new Data(1,1,2021);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);			
	}
}
