import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class DecodeBase64 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encodedString = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";
        String userInput;

        String decodedString = new String(Base64.decodeBase64(encodedString), StandardCharsets.UTF_8);

        System.out.println("Encodeded String: " + encodedString);
        System.out.println("Decoded to: " + decodedString);




    }
}
