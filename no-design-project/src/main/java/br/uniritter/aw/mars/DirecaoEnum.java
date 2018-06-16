package br.uniritter.aw.mars;

public enum DirecaoEnum {
	N {
		@Override
		void ir(RoboMarciano robo) throws Exception {
				robo.decrementarY();
		}
	},
	S {
		@Override
		void ir(RoboMarciano robo) throws Exception {
				robo.incrementarY();
		}
	},
	L {
		@Override
		void ir(RoboMarciano robo) throws Exception {
			robo.incrementarX();					
		}
	},
	O {
		@Override
		void ir(RoboMarciano robo) throws Exception {
				robo.decrementarX();
		}
	};

	abstract void ir(RoboMarciano robo) throws Exception;
}
