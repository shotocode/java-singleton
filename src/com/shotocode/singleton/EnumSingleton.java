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
 * @author shotocode
 * 
 * Advantages of enum singleton is thread safe, easy to write etc
 *
 */
public enum EnumSingleton {
	
	/*
	 * Equivalent to public final static EnumSingleton instance = new EnumSingleton();
	 * private EnumSingleton(){}
	 */
	INSTANCE; 
	
	// getters & setters
}
