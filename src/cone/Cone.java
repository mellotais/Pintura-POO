package cone;
public class Cone {
	
	//----------------------------ATRIBUTOS
		private float altura;
		private float raio;
		private float geratriz;
		private float areaTotal;
		private float areaFundo;
		private float areaLateral;
	
	//----------------------------CONSTRUTORES
	public Cone(float altura, float raio, float geratriz) {
		this.altura = altura;
		this.raio = raio;
		this.geratriz = geratriz;
		this.setAreaTotal(raio, geratriz);
		this.setAreaFundo(raio);
		this.setAreaLateral(this.getAreaTotal(), this.getAreaFundo());
	}
	
	//---------------------------SETTERS E GETTERS
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	public float getGeratriz() {
		return geratriz;
	}
	public void setGeratriz(float geratriz) {
		this.geratriz = geratriz;
	}
	public float getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(float raio, float geratriz) {
		this.areaTotal = (float) (3.14*raio)*(raio+geratriz);
	}
	public float getAreaFundo() {
		return areaFundo;
	}
	public void setAreaFundo(float raio) {
		this.areaFundo = (float) (3.14*(raio*raio));
	}
	public float getAreaLateral() {
		return areaLateral;
	}
	public void setAreaLateral(float areaTotal,float areaFundo) {
		this.areaLateral = (float)areaTotal-areaFundo;
	}

	//------------------------------SAIDA
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [altura=");
		builder.append(altura);
		builder.append(", raio=");
		builder.append(raio);
		builder.append(", geratriz=");
		builder.append(geratriz);
		builder.append(", areaTotal=");
		builder.append(areaTotal);
		builder.append(", areaFundo=");
		builder.append(areaFundo);
		builder.append(", areaLateral=");
		builder.append(areaLateral);
		builder.append("]");
		return builder.toString();
	}
}