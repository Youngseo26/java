package ch57;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		//  서버에 연걸
		try(Socket socket = new Socket("localhost", 1234);) {
			
			//  서버로 데이터를 보내기위한 OutputStream 생성
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter clientPrintWriter = new PrintWriter(outputStream, true);
			
			//  서버로부터 데이터를 받기위한 InputStream 생성
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			//  서버에 메세지 전송
			clientPrintWriter.println("ID001 ,사람");
			
			//  서버로부터 받은 응답 출력
			String res = bufferedReader.readLine();
			System.out.println("서버의 응답(고객대기리스트): " + res);
			System.out.println("Client End");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
