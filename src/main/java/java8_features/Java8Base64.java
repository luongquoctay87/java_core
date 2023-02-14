package java8_features;

import java.util.Base64;

public class Java8Base64 {


    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bytes = {1, 2, 3};
        String encode = encoder.encode(bytes).toString();
        String encodeString = encoder.encodeToString(bytes);
        System.out.println(encode);
        System.out.println(encodeString);

        System.out.println("Decode: " + decoder.decode(encodeString.getBytes()));

    }
}
