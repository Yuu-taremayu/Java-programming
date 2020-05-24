import java.io.*;

public class break_practice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("いくらまで貯金しますか？");
		String str = br.readLine();
		int max = Integer.parseInt(str);
		int money = 0;

		while (true) {
			money += 100;
			System.out.println(money);
			if (money >= max) {
				break;
			}
		}
		System.out.println(money + "円たまった！");
	}
}
