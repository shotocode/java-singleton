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
 * Singleton with public static factory method
 *
 */
public class FactoryMethodSingleton {
	
	private static final FactoryMethodSingleton INSTANCE = new FactoryMethodSingleton();
	
	private FactoryMethodSingleton() {}
	
	public static FactoryMethodSingleton getInstance() {
		
		return INSTANCE;
	}

}
