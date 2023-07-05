class Laptop {
	String make;
	String model;
	double powerWatt;
	
	Keyboard keyboard;
	
	Mouse mouse;

	public String toString(){
		return "This is a " + make + ":" + model + "laptop that takes " + powerWatt + " power. This comes " + keyboard + ". This also comes with " + mouse;
	}

}

class Keyboard{
	String keyBoardType;
	String keyBoardLayout;
	private String keyBoardBus;

	Keyboard(String type, String layOut, String bus){
		keyBoardType = type;
		keyBoardLayout = layOut;
		keyBoardBus = bus;
	}


	Keyboard(String bus){
		keyBoardType = type;
		keyBoardLayout = layOut;
		keyBoardBus = bus;
	}

	String getKeyBoardBus(){
		return keyBoardBus;
	}

	void setKeyBoardBus(String bus) {
		if(!bus.endsWith("C")){
			keyBoardBus = bus;
		}
	}

	public String toString(){
		return "keyboard of type " + keyBoardType + " with " + keyBoardLayout + " layout and uses" + keyBoardBus + " bus";
	}
}

class Mouse{
	String trackPadType;
	int trackPadButtons;

	Mouse(String padType, int buttons){
		trackPadType = padType;
		trackPadButtons = buttons;
	}

	public String toString() {
		return "trackpad with " + trackPadType + " and contains " + trackPadButtons + " buttons";
	}
}


class TestLaptop{
	public static void main(String[] args){
		Laptop computer = new Laptop();
		computer.make = "HP";
		computer.model = "Pavillion";
		computer.powerWatt = 12.5;
		computer.keyboard =  new Keyboard("Wired", "WithNumPad", "32B");
		computer.mouse = new Mouse("capacitor", 2);


		System.out.println(computer);

		// computer.keyboard.keyBoardBus = "54G";
		computer.keyboard.setKeyBoardBus("54G");

		System.out.println(computer.keyboard.getKeyBoardBus());

	}
}