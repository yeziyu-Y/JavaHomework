
public class WestDigitalsDisk implements Harddisk{
	String Name;
	int volume; //��λΪTB
	double price;
	public WestDigitalsDisk() {
		this.Name = "wddisk";
		this.volume = 2; //��λΪTB
		this.price = 756;
	}
	public String HWork() {
		return this.Name+"+����";
	}
	public double getHprice() {
		return this.price;
	}
	public String Hinfo() {
			return String.valueOf(this.volume)+"            "+this.price;
	}
}
