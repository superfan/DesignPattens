package factoryMethod;

/** Product */
class Button {
	/* ...*/
}

/** Concrete Product */
class WinButton extends Button {
	/* ...*/
}

class MacButton extends Button {
	/* ...*/
}

/** Creator */
interface ButtonFactory {
  Button createButton();
}

/** Concrete Creator */
class WinButtonFactory implements ButtonFactory {
  public Button createButton() {
      return new WinButton();
  }
}

/** Concrete Creator */
class MacButtonFactory implements ButtonFactory {
  public Button createButton(){
      return new MacButton();
  }
}

/*************************************/
/** Concrete Creator with parameters */
class Creator {
  public Button createButton(int productId){
	  if (productId == 1) {
		  return new WinButton();
	  }
	  else {
		  return new MacButton();
	  }
  }
}
/*************************************/

public class TestFactoryMethod {
	public static void main(String [] args) {
		WinButtonFactory factory1 = new WinButtonFactory();
		Button button1 = factory1.createButton();
		
		MacButtonFactory factory2 = new MacButtonFactory();
		Button button2 = factory2.createButton();
	}
}
