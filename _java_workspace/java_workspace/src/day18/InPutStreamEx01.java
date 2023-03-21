package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InPutStreamEx01 {

	public static void main(String[] args) throws IOException {
		/*
		 * FileInPutStream : 바이트 단위 기반 스트림
		 */
		byte[] b = new byte[1024];
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b);

//		String data = new String(b);
//		System.out.println(data);
		System.out.println(new String(b)); // byte배열을 문자열로 변경하여 출력
		input.close();
		
		

	}

}
