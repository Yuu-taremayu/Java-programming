import java.io.*;

public class if_practice {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("気温は？");
		String str = br.readLine();
		int temperature = Integer.parseInt(str);

		System.out.println("晴れは何日目？");
		str = br.readLine();
		int sunnyday = Integer.parseInt(str);

		if ((temperature >= 30) && (sunnyday >= 3)) {
			System.out.println("桜が咲くかもね！");
		}
		else if (temperature >= 30) {
			System.out.println("もうちょっと晴れればな〜");
		}
		else if (sunnyday >= 3) {
			System.out.println("もうちょっと暖かかったらな〜");
		}
		else {
			System.out.println("まだまだだね！");
		}
	}
}
