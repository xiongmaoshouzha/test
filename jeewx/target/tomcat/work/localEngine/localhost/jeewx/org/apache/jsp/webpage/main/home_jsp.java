package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <link type=\"text/css\" rel=\"stylesheet\" href=\"./plug-in/weixin/css/style.css\">\n");
      out.write("     <div class=\"funcList\" id=\"func\">\n");
      out.write("            <ul class=\"list\">\n");
      out.write("            \t<li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/weixin.jpg\" width=\"95\" height=\"98\">\n");
      out.write("                    <h3>微信公众号</h3>\n");
      out.write("                    <p>微信公众号管家，一站式管理，一步到位!<font color=\"red\">[开源]</font></p>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/wxqy.jpg\" width=\"95\" height=\"98\">\n");
      out.write("                    <h3>微信企业号</h3>\n");
      out.write("                    <p>微信企业号管家，一站式管理，一步到位!<font color=\"red\">[开源]</font></p>\n");
      out.write("                </li>\n");
      out.write("                 <li>\n");
      out.write("                   \t<img src=\"./plug-in/weixin/img/alipay.jpg\" width=\"95\" height=\"98\">\n");
      out.write("                   \t<h3>支付服务窗</h3>\n");
      out.write("                   \t<p>支付窗管家，一站式管理，一步到位!<font color=\"red\">[开源]</font></p>\n");
      out.write("               \t</li>\n");
      out.write("               \t<li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/qq.jpg\" width=\"95\" height=\"98\">\n");
      out.write("                    <h3>QQ公众号</h3>\n");
      out.write("                    <p>QQ公众号管家，一站式管理，一步到位!<font color=\"red\">[未开源]</font></p>\n");
      out.write("                </li>\n");
      out.write("                \t<li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/weibo.jpg\" width=\"110\" height=\"98\">\n");
      out.write("                    <h3>微博</h3>\n");
      out.write("                    <p>微博管家，一站式管理，一步到位!<font color=\"red\">[未开源]</font></p>\n");
      out.write("                </li>\n");
      out.write("               \t\n");
      out.write("                 <a href=\"menuManagerController.do?list&clickFunctionId=4028d881436d514601436d5884be019d\" target=\"_blank\">\n");
      out.write("                     <li><img src=\"./plug-in/weixin/img/func06.jpg\">\n");
      out.write("\t                    <h3>自定义菜单</h3>\n");
      out.write("\t                    <p>通过形象的菜单界面引导顾客进行微信互动操作。\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("                \t</li>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"newsTemplateController.do?list\" target=\"_blank\">\n");
      out.write("\t                <li>\n");
      out.write("\t                    <img src=\"./plug-in/weixin/img/func05.jpg\">\n");
      out.write("\t                    <h3>图文素材</h3>\n");
      out.write("\t                    <p>定期推送，图文并<br>茂，免费发布</p>\n");
      out.write("\t                </li>\n");
      out.write("                </a>\n");
      out.write("                 \n");
      out.write("                    <a href=\"zpController.do?goZhuanpan&accountid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.WEIXIN_ACCOUNT.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&openId=oGCDRjvr9L1NoqxbyXLReCVYVyV0\" target=\"_blank\">\n");
      out.write("                    <li><img  src=\"./plug-in/weixin/img/func08.jpg\">\n");
      out.write("                    <h3>大转盘</h3>\n");
      out.write("                    <p>快乐大转盘<br>幸运落谁家</p>\n");
      out.write("                    </li>\n");
      out.write("                    </a>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \t<a href=\"zpController.do?goGglNew&accountid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.WEIXIN_ACCOUNT.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&openId=oGCDRjvr9L1NoqxbyXLReCVYVyV0\" target=\"_blank\">\n");
      out.write("                    <li><img src=\"./plug-in/weixin/img/func10.jpg\">\n");
      out.write("                    <h3>刮刮乐</h3>\n");
      out.write("                    <p>趣味游戏<br>吸引用户参与 沉淀用户</p>\n");
      out.write("                    </li>\n");
      out.write("                    </a>\n");
      out.write("                \n");
      out.write("                <a href=\"cmsController.do?goPage&page=index\" target=\"_blank\">\n");
      out.write("\t                <li>\n");
      out.write("\t                    <img src=\"./plug-in/weixin/img/func01.jpg\" width=\"104\" height=\"107\">\n");
      out.write("\t                    <h3>微网站 </h3>\n");
      out.write("\t                    <p>5分钟轻松建站<br>打造酷炫微官网</p>\n");
      out.write("\t                </li>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"cmsController.do?goPage&page=photoAlbum\" target=\"_blank\">\n");
      out.write("                \t<li>\n");
      out.write("                    \t<img src=\"./plug-in/weixin/img/func04.jpg\" width=\"106\" height=\"107\">\n");
      out.write("                    \t<h3>微相册</h3>\n");
      out.write("                    \t<p>各行各业<br> 照片展现轻松搞定</p>\n");
      out.write("                \t</li>\n");
      out.write("                </a>\n");
      out.write("               \n");
      out.write("               \t<li>\n");
      out.write("                   \t<img src=\"./plug-in/weixin/img/func04.jpg\" width=\"106\" height=\"107\">\n");
      out.write("                   \t<h3>微翻译</h3>\n");
      out.write("                   \t<p>微翻译</p>\n");
      out.write("               \t</li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/func11.jpg\">\n");
      out.write("                    <h3>微投票</h3>\n");
      out.write("                    <p>用户通过微信问答<font color=\"red\">[商业]</font></p>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/func14.jpg\">\n");
      out.write("                    <h3>微信墙 </h3>\n");
      out.write("                    <p>活跃现场气氛，让粉丝涨起来<font color=\"red\">[商业]</font></p>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/func15.jpg\">\n");
      out.write("                    <h3>微社区</h3>\n");
      out.write("                    <p>移动社区交流<font color=\"red\">[商业]</font></p>\n");
      out.write("                </li>\n");
      out.write("                 <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/func02.jpg\" width=\"105\" height=\"107\">\n");
      out.write("                    <h3>微会员</h3>\n");
      out.write("                    <p>方便携带 永不挂失<br>消费积分<font color=\"red\">[商业]</font></p>\n");
      out.write("                </li>\n");
      out.write("              \n");
      out.write("                <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/func03.jpg\" width=\"107\" height=\"107\">\n");
      out.write("                    <h3>微商城</h3>\n");
      out.write("                    <p>小微信也有大商城<br>，移动营销<font color=\"red\">[商业]</font></p>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/func09.jpg\">\n");
      out.write("                    <h3>支付组件</h3>\n");
      out.write("                    <p>微信、支付宝、财付通等支付方式<font color=\"red\">[商业]</font></p>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                   \t<img src=\"./plug-in/weixin/img/func04.jpg\" width=\"106\" height=\"107\">\n");
      out.write("                   \t<h3>微天气</h3>\n");
      out.write("                   \t<p>通过城市：定位天气预报</p>\n");
      out.write("               \t</li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/func13.jpg\">\n");
      out.write("                    <h3>微信插件机制</h3>\n");
      out.write("                    <p>集成插件机制，可以集成P3开发的微信插件 </p>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"./plug-in/weixin/img/func12.jpg\">\n");
      out.write("                    <h3>author2.0机制</h3>\n");
      out.write("                    <p>通过素材链接配置，生成author2.0链接</p>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("                  <a href=\"autoResponseController.do?list&clickFunctionId=402881e8460d7e5301460d81c7a60001\" target=\"_blank\">\n");
      out.write("                   <li><img src=\"./plug-in/weixin/img/func07.jpg\">\n");
      out.write("                   <h3>智能客服</h3>\n");
      out.write("                   <p>关键词回复轻松设<br>置</p>\n");
      out.write("                   </li>\n");
      out.write("                   </a>\n");
      out.write("            </ul>\n");
      out.write("</div>\n");
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
