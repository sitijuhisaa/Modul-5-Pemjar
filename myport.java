import java.net.*;
import java.io.*;

public class myport{
  public static void main (String[] args)
  {
    Socket theSocket;
    String host = "localhost";

    for (int i=0; i<=100; i++)
    {
      try
      {
        theSocket = new Socket(host, i);
        theSocket.close();
        System.out.println("There is a server on port" + i + "of"+ host);
      }
      catch (UnknownHostException e)
      {
        System.err.println(e);
        break;
      }
      catch(IOException e) 
      { }
    }
  }
}
