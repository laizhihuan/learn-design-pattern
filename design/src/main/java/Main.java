/**
 * Project Name:design
 * File Name   :Main.java
 * Package Name:com.kojavaee.observer
 * Date        :2014年6月27日下午4:32:09
 * Copyright (c) 2014, Distributed under the Eclipse Public License, the same as Clojure.
 *
*/
import com.kojavaee.command.Command;
import com.kojavaee.command.HelloPrintCommand;
import com.kojavaee.observer.HiObserver;
import com.kojavaee.observer.Subject;


/**
 * ClassDesc:设计模式入口<br/>
 * Date:     2014年6月27日 下午4:32:09 <br/>
 * @author   lzh
 * @version  
 * @see 	 
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Observer : ");
		Subject subject = new Subject().attach(new HiObserver());
		subject.notifyObservers();
		
		System.out.println("Command : ");
		Command command = new HelloPrintCommand();
		command.execute();
	}
}
