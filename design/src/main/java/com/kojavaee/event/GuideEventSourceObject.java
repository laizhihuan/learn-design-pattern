/**
 * Project Name:design
 * File Name   :GuideEventSourceObject.java
 * Package Name:com.kojavaee.event
 * Date        :2014年8月25日上午10:02:43
 * Copyright (c) 2014, Distributed under the Eclipse Public License, the same as Clojure.
 *
*/

package com.kojavaee.event;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassDesc:事件源<br/>
 * Function :TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014年8月25日 上午10:02:43 <br/>
 * @author   lzh
 * @version  
 * @see 	 
 */
public class GuideEventSourceObject {
	private String name;
	/**
	 * 监听器容器
	 */
	private Set<GuideEventListener> listeners;
	
	public GuideEventSourceObject() {
		this.listeners = new HashSet<GuideEventListener>();
		this.name = "defaultname";
	}
	/**
	 * 给事件源注册监听器. </br>
	 * @param event
	 */
	public void addGuideListener(GuideEventListener event) {
		this.listeners.add(event);
	}
	
	protected void notifies() {
		GuideEventListener guideEvent = null;
		Iterator<GuideEventListener> iterator = this.listeners.iterator();
		while(iterator.hasNext()) {
			guideEvent = iterator.next();
			guideEvent.fireGuideEvent(new GuideEvent(this));
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(!this.name.equals(name)) {
			this.name = name;
			notifies();
		}
	}
}
