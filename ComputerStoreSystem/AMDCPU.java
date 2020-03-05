
public class AMDCPU implements CPU{
	String Name;
	int coreNum;
	double price;
	public AMDCPU(){
		this.Name = "AMDCPU";
		this.coreNum = 4;
		this.price = 600;
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
