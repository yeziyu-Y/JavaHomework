
public class SeagateDisk implements Harddisk{
	String Name;
	int volume; //单位为TB
	double price;
	public SeagateDisk() {
		this.Name = "sedisk";
		this.volume = 5; //单位为TB
		this.price = 899;
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
