
public class GigabyteBoard implements Mainboard{
	String Name;
	int speed; 
	double price;
	public GigabyteBoard() {
		this.Name = "GigabyteBoard";
		this.speed = 4; 
		this.price = 1022;
	}
	public String MBWork() {
		return this.Name+"+นคื๗";
	}
	public double getMbprice() {
		return this.price;
	}
	public String Mbinfo() {
			return String.valueOf(this.speed)+"           "+this.price;
	}
}
