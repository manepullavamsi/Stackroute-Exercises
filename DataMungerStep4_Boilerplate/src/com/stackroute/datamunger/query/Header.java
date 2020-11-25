package com.stackroute.datamunger.query;

import java.util.Arrays;

public class Header {

	/*
	 * This class should contain a member variable which is a String array, to hold
	 * the headers and should override toString() method as well.
	 */
	String headers[];

	public void setHeaders(String[] headers) {
		this.headers = headers;
	}

	public String[] getHeaders() {
		return headers;
	}

	@Override
	public String toString() {
		return "Header{" +
				"headers=" + Arrays.toString(headers) +
				'}';
	}
}
