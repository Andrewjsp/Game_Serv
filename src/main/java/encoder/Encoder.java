package encoder;

import entity.Player;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Dependent
public class Encoder {


    public String newHashPassword(Player player) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytesPassword = player.getPassword().getBytes();
        messageDigest.digest(bytesPassword);
        StringBuilder stringBuilder=new StringBuilder();
        for (byte b : bytesPassword) {
            stringBuilder.append(String.format("%02x", b));
        }
        return stringBuilder.toString();
    }
}
