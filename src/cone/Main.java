package cone;

public class Main {

	public static void main(String[] args) {
		Cone c = new Cone(2, 4, 2);
		System.out.println(c.toString());
		
		Tinta t = new Tinta(2);
		t.setLatas(c.getAreaTotal());
		t.setPrecoTotal(t.getLatas(), t.getPreco());
		System.out.println(t.toString());

	}

}