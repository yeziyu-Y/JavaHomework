
public class SamsungMemory implements Memory{
	String Name;
	int volume;
	double price;
	public SamsungMemory() {
		this.Name = "SamsungMemory";
		this.volume = 32;
		this.price = 950;
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
