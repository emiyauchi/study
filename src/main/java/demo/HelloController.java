package demo;
/**
 * 	�������ࣺ
 * 		����ҵ���߼��Ĵ���
 * 		Ҳ���Ե���������(����ҵ��㵱��ĳ����)
 * 		������ҵ���߼�
 * @author uid
 *
 */

import base.annotation.RequestMapping;

public class HelloController {
	
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("HelloController.hello()");
		/**
		 * ������ͼ����
		 * 	DispatcherServlet������ͼ����λ��ĳ����ͼ���󣬱���ĳ��jsp��
		 */
		return "hello";
	}
	
}
