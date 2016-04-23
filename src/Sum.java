import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sum {

	/**
	 * @param args
	 * @throws IOException 
	 * master
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i;
		String s1;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader buf=new BufferedReader(isr);
		s1=buf.readLine();
		i=Integer.parseInt(s1);
		i=i-1;
		System.out.println(i);
	}

}

