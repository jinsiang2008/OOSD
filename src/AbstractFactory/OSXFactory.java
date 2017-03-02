package AbstractFactory;

import java.awt.Button;

public class OSXFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}
}
