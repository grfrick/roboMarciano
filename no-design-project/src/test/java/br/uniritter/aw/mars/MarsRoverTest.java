package br.uniritter.aw.mars;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
	@Test
	public void deveIrParaNorte() throws Exception {
		RoboMarciano marsRover = new RoboMarciano(5,5);
		marsRover.andar(DirecaoEnum.N.name());
		Assert.assertEquals(marsRover.getX(), 5);
		Assert.assertEquals(marsRover.getY(), 4);
	}
	
	@Test
	public void devePercorrerUmCaminho1() throws Exception {
		RoboMarciano marsRover = new RoboMarciano(5,5);
		marsRover.andar("L,L,N,N,L,L");
		Assert.assertEquals(marsRover.getX(), 9);
		Assert.assertEquals(marsRover.getY(), 3);
	}
	
	@Test
	public void devePercorrerUmCaminho2() throws Exception {
		RoboMarciano marsRover = new RoboMarciano(5,5);
		marsRover.andar("O,O,S,S,O,O");
		Assert.assertEquals(marsRover.getX(), 1);
		Assert.assertEquals(marsRover.getY(), 7);
	}
	
	@Test (expected = Exception.class)
	public void deveCaminharNao() throws Exception {
		RoboMarciano marsRover = new RoboMarciano(1,1);
		marsRover.andar("O,O,S,S");		
	}
	
	@Test
	public void deveFuncionarPoisEliasTaAqui() throws Exception {
		RoboMarciano marsRover = new RoboMarciano(10,10);
		marsRover.andar("O,O,O,O,O,O,O,O,O,N,N,N,N,N,N,N,N,N,L,L,L,L,L,L,L,L,L,S,O,S,O,S,O,S,O,S,O,S,O,S,O,S,O,S,O,N,L,N,L,N,L,N,L,N,L,N,L,N,L,N,L,N,L,O,O,O,O,O,O,O,O,O,L,S,L,S,L,S,L,S,L,S,L,S,L,S,L,S,L,S");
		Assert.assertEquals(marsRover.getX(), 10);
		Assert.assertEquals(marsRover.getY(), 10);
	}
}
