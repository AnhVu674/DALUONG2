package daLuong;

public class SVThread extends Thread{
	private String ten;
	private static lapTop lt = null;
	static {
		lt = new lapTop("HP", false);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public SVThread(String ten) {
		this.ten = ten;
	}

	public void run() {
		try {
			suDungLapTop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void suDungLapTop() throws InterruptedException {
		synchronized (lt) {
			while (lt.isDangSD()) {
				wait();
			}
			System.out.println("SV "+getTen()+" su dung LapTop");
			lt.setDangSD(true);
			Thread.sleep(3000);
			lt.setDangSD(false);
			lt.notify();
			
		}
	}
}
