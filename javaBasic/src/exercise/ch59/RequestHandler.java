package exercise.ch59;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable {
	
	private Socket clientSocket;
	private List<Customer> customerList;
	
	

	public RequestHandler(Socket clientSocket, List<Customer> customerList) {
		this.clientSocket = clientSocket;
		this.customerList = customerList;
	}



	@Override
	public void run() {
		
		try {
			System.out.println("Client Connected!");

			// TODO: 클라이언트로부터 데이터를 받기 위한 InputStream생성
			InputStream clientInputStream = clientSocket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(clientInputStream);

			// TODO: 클라이언트로부터 데이터를 보내기 위한 OutputStream생성
			OutputStream serverOutputStream = clientSocket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

				Customer customer = (Customer) objectInputStream.readObject();
				ListUtils.addList(customerList, customer);
				System.out.println("Thread " + Thread.currentThread().getName() +": "+ customer+"가 대기명단에 추가되었습니다.");
				
				// TODO: 클라이언트에게 응답을 보냄
				printWriter.println("현재 고객대기 명단: " + customerList);
				clientSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
