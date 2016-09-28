package com.jian.exception;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MalformedURLExceptionTest {
	public void d() throws MalformedURLException, IOException {
		URL jn = new URL("www.goole.com");
		String h;
		h = jn.getPath();
	}
}
