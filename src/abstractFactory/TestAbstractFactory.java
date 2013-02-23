package abstractFactory;

/*******************************************/
/** interface product a & b */
interface Fruit {
}

interface Veggie {
}

/*******************************************/
/** concrete product a */
class NorthernFruit implements Fruit {
	private String name;
	
	public NorthernFruit(String name) {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class TropicalFruit implements Fruit {
	private String name;
	
	public TropicalFruit(String name) {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

/*******************************************/
/** concrete product b */
class NorthernVeggie implements Veggie {
	private String name;
	
	public NorthernVeggie(String name) {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class TropicalVeggie implements Veggie {
	private String name;
	
	public TropicalVeggie(String name) {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this. name = name;
	}
}

/** abstract factory */
interface Gardener {
	public Fruit createFruit(String name);
	
	public Veggie createVeggie(String name);
}

/** concrete factory 1 */
class NorthernGardener implements Gardener {
	public Fruit createFruit(String name) {
		return new NorthernFruit(name);
	}
	
	public Veggie createVeggie(String name)
	{
		return new NorthernVeggie(name);
	}
}

/** concrete factory 2 */
class TropicalGardener implements Gardener {
	public Fruit createFruit(String name) {
		return new TropicalFruit(name);
	}
	
	public Veggie createVeggie(String name) {
		return new TropicalVeggie(name);
	}
}

/*******************************************/
public class TestAbstractFactory {
	public static void main(String[] args) {
		Gardener g1 = new NorthernGardener();
		Gardener g2 = new TropicalGardener();
		
		g1.createFruit("a1");
		g1.createVeggie("b1");
		
		g2.createFruit("a2");
		g2.createVeggie("b2");
	}
}
