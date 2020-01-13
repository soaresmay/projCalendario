package calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ControleTest {

	@Test
	public void verificaProximoDiaDentroDoMesmoMes() {
		Controle controle = new Controle();
		Data data = new Data (03, 01, 2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado =  controle.proximoDia(data);
		Data proximoDiaEsperado = new Data (04, 01, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	
	@Test
	public void verificaProximoDiaEmMesesDiferenteComMesDe31Dias() {
		Controle controle = new  Controle();
		Data data = new Data (31, 01, 2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado =  controle.proximoDia(data);
		Data proximoDiaEsperado = new Data (01, 02, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
			
	}
	@Test
	public void verificaProximoDiaEmMesesDiferenteComMesDe30Dias() {
		Controle controle = new  Controle();
		Data data = new Data (30, 04, 2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado =  controle.proximoDia(data);
		Data proximoDiaEsperado = new Data (01, 05, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	@Test
	public void verificarSeAnoEBissexto() {
		Controle controle = new Controle();
		Data data = new Data (28, 02, 2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado =  controle.proximoDia(data);
		Data proximoDiaEsperado = new Data (29, 02, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
		
	}
	@Test
	public void verificarViradaDeUmParaOOutro() {
		Controle controle = new Controle();
		Data data = new Data (28, 02, 2019);
		Data proximoDiaRetornado;
		proximoDiaRetornado =  controle.proximoDia(data);
		Data proximoDiaEsperado = new Data (01, 03, 2019);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
		
	}
	
}
