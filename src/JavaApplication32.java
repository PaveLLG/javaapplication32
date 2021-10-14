import java.io.*;
import java.net.Socket;

public class JavaApplication32 {
    public static void main(String[] args) throws IOException {

        Socket soc = new Socket("localhost", 30333);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));

        writer.write("Hello Server!\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str = reader.readLine();
        System.out.println("Server sent:" + str);

    }
}
