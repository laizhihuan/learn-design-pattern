/**
 * Project Name:design
 * File Name   :Main.java
 * Package Name:com.kojavaee.observer
 * Date        :2014年6月27日下午4:32:09
 * Copyright (c) 2014, Distributed under the Eclipse Public License, the same as Clojure.
 *
*/

package com.kojavaee.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassDesc:观察者的主题<br/>
 * Date:     2014年6月27日 下午4:23:02 <br/>
 * @author   lzh
 * @version  
 * @see 	 
 */
public class Subject {
	private List<Observer> observers;
	
	public Subject() {
		this.observers = new ArrayList<Observer>();
	}
	
	public Subject attach(Observer observer) {
		observers.add(observer);
		return this;
	}
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
}
