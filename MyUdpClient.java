import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
*  UDP Client Program
*  Connects to a UDP Server
*  Receives a line of input from the keyboard and sends it to the server
*  Receives a response from the server and displays it.
*
*  @author: Tyler Lewis
*     email: tylewis@chapman.edu
*     date: 2/27/2022
*
*/


class MyUdpClient {
  public static void main(String[] args) throws Exception {

    BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

    DatagramSocket clientSocket = new DatagramSocket();

    InetAddress ipAddress = InetAddress.getByName("localhost");

    String sentence;

    byte[] sendData;
    byte[] receiveData;

    DatagramPacket sendPacket;
    DatagramPacket receivePacket;

    String modifiedSentence;

    while(true){
      System.out.println("Type a Sentence");
      sentence = inFromUser.readLine();

      sendData = new byte[1024];
      receiveData = new byte[1024];
      
      sendData = sentence.getBytes();
      sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, 9876);

      clientSocket.send(sendPacket);

      receivePacket = new DatagramPacket(receiveData, receiveData.length);

      clientSocket.receive(receivePacket);

      modifiedSentence = new String(receivePacket.getData());

      System.out.println("FROM SERVER:" + modifiedSentence);

      if(sentence.equals("Goodbye")) {
        break;
      }
    }
    clientSocket.close();
  }
}
