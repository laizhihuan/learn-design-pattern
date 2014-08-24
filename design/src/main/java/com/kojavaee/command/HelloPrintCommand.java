/**
 * Project Name:design
 * File Name   :HelloPrintCommand.java
 * Package Name:com.kojavaee.command
 * Date        :2014年8月24日上午9:15:24
 * Copyright (c) 2014, Distributed under the Eclipse Public License, the same as Clojure.
 *
*/

package com.kojavaee.command;

import java.io.PrintStream;

/**
 * ClassDesc:TODO Add desc<br/>
 * Function :TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014年8月24日 上午9:15:24 <br/>
 * @author   lzh
 * @version  
 * @see 	 
 */
public class HelloPrintCommand implements Command {
	private PrintStream printer = System.out;
	
	public void setPrinter(PrintStream printer) {
		this.printer = printer;
	}
	
	@Override
	public void execute() {
		printer.println("hi command");
	}

}
