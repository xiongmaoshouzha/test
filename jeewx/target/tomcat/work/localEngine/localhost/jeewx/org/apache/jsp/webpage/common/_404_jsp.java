package org.apache.jsp.webpage.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<style>\n");
      out.write("    .code {\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        background: #efefef;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("    .propNS {\n");
      out.write("        color: #660E7A\n");
      out.write("    }\n");
      out.write("    .propTag {\n");
      out.write("        color: #000080\n");
      out.write("    }\n");
      out.write("    .propName {\n");
      out.write("        color: #0000ff;\n");
      out.write("    }\n");
      out.write("    .propValue{\n");
      out.write("        color: #008000\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<div style=\"height: 100%; margin: 14px 20px 0 20px; overflow-y: auto\">\n");
      out.write("    <div style=\"background: pink; margin-right: 50px; padding: 10px; text-align: center;\">\n");
      out.write("        <div>404 error!请求地址有误！ </div>\n");
      out.write("        <div>请参照下面的步骤检查你的项目。</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div><h5>代码生成前，配置相关文件</h5></div>\n");
      out.write("    <div style=\"margin-right: 50px;\">\n");
      out.write("        <ul>\n");
      out.write("            <li>生成代码包的路径(jeecg_config.properties)：\n");
      out.write("                <pre class=\"code\">\n");
      out.write("\n");
      out.write("  <span class=\"propTag\">bussi_package</span>=<span class=\"propValue\">com.buss</span> // 生成代码的包前缀\n");
      out.write("                </pre>\n");
      out.write("            </li>\n");
      out.write("            <li>代码生成界面的配置：\n");
      out.write("                <ol>\n");
      out.write("                    <li>表名：<span class=\"propValue\">guoming_test</span>；</li>\n");
      out.write("                    <li>包名：<span class=\"propValue\">guoming</span>；</li>\n");
      out.write("                    <li>代码分层风格：<span class=\"propValue\">代码分层</span>；</li>\n");
      out.write("                </ol>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div><h5>代码生成后，编辑配置文件</h5></div>\n");
      out.write("    <div style=\"margin-right: 50px;\">\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                加载Controller(spring-mvc.xml)\n");
      out.write("                <pre class=\"code\">\n");
      out.write("\n");
      out.write("  &lt;<span class=\"propNS\">context</span><span class=\"propTag\">:component-scan</span> <span class=\"propName\">base-package=</span><span class=\"propValue\">\"com.buss.*\"</span>&gt;\n");
      out.write("      &lt;<span class=\"propNS\">context</span><span class=\"propTag\">:exclude-filter</span> <span class=\"propName\">type=</span><span class=\"propValue\">\"annotation\" expression=\"org.springframework.stereotype.Service\"</span> /&gt;\n");
      out.write("  &lt;/<span class=\"propNS\">context</span><span class=\"propTag\">:component-scan</span>&gt;\n");
      out.write("                </pre>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                加载service(spring-mvc-hibernate.xml)\n");
      out.write("                        <pre class=\"code\">\n");
      out.write("\n");
      out.write("  &lt;<span class=\"propNS\">context</span><span class=\"propTag\">:component-scan</span> <span class=\"propName\">base-package=</span><span class=\"propValue\">\"com.buss.*\"</span>&gt;\n");
      out.write("      &lt;<span class=\"propNS\">context</span><span class=\"propTag\">:exclude-filter</span> <span class=\"propName\">type=</span><span class=\"propValue\">\"annotation\" expression=\"org.springframework.stereotype.Controller\"</span> /&gt;\n");
      out.write("  &lt;/<span class=\"propNS\">context</span><span class=\"propTag\">:component-scan</span>&gt;\n");
      out.write("                        </pre>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                扫描hibernate实体(spring-mvc-hibernate.xml)\n");
      out.write("                <pre class=\"code\">\n");
      out.write("\n");
      out.write("  如果生成代码时，代码分层风格选择了“代码分层”，则配置文件如下：\n");
      out.write("  &lt;<span class=\"propTag\">property</span> <span class=\"propName\">name=</span><span class=\"propValue\">\"packagesToScan\"</span>&gt;\n");
      out.write("      &lt;<span class=\"propTag\">list</span>&gt;\n");
      out.write("          ....\n");
      out.write("          &lt;!-- 扫描 代码分层 实体 --&gt;\n");
      out.write("          &lt;<span class=\"propTag\">value</span>&gt;com.buss.entity.*&lt;/<span class=\"propTag\">value</span>&gt;\n");
      out.write("          &lt;!-- 扫描 业务分层 实体 --&gt;\n");
      out.write("          &lt;<span class=\"propTag\">value</span>&gt;com.buss.*.entity&lt;/<span class=\"propTag\">value</span>&gt;\n");
      out.write("      &lt;/<span class=\"propTag\">list</span>&gt;\n");
      out.write("  &lt;/<span class=\"propTag\">property</span>>\n");
      out.write("                </pre>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <h5>代码生成后，编辑菜单地址</h5>\n");
      out.write("    <ol>\n");
      out.write("        <li>系统管理-->菜单管理-->录入菜单</li>\n");
      out.write("        <li>填写地址：<span class=\"propValue\">guomingTestController.do?guomingTest</span></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
