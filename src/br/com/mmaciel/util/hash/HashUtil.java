package br.com.mmaciel.util.hash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtil {

	public static String geraHashDoTexto(String texto) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		BigInteger hash = new BigInteger(1, md.digest(texto.getBytes()));
		String valorCalculado = hash.toString(16);
		return valorCalculado;
	}

	public static String geraHashDoTexto(String texto, String algoritimo) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(algoritimo);
		BigInteger hash = new BigInteger(1, md.digest(texto.getBytes()));
		String valorCalculado = hash.toString(16);
		return valorCalculado;
	}

}
