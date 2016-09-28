package com.jian.exception;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class UnknownHostExceptionTest {
	public void x() throws UnknownHostException, IOException {
		Socket kn = new Socket("null", 21);
		InetAddress l;
		kn.getInetAddress();
		// l = kn.getRemoteSocketAddress();
		// l.getByName("a");
	}

}
