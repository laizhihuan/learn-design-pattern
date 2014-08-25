/**
 * Project Name:design
 * File Name   :GuideEvent.java
 * Package Name:com.kojavaee.event
 * Date        :2014年8月25日上午9:57:06
 * Copyright (c) 2014, Distributed under the Eclipse Public License, the same as Clojure.
 *
*/

package com.kojavaee.event;

import java.util.EventObject;

/**
 * ClassDesc: java事件机制包括三个部分：事件、事件监听器、事件源。<br/>
 *    
 * Function :TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014年8月25日 上午9:57:06 <br/>
 * @author   lzh
 * @version  
 * @see 	 
 */
public class GuideEvent  extends EventObject {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 */
	private static final long serialVersionUID = -1893783356738904848L;
	
	private Object source;
	
	public GuideEvent(Object source) {
		super(source);
		this.source = source;
	}
	
	@Override
	public Object getSource() {
		return source;
	}
	
	public void setSource(Object source) {
		this.source = source;
	}
	
}
