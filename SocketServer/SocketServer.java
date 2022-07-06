import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class SocketServer extends Thread {

  private ServerSocket serverSocket;
  private int port;

  public SocketServer(int port)
  {
    System.out.println("SocketServer");
    this.port = port;

    try {
    this.serverSocket = new ServerSocket(this.port);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void finalize()
  {
    System.out.println("finalize");
    try {
    this.serverSocket.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void run()
  {
    while (true)
    {
      try {
        System.out.println("Waiting for client on port " +
                       serverSocket.getLocalPort() + "...");
        Socket socket = serverSocket.accept();
        System.out.println("accepted");

        for (int i=0; i<10; i++) {
        InputStream input = socket.getInputStream();
        byte[] byteBuf = new byte[1024];
        input.read(byteBuf);
        String readData = new String(byteBuf);
        System.out.println("Receive Msg : " + readData);

        OutputStream output = socket.getOutputStream();
        String test = "hellow!";
        output.write(test.getBytes());
        output.flush();

        input.read(byteBuf);
        readData = new String(byteBuf);
        System.out.println("Receive Msg : " + readData);

        output.write(test.getBytes());
        output.flush();
        }

        socket.close();

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args)
  {
    System.out.println("main()");

    SocketServer ss = new SocketServer(8000);

    ss.run();
  }
}
