
public class AsusBoard implements Mainboard{
	String Name;
	int speed; 
	double price;
	public AsusBoard() {
		this.Name = "AsusBoard";
		this.speed = 6; 
		this.price = 1288;
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
