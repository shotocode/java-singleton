/**
 *  SHOTOCODE.COM
 *  Copyright (c) 2019 Shotocode.com All rights reserved.
 *	
 *  This work is licensed under the terms of the MIT license.  
 *	For a copy, see <https://opensource.org/licenses/MIT>.
 *	
 */

package com.shotocode.singleton;

/**
 * @author mbavakha
 *
 */
public class DobleCheckedLockingSingleton {

	/*
	 * Singleton With Lazy Initialization
	 * 
	 * Volatile to make sure half initialized state of instance is not available for other threads
	 * All the write will happen on volatile _instance before any of read of _instance variable
	 * 
	 * Caution: Add monitor(lock) to  synchronize to have only one instance in JVM
	 * 	For non-static:
	 * 		public synchronized void getInstance(){} 
	 *   OR 
	 *   	synchronized(this){}
	 * 
	 * 	For static
	 * 		public static synchronized void getInstance(){} 
	 * 	OR
	 * 		synchronized(ClassName.class){}
	 */
	private static volatile DobleCheckedLockingSingleton _instance; 
	
	private DobleCheckedLockingSingleton() {
		
	}
	
	/*
	 * creates instance variable if not available 
	 * Double checked locking to make sure thread safe
	 *  
	 */
	public static DobleCheckedLockingSingleton getInstance() {
		
		if(null == _instance) { // single checked
			synchronized (DobleCheckedLockingSingleton.class) { // static lock
				if(null == _instance) { // double checked
					_instance = new DobleCheckedLockingSingleton();
				}
			}
		}
		
		return _instance;
	}
}
