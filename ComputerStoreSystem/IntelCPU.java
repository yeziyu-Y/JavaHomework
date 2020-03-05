
public class IntelCPU implements CPU{
	String Name;
	int coreNum;
	double price;
	public IntelCPU(){
		this.Name = "intelCPU";
		this.coreNum = 8;
		this.price = 900;
	}
	public String CPUWork() {
		return this.Name+"+นคื๗";
	}
	public double getCPUprice() {
		return this.price;
    }
	public String CPUinfo() {
			return String.valueOf(this.coreNum)+"     "+this.price;
	}
}