package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Logger;

public class S {
	public void change(){
		InputStream in =null;
		OutputStream out=null;
		File file = new File("C:\\Users\\LiuShichao\\Desktop\\123.txt");
		try {
			in = new FileInputStream(file);
			out =new FileOutputStream("C:\\Users\\LiuShichao\\Desktop\\456.txt");
			byte[] bs = new byte[1024];
			int a = 0;
			while ((a=in.read(bs)) > 0) {
				out.write(bs, 0, a);
				System.out.println(new String(bs, 0, a));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void change2(){
		Reader in =null;
		Writer out=null;
		File inFile = new File("C:\\Users\\LiuShichao\\Desktop\\123.txt");
		File outFile = new File("C:\\Users\\LiuShichao\\Desktop\\456.txt");
		try {
			//注意记事本字符集编码格式
			in =new FileReader(inFile);
			out=new FileWriter(outFile);
//			in = new InputStreamReader(new FileInputStream(inFile),"UTF-8");
//			out =new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8");
			char[] bs = new char[1024];
			int a = 0;
			while ((a=in.read(bs))>0) {
				out.write(bs, 0, a);
				System.out.println(new String(bs, 0, a));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		S s=new S();
		s.change2();
		//s.change();
	}
}
