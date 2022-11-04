package piramide;

public class Piramide {
			
			//----------------------------ATRIBUTOS
			private double altura;
			private int tipotinta;
			private double ab;

			//----------------------------CONSTRUTORES
			
			
			public Piramide(double ab, double altura, int tipotinta) {
				setAb(ab);
				setAltura(altura);
				setTipotinta(tipotinta);
			}

			//---------------------------SETTERS E GETTERS
			
			
			
			public void setAb(double ab) {
				if(ab>0) {
					this.ab = ab;
				}
			}
			public double getAb() {
				return ab;
			}
			
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
			
			//--------------------------------FUNCOES
			
			public double areaTriangulo() {
				return (((ab+ab)+altura)/2);
			}
			
			public double a1() {
				double a = ((altura*altura)+(ab*ab));
				return (Math.sqrt(a));
			}
			
			
			public double areaBase() {
				return ((ab+ab)*(ab+ab));
			}
			
			public double areaTotal() {
				return ((areaTriangulo()*4)+areaBase());
			}
			
			public double volume() {
				return ((areaBase()*altura)/3);
			}
			
			public double quantLitros() {
				return (areaTotal()*4.76);
			}
			
			public int quantLatas() {
				return (int) ((this.quantLitros()/18));
			}
			
			public float preco() {
				if (getTipotinta()==1) {
					return (127.90f);
				} else if (getTipotinta()==2) {
					return (258.98f);
				} else {
					return (344.34f);
				}
			}
			
			public double precoTotal() {
				double saida = this.preco()*this.quantLatas();
				return(saida);
			}
			
			
			//------------------------------SAIDA
			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("\n=== Pintura Pirâmide ===");
				builder.append("\nAltura: ");
				builder.append(altura);
				builder.append("\nAb: ");
				builder.append(ab);
				builder.append("\nA1: ");
				builder.append(a1());
				builder.append("\nTipo de Tinta: ");
				builder.append(tipotinta);
				builder.append("\nArea da base: ");
				builder.append(areaBase());
				builder.append("\nArea total: ");
				builder.append(areaTotal());
				builder.append("\nLitros: ");
				builder.append(quantLitros());
				builder.append("\nLatas: ");
				builder.append(quantLatas());
				builder.append("\nPreco unitario: R$ ");
				builder.append(preco());
				builder.append("\nPreco total: R$ ");
				builder.append(precoTotal());
				builder.append("\nVolume: ");
				builder.append(volume());
				return builder.toString();
			}	
		}

