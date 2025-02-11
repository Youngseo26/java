package ch57;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {

	public static void main(String[] args) {

		
		List<Customer> customerList = new ArrayList<>();
		
		try (ServerSocket serverSocket = new ServerSocket(1234);) {// 서버 소켓 생성
			System.out.println("Server Started!");

			while (true) {
				try (Socket clientSocket = serverSocket.accept();) { // 클라이언트 접속 대기

					System.out.println("Client Connected!");

					// TODO: 클라이언트로부터 데이터를 받기 위한 InputStream생성
					InputStream clientInputStream = clientSocket.getInputStream();
					BufferedReader clientBufferedReader = new BufferedReader(new InputStreamReader(clientInputStream));

					// TODO: 클라이언트로부터 데이터를 보내기 위한 OutputStream생성
					OutputStream serverOutputStream = clientSocket.getOutputStream();
					PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

					// inputLine;
					String inputLine;

					// TODO: 클라이언트로부터 데이터를 읽고 화면에 출력
					while ((inputLine = clientBufferedReader.readLine()) != null) {
						System.out.println("Request from client: " + inputLine);

						String[] strs = inputLine.split(",");
						
						String customerId = strs[0];
						String customenName = strs[1];
						
						Customer customer = new Customer(customerId, customenName);
						customerList.add(customer);
						
						// TODO: 클라이언트에게 응답을 보냄
						printWriter.println("현재 고객대기 명단: " + customerList);
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
