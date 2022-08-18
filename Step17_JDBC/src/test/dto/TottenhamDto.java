package test.dto;

public class TottenhamDto {
	//필드에 변수 선언
	private int num;
	private String name;
	private String position;
	
	public TottenhamDto() {}
	
	//오른쪽클릭 -> source -> generate constructor using field
	public TottenhamDto(int num, String name, String position) {
		super();
		this.num = num;
		this.name = name;
		this.position = position;
	}
	//Right Click -> source -> generate getter and setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
