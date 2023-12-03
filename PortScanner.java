import java.net.*;
import java.io.*;

public class PortScanner {
    public static void main(String[] args) {
        String host = "dicoding.com"; // Nama host yang ingin Anda periksa
        int startPort = 500;
        int endPort = 1000;

        System.out.println("Scanning ports on host " + host + " from " + startPort + " to " + endPort + "...");

        for (int port = startPort; port <= endPort; port++) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(host, port), 10000); // Tambahkan timeout
                System.out.println("Port " + port + " pada " + host + " aktif.");
            } catch (IOException e) {
                // Port tidak aktif, lanjutkan pencarian
            }
        }

        System.out.println("Selesai.");
    }
}
