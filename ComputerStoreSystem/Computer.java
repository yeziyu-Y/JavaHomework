public class Computer implements CPU,Memory,Harddisk,Mainboard{
	String comName;
	String CPUName;
	String MName;
	String HName;
	String MbName;
	public Computer(String comName,String CPUName,String MName,String HName,String MbName) {
		// TODO Auto-generated constructor stub
		this.comName = comName;
		this.CPUName = CPUName;
		this.MName = MName;
		this.HName = HName;
		this.MbName = MbName;
	}
	public String CPUWork() {
		IntelCPU intel= new IntelCPU();
		AMDCPU amd = new AMDCPU();
		if (this.CPUName == intel.Name) {
			return intel.CPUWork();
		}
		else {
			return amd.CPUWork();
		}
	}
	public String MWork() {
		KingstonMemory ksm= new KingstonMemory();
		SamsungMemory ssm = new SamsungMemory();
		if (this.MName == ksm.Name) {
			return ksm.MWork();
		}
		else {
			return ssm.MWork();
		}
	}
	public String HWork() {
		WestDigitalsDisk wdd = new WestDigitalsDisk();
		SeagateDisk sgd = new SeagateDisk();
		if (this.HName == wdd.Name) {
			return wdd.HWork();
		}
		else {
			return sgd.HWork();
		}
	}
	public String MBWork() {
		AsusBoard asb = new AsusBoard();
		GigabyteBoard gbb = new GigabyteBoard();
		if (this.MbName == asb.Name) {
			return asb.MBWork();
		}
		else {
			return gbb.MBWork();
		}
	}
	public double getCPUprice() {
		IntelCPU intel= new IntelCPU();
		AMDCPU amd = new AMDCPU();
		if (this.CPUName == intel.Name) {
			return intel.getCPUprice();
		}
		else {
			return amd.getCPUprice();
		}
	}
	public String CPUinfo() {
		IntelCPU intel= new IntelCPU();
		AMDCPU amd = new AMDCPU();
		if (this.CPUName == intel.Name) {
			return intel.CPUinfo();
		}
		else {
			return amd.CPUinfo();
		}
	}
	public double getMprice() {
		KingstonMemory ksm= new KingstonMemory();
		SamsungMemory ssm = new SamsungMemory();
		if (this.MName == ksm.Name) {
			return ksm.getMprice();
		}
		else {
			return ssm.getMprice();
		}
	}
	public String Minfo() {
		KingstonMemory ksm= new KingstonMemory();
		SamsungMemory ssm = new SamsungMemory();
		if (this.MName == ksm.Name) {
			return ksm.Minfo();
		}
		else {
			return ssm.Minfo();
		}
	}
	public double getHprice() {
		WestDigitalsDisk wdd = new WestDigitalsDisk();
		SeagateDisk sgd = new SeagateDisk();
		if (this.HName == wdd.Name) {
			return wdd.getHprice();
		}
		else {
			return sgd.getHprice();
		}
	}
	public String Hinfo() {
		WestDigitalsDisk wdd = new WestDigitalsDisk();
		SeagateDisk sgd = new SeagateDisk();
		if (this.HName == wdd.Name) {
			return wdd.Hinfo();
		}
		else {
			return sgd.Hinfo();
		}
	}
	public double getMbprice() {
		AsusBoard asb = new AsusBoard();
		GigabyteBoard gbb = new GigabyteBoard();
		if (this.MbName == asb.Name) {
			return asb.getMbprice();
		}
		else {
			return gbb.getMbprice();
		}
	}
	public String Mbinfo() {
		AsusBoard asb = new AsusBoard();
		GigabyteBoard gbb = new GigabyteBoard();
		if (this.MbName == asb.Name) {
			return asb.Mbinfo();
		}
		else {
			return gbb.Mbinfo();
		}
	}
	public String info() {
		return this.CPUinfo()+"       "+this.Minfo()+"          "+this.Hinfo()+"           "+this.Mbinfo();
	}
	public double getprice() {
		return this.getCPUprice()+this.getHprice()+this.getMbprice()+this.getMprice();
	}
}