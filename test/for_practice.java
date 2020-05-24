import java.io.*;

public class for_practice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int times = Integer.parseInt(str);

		for (int i = 0; i < times; i++) {
			System.out.println(i);
		}
	}
}
