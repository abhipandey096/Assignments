package Assignment4Q5;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<String> list=FileUtil.readFiles("photos.txt");
		for(String url: list) {
			FileDownloaderTask task=new FileDownloaderTask(url);
			Thread thread =new Thread(task);
			DownloadManager.download(url);
			thread.start();
		}
		
	}

}
