package cubo;

public class Cubo {
			
			//----------------------------ATRIBUTOS
			private double altura;
			private int tipotinta;
			private double rendimento;

			//----------------------------CONSTRUTORES
			
			
			public Cubo ( double altura, int tipotinta, double rendimento) {
				setAltura(altura);
				setTipotinta(tipotinta);
				setRendimento(rendimento);
			}

			//---------------------------SETTERS E GETTERS
			

			public void setAltura(double altura) {
				if(altura>0) {
					this.altura = altura;
				}
			}
			public double getAltura() {
				return altura;
			}
			
			public int getTipotinta() {
				return tipotinta;
			}
			public void setTipotinta(int tipotinta) {
					this.tipotinta = tipotinta;
			}
			
			public void setRendimento(double rendimento) {
				if(rendimento>0) {
					this.rendimento = rendimento;
				}
			}
			public double getRendimento() {
				return rendimento;
			}
			
			//--------------------------------FUNCOES
			public double areaBase() {
				return (altura*altura);
			}
			
			public double areaTotal() {
				return ((altura*altura)*6);
			}
			
			public double diagonal() {
				double di = ((altura*altura)+(altura*altura));
				 di = Math.sqrt(di);
				return (di);
			}
			
			public double quantLitros() {
				return (areaTotal()*rendimento);
			}
			
			public int quantLatas() {
				return (int) ((this.quantLitros()/18));
			}
			
			public float preco() {
				if (getTipotinta()==1) {
					return (101.90f);
				} else if (getTipotinta()==2) {
					return (212.45f);
				} else {
					return (345.56f);
				}
			}
			
			public double precoTotal() {
				double saida = this.preco()*this.quantLatas();
				return(saida);
			}
			
			public double volume() {
				return ((altura*altura*altura));
			}
			
			//------------------------------SAIDA
			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("\n=== Pintura Cubo ===");
				builder.append("\nAltura: ");
				builder.append(altura);
				builder.append("\nTipo de Tinta: ");
				builder.append(tipotinta);
				builder.append("\nRendimento: ");
				builder.append(rendimento);
				builder.append("\n______________________");
				builder.append("\nArea da base: ");
				builder.append(areaBase());
				builder.append("\nArea total do cubo: ");
				builder.append(areaTotal());
				builder.append("\nVolume: ");
				builder.append(volume());
				builder.append("\nDiagonal: ");
				builder.append(diagonal());
				builder.append("\nLitros: ");
				builder.append(quantLitros());
				builder.append("\nLatas: ");
				builder.append(quantLatas());
				builder.append("\nPreco unitario: R$ ");
				builder.append(preco());
				builder.append("\nPreco total: R$ ");
				builder.append(precoTotal());
				return builder.toString();
			}	
		}

