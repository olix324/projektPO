package STEFAN;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class MyInput extends InputStreamReader {

	BufferedReader br;

	public MyInput(File file) throws FileNotFoundException {
		super(new FileInputStream(file), Charset.forName("UTF-8").newDecoder());
		br = new BufferedReader(this);
	}

	public String readString() throws IOException {
		String line = null;
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			sb.append(line);
			sb.append(System.lineSeparator());
		}
		return (sb.toString());
	}
}
