//import java.io.BufferdReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

  public static void main(String[] args) {
    String hostname = "192.168.57.101";
    int port = 8000;
    String msg = "Empty message";

    if (args.length >= 1)
    {
      msg = args[0];
    }

    try {
    Socket socket = new Socket(hostname, port);

    OutputStream out = socket.getOutputStream();
    out.write(msg.getBytes());
    out.flush();

    InputStream input = socket.getInputStream();
    byte[] byteBuf = new byte[1024];
    input.read(byteBuf);
    String readData = new String(byteBuf);
    System.out.println("Receive Msg : " + readData);

    } catch (Exception e) {
      e.printStackTrace();
    }

    return ;
  }
}

