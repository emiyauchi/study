package base.web;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DispatcherServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	/**
	 * 读取smartmvc的配置文件(配置有处理器类名等信息),然后将处理器实例化。
	 * 然后将处理器实例交给HandlerMapping来处理。
	 */
	public void init() throws ServletException {
		SAXReader saxReader = new SAXReader();
		//通过类加载器获取类对象的输入流
		InputStream in = getClass().getClassLoader().getResourceAsStream("smartmvc.xml");
		try {
			Document doc = saxReader.read(in);
			Element root = doc.getRootElement();
			List<Element> elements = root.elements();
			for (Element ele : elements) {
				String className = ele.attributeValue("class");
				System.out.println("className:"+className);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
