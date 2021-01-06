package exception;

import java.io.*;

public class ExceptionEx4 {
	public static void main(String args[]) {
		try {
		File f = createFile(args[0]);
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
		} catch(Exception e) {
			System.out.println(e.getMessage() + "�ٽ� �Է����ֽñ� �ٶ��ϴ�.");
		}
	}
	
	
	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			
		File f = new File(fileName);
		f.createNewFile();
		return f;
		
		/* try {
			if (fileName == null || fileName.equals(""));
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		}catch(Exception e) {
			fileName = "�������.txt";
		}finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
		*/
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch(Exception e) { }
	}
	
}

