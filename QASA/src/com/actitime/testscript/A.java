package com.actitime.testscript;

public class A {
	private int i;                               // declaration

	public A(int j) {
		i = j;                                   // intialization
	}

	public int getvalue() {                      // we can only Read the value
		return i;
	}

	public void Setvalue(int k) {
		i = k;                                    // we can set the value means giving write access
	}
}
