package br.uniritter.aw.mars;

/**
 * @author alu201314277
 *
 */
public class RoboMarciano {
	private int x;
	private int y;
	private int limiteSuperiorY = 10;
	private int limiteSuperiorX = 10;
	private int limiteInferiorY = 1;
	private int limiteInferiorX = 1;

	public RoboMarciano(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void ir(DirecaoEnum direcao) throws Exception {
		direcao.ir(this);
	}

	public void andar(String passos) throws Exception {
		String[] caminho = passos.split(",");
		for (String direcao : caminho) {
			ir(DirecaoEnum.valueOf(direcao));
		}
	}

	public void incrementarY() throws Exception {
		validarLimiteSuperiorY();
		this.y++;		
	}

	public void decrementarY() throws Exception {
		validarLimiteInferiorY();
		this.y--;
		
	}

	public void incrementarX() throws Exception {
		validarLimiteSuperiorX();
		this.x++;
	}

	public void decrementarX() throws Exception {
		validarLimiteInferiorX();
		this.x--;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	private void validarLimiteSuperiorY() throws Exception {
		if (this.y == this.limiteSuperiorY)
			throw new Exception("Limite Superior Y inválido!");
	}
	
	private void validarLimiteInferiorY() throws Exception {
		if (this.y == this.limiteInferiorY)
			throw new Exception("Limite Inferior Y inválido!");
	}
	
	private void validarLimiteSuperiorX() throws Exception {
		if (this.x == this.limiteSuperiorX)
			throw new Exception("Limite Superior X inválido!");
	}
	
	private void validarLimiteInferiorX() throws Exception {
		if (this.x == this.limiteInferiorX)
			throw new Exception("Limite Inferior X inválido!");
	}
}
