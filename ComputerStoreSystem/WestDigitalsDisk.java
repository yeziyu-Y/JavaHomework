
public class WestDigitalsDisk implements Harddisk{
	String Name;
	int volume; //单位为TB
	double price;
	public WestDigitalsDisk() {
		this.Name = "wddisk";
		this.volume = 2; //单位为TB
		this.price = 756;
	}
	public String HWork() {
		return this.Name+"+工作";
	}
	public double getHprice() {
		return this.price;
	}
	public String Hinfo() {
			return String.valueOf(this.volume)+"            "+this.price;
	}
}
