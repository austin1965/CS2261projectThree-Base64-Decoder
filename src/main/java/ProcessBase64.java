import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ProcessBase64 {

    public static void main(String[] args) {
        decodeString();
        encodeUserString();
    }

    private static void decodeString() {
        String encodedString = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";
        String decodedString = new String(Base64.decodeBase64(encodedString), StandardCharsets.UTF_8);

        System.out.println("Encodeded String: " + encodedString);
        System.out.println("Decoded to: " + decodedString + "\n");
    }

    private static void encodeUserString() {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.print("Provide string to encode: ");
        userInput = scanner.nextLine();
        printEncodingResults(performEncoding(userInput));
    }

    private static byte[] performEncoding(String inputString) {
        byte[] inputToBytes;

        inputToBytes = inputString.getBytes(StandardCharsets.UTF_8);
        return Base64.encodeBase64(inputToBytes);
    }

    private static void printEncodingResults(byte[] bytesToBase64) {
        System.out.print("Encoded string: ");
        for (byte characterInt: bytesToBase64) {
            System.out.print(Character.toChars(characterInt));
        }
        System.out.print("\n");
    }
}
