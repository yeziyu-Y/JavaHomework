public class ComputerStore {

	public ComputerStore() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("计算机名称"+"  "+" coreNum"+" "+"CPUPrice"+" "+"MemoryVolume"+" "+"MemoryPrice"+" "+"HardDiskVolume"+" "+"HardDiskPrice"+" "+"MainBoardSpeed"+" "+"MainBoardPrice"+"    "+"TotalPrice       "+"工作情况");
		Computer []c = new Computer[3];
		c[0] = new Computer("computer1","intelCPU","ksmemory","wddisk","GigabyteBoard");
		c[1] = new Computer("computer2","intelCPU","SamsungMemory","wddisk","AsusBoard");
		c[2] = new Computer("computer3","AMDCPU","ksmemory","sedisk","AsusBoard");
		for (int i = 0;i < 3;i++) {
			System.out.println(c[i].comName+" "+c[i].info()+"              "+c[i].getprice()+"      "+c[i].CPUWork()+"  "+c[i].MWork()+"  "+c[i].HWork()+"  "+c[i].MBWork());
		}
	}

}
