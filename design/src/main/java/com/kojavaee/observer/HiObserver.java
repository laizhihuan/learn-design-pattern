/**
 * Project Name:design
 * File Name   :Main.java
 * Package Name:com.kojavaee.observer
 * Date        :2014年6月27日下午4:32:09
 * Copyright (c) 2014, Distributed under the Eclipse Public License, the same as Clojure.
 *
*/

package com.kojavaee.observer;

import java.io.PrintStream;

/**
 * ClassDesc:观察者的具体实现<br/>
 * @author   lzh
 * @version  
 * @see 	 
 */
public class HiObserver implements Observer {
	
	private PrintStream printer = System.out;
	
	public void setPrinter(PrintStream printer) {
        this.printer = printer;
    }
	
	@Override
	public void update() {
		printer.println("hi Observer!");
	}
	
}
