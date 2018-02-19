package com.customException;

@SuppressWarnings("serial")
class NumberRangeException extends Exception {
	NumberRangeException() {
		@SuppressWarnings("unused")
		String msg = new String("Please Enter a number between 0 and 100");
	}
}
