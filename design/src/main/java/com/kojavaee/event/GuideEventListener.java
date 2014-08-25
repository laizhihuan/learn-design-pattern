/**
 * Project Name:design
 * File Name   :GuideEventListener.java
 * Package Name:com.kojavaee.event
 * Date        :2014年8月25日上午10:00:59
 * Copyright (c) 2014, Distributed under the Eclipse Public License, the same as Clojure.
 *
*/

package com.kojavaee.event;

import java.util.EventListener;

/**
 * ClassDesc:TODO Add desc<br/>
 * Function :TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014年8月25日 上午10:00:59 <br/>
 * @author   lzh
 * @version  
 * @see 	 
 */
public class GuideEventListener implements EventListener {
	
	public void fireGuideEvent(GuideEvent event) {
		GuideEventSourceObject obj = (GuideEventSourceObject)event.getSource();
		System.out.println("my name has been changed!");
		System.out.println("I got a new name, named " + obj.getName());
	}
}
