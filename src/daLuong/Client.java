package daLuong;

public class Client {
public static void main(String[] args) throws InterruptedException {
//	for(int i=0; i<=10; i++) {
//		Thread sv = new SVThread("Ten "+i); 
//		sv.start();
		cach3();
	}

	private static void cach2()  {
		Thread t = new threadExample();
		t.start();
		}
	private static void cach3() throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread( new Thread3());
		Thread.sleep(5000);
		t.start();
		t.join();
		cach1();
		}
	private static void cach1() {
		System.out.println(Thread.currentThread().getName());
		Thread t = Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		t.start();
	}
	private static Thread Thread(Runnable runnable) {
		// TODO Auto-generated method stub
		return null;
	}
}

