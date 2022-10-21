package cone;

public class Tinta {
	
	//----------------------------ATRIBUTOS
	
	private int tipo;
	private float preco;
	private int latas;
	private float precoTotal;
	private final float RENDIMENTO = (float) 3.45;
	private final int QTD = 18;
	
	//----------------------------CONSTRUTORES
	
	public Tinta(int tipo) {
		this.tipo = tipo;
		this.setPreco(tipo);
	}
	
	//---------------------------SETTERS E GETTERS
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(int tipo) {
		if (tipo == 1) {
			preco = (float)238.90;
		}else if (tipo == 2) {
			preco = (float)467.98;
		}else if (preco == 3) {
			preco = (float)758.34;
		}else {
			preco = 0;
		}
	}

	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(int latas, float preco) {
		this.precoTotal = latas * preco;
	}

	public int getLatas() {
		return latas;
	}

	public void setLatas(float areaTotal) {
		this.latas = (int) (areaTotal/(QTD*RENDIMENTO)+1);
	}

	public float getRENDIMENTO() {
		return RENDIMENTO;
	}

	public int getQTD() {
		return QTD;
	}
	
	//------------------------------SAIDA
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tinta [tipo=");
		builder.append(tipo);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", latas=");
		builder.append(latas);
		builder.append(", precoTotal=");
		builder.append(precoTotal);
		builder.append(", RENDIMENTO=");
		builder.append(RENDIMENTO);
		builder.append(", QTD=");
		builder.append(QTD);
		builder.append("]");
		return builder.toString();
	}
	
}