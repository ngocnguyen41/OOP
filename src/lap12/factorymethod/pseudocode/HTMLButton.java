package lap12.factorymethod.pseudocode;

public class HTMLButton implements Button {
	@Override
	public void render() {
		System.out.println("HTMLButtonRender");
	}

	@Override
	public void onClick() {
		System.out.println("HTMLButtonClick");
	}
}

