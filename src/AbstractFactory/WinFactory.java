package AbstractFactory;

import java.awt.Button;

public class WinFactory implements GUIFactory{
	public Button createButton(){
		return new WindowsButton();
	}
}
