package Assignment4Q5;

public class DownloadManager {
	public static void download(String url) {
		System.out.println(Thread.currentThread().getName()+" is started downloading"+url);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName()+" is started downloading"+url);
	}

}
