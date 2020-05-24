import java.io.*;

public class do_while_practice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str);

		do {
			System.out.println(a);
			a += 10;
		}while (a < 100);
	}
}
