package com.jian.exception;

import java.io.EOFException;
import java.io.IOException;

public class EOFExceptionTest {
	public void c() throws EOFException, IOException {
		throw new EOFException("信息输入有误");

	}
}
