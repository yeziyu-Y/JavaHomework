
public class KingstonMemory implements Memory{
	String Name;
	int volume;
	double price;
	public KingstonMemory() {
		this.Name = "ksmemory";
		this.volume = 64;
		this.price = 500;
	}
	public String MWork() {
		return this.Name+"+นคื๗";
	}
	public double getMprice() {
		return this.price;
	}
	public String Minfo() {
			return String.valueOf(this.volume)+"        "+this.price;
	}
}
