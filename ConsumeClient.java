package ����;

public class ConsumeClient {
	public static void main(String[] args) throws Exception { 
		MqClient client= new MqClient() ; 
		String message= client.consume(); 
		System.out.println("��ȡ����ϢΪ: " + message);
	}
}
