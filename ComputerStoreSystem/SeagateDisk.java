
public class SeagateDisk implements Harddisk{
	String Name;
	int volume; //��λΪTB
	double price;
	public SeagateDisk() {
		this.Name = "sedisk";
		this.volume = 5; //��λΪTB
		this.price = 899;
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
