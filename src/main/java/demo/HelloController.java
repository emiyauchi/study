package demo;
/**
 * 	处理器类：
 * 		负责业务逻辑的处理，
 * 		也可以调用其他类(比如业务层当中某个类)
 * 		来处理业务逻辑
 * @author uid
 *
 */

import base.annotation.RequestMapping;

public class HelloController {
	
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("HelloController.hello()");
		/**
		 * 返回视图名。
		 * 	DispatcherServlet依据视图名定位到某个视图对象，比如某个jsp。
		 */
		return "hello";
	}
	
}
