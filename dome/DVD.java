package dome;

public class DVD extends Item{
	private String director;
	
	public DVD(String title,String director, int playtime, boolean gotit, String comment) {
		super(title, playtime, gotit, comment);
		this.director = director;
	}

	
	@Override
	public void print() {
		System.out.print("(DVD) ");
		super.print();
		System.out.print("director-"+director+";");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
