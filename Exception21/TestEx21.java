package com.exceptiontest;

import com.jian.exception.EOFExceptionTest;
import com.jian.exception.FileNotFoundExceptionTest;
import com.jian.exception.MalformedURLExceptionTest;
import com.jian.exception.UnknownHostExceptionTest;

public class TestEx21 {
	public static void main(String args[]) throws Exception {
		FileNotFoundExceptionTest fileex = new FileNotFoundExceptionTest();
		EOFExceptionTest EOFex = new EOFExceptionTest();
		MalformedURLExceptionTest MUex = new MalformedURLExceptionTest();
		UnknownHostExceptionTest UKHex = new UnknownHostExceptionTest();
		fileex.b();
		EOFex.c();
		MUex.d();
		UKHex.x();
	}
}