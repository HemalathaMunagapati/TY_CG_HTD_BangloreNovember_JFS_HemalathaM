package com.caps.springcore.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;
import java.util.Vector;

public class SubClass extends SuperClass{
	
@Override
public Stack<Object> method(Vector<Object> v) throws FileNotFoundException {
	return null;
}
}
