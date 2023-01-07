package lap12.factorymethod.pseudocode;

public class WindowsButton implements Button {
	@Override
	public void render() {
		System.out.println("WindowsButtonRender");
	}

	@Override
	public void onClick() {
		System.out.println("WindowsButtonClick");
	}
}
