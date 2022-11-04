package cone;
public class Cone {
		
		//----------------------------ATRIBUTOS
		private double altura,raio;
		private int tipotinta;
		private final float pi = 3.14f;

		//----------------------------CONSTRUTORES
		
		
		public Cone(double raio, double altura, int tipotinta) {
			setRaio(raio);
			setAltura(altura);
			setTipotinta(tipotinta);
		}

		//---------------------------SETTERS E GETTERS
		
		
		
		public void setRaio(double raio) {
			if(raio>0) {
				this.raio = raio;
			}
		}
		public double getRaio() {
			return raio;
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
		public double areaBase() {
			return (pi*(raio*raio));
		}
		
		public double areaLateral() {
			return (pi*raio*geratriz());
		}
		
		public double areaTotal() {
			return (pi*raio*(raio+geratriz()));
		}
		
		public double geratriz() {
			return ((raio*raio)+(altura*altura));
		}
		
		public double quantLitros() {
			return (areaTotal()*3.45);
		}
		
		public int quantLatas() {
			return (int) ((this.quantLitros()/18));
		}
		
		public float preco() {
			if (getTipotinta()==1) {
				return (238.90f);
			} else if (getTipotinta()==2) {
				return (467.98f);
			} else {
				return (758.34f);
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
			builder.append("\n=== Pintura Cone ===");
			builder.append("\nAltura: ");
			builder.append(altura);
			builder.append("\nRaio: ");
			builder.append(raio);
			builder.append("\nTipo de Tinta: ");
			builder.append(tipotinta);
			builder.append("\nGeratriz: ");
			builder.append(geratriz());
			builder.append("\nArea da base: ");
			builder.append(areaBase());
			builder.append("\nArea lateral: ");
			builder.append(areaLateral());
			builder.append("\nArea total do cone: ");
			builder.append(areaTotal());
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
