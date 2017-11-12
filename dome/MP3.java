package dome;

public class MP3 extends Item {
	private String artist;
	
	public MP3(String title, String artist,int playtime, boolean gotit, String comment) {
		super(title,playtime,gotit,comment);
		this.artist = artist;
	}
	
	
	@Override
	public void print() {
		System.out.print("(MP3) ");
		super.print();
		System.out.print("artist-"+artist+";");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3 mp3 = new MP3("Hey","Jane",100,true,"like");
		mp3.print();
	}

}
