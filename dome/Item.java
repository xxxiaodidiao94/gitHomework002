package dome;

public class Item {
	private String title;
	private int playtime;
	private boolean gotit;
	private String comment;
	
	
	
	public Item(String title, int playtime, boolean gotit, String comment) {
		super();
		this.title = title;
		this.playtime = playtime;
		this.gotit = gotit;
		this.comment = comment;
	}

	public void print() {
		System.out.print("title-"+title+";");		
	}
	
	public static void main(String[] args) {
	

	}

	

}
