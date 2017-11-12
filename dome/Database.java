package dome;

import java.util.ArrayList;

public class Database {

	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void add(Item item) {
		items.add(item);
	}
	
	public void list() {
		int count = 1;
		for(Item item:items)
		{
			System.out.print(count+". ");
			item.print();
			System.out.println();
			count++;
		}
	}
	
	public int count() {
		int num = 0;
		for(Item item:items)
		{
			num++;
		}
		reuturn num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new MP3("Hey","Jane",100,true,"like"));
		db.add(new DVD("Orange","Peter",300,false,"dislike"));
		db.list();
	}

}
