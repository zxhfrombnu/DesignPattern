package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.omg.CORBA_2_3.portable.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		try {
			LowerCaseInputStream in =
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("test.txt")));
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
