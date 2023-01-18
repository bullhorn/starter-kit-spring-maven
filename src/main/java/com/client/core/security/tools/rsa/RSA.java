package com.client.core.security.tools.rsa;

import com.client.core.security.exception.CryptoException;
import com.client.core.security.tools.Encryption;
import com.google.common.base.Charsets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * Created by kcable on 6/1/2017.
 *
 * When running locally, change file location to "src/main/resources/rsa/publicKey"
 */
@Component
public class RSA extends Encryption {

    private static final String PRIVATE_KEY_FILE_LOCATION = "WEB-INF/classes/privateKey";
    private static final String PUBLIC_KEY_FILE_LOCATION = "WEB-INF/classes/publicKey";
    private static final String ALGORITHM = "RSA/ECB/PKCS1Padding";
    private static final String RSA = "RSA";
    private static final Charset CHARSET = Charsets.UTF_8;

    @Autowired
    private ResourceLoader resourceLoader;

    public String encrypt(String value) throws CryptoException {
        try{
            PublicKey key = getPublicKey();
            Cipher cipher = Cipher.getInstance(ALGORITHM);

            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] ciphertext = cipher.doFinal(value.getBytes(CHARSET));
            return base64Encode(ciphertext);
        }catch(Exception e){
            throw new CryptoException("Error encrypting and base64 encoding value "+value+" with RSA with passed in key", e);
        }
    }

    public String decrypt(String value) throws CryptoException {
        try{
            PrivateKey key = getPrivateKey();
            Cipher cipher = Cipher.getInstance(ALGORITHM);

            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plaintext = cipher.doFinal(base64Decode(value));
            return new String(plaintext, CHARSET);
        }catch(Exception e){
            throw new CryptoException("Error base64 decoding and decrypting value "+value+" with RSA with passed in key", e);
        }
    }

    private PrivateKey getPrivateKey(){
        try {
            Resource resource = resourceLoader.getResource(PRIVATE_KEY_FILE_LOCATION);

            byte[] keyBytes = Files.readAllBytes(resource.getFile().toPath());
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
            KeyFactory kf = KeyFactory.getInstance(RSA);
            return kf.generatePrivate(spec);
        } catch (IOException e) {
            e.printStackTrace();
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }catch(InvalidKeySpecException e){
            e.printStackTrace();
        }
        return null;
    }

    private PublicKey getPublicKey() {
        try {
            Resource resource = resourceLoader.getResource(PUBLIC_KEY_FILE_LOCATION);

            byte[] keyBytes = Files.readAllBytes(resource.getFile().toPath());
            X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
            KeyFactory kf = KeyFactory.getInstance(RSA);
            return kf.generatePublic(spec);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return null;
    }
}
