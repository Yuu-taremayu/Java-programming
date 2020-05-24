import java.io.*;

public class while_practice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("貯金額は？");
		String str = br.readLine();
		int money = Integer.parseInt(str);

		while (money < 1000) {
			money += 100;
			System.out.println("今日は100円貯金しよう！");
			System.out.println(money);
		}
		System.out.println("1000円たまった！");
		System.out.println(money);
	}
}
