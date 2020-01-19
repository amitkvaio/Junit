package junit.test.example02.morgan;

public enum Designation {
	MANAGER("MANAGER"), VICEPRESIDENT("VICE PRESIDENT"),DIRECTOR("DIRECTOR");
	
	private String text;
	Designation(String text){
		this.text=text;
	}
	
	public String getText() {
		return text;
	}
}
