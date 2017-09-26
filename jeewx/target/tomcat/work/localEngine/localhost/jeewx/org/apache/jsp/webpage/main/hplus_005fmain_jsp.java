package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hplus_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substring", org.apache.taglibs.standard.functions.Functions.class, "substring", new Class[] {java.lang.String.class, int.class, int.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/context/layui.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("\n");
      out.write("    <title>捷微  开源微信管家系统</title>\n");
      out.write("\n");
      out.write("    <meta name=\"keywords\" content=\"捷微  开源微信管家系统\">\n");
      out.write("    <meta name=\"description\" content=\"捷微  开源微信管家系统\">\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/font-awesome.min.css?v=4.4.0\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome.min.css\" />\n");
      out.write("    <!--[if IE 7]>\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome-ie7.min.css\" />\n");
      out.write("    <![endif]-->\n");
      out.write("    <!-- Sweet Alert -->\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/plugins/sweetalert/sweetalert.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/style.css?v=4.1.0\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fixed-sidebar full-height-layout gray-bg\" style=\"overflow:hidden\">\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("    <!--左侧导航开始-->\n");
      out.write("    <nav class=\"navbar-default navbar-static-side\" role=\"navigation\" style=\"z-index: 1991;\">\n");
      out.write("        <div class=\"nav-close\"><i class=\"fa fa-times-circle\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-collapse\">\n");
      out.write("            <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                <li class=\"nav-header\" style=\"padding: 14px 25px;\">\n");
      out.write("                    <div class=\"dropdown profile-element\">\n");
      out.write("                        <span><img alt=\"image\" width=\"110%\" src=\"plug-in/weixin/logo/logo_jw.png\" /></span>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                         \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"logo-element\">捷微\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_t_005fmenu_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <!--左侧导航结束-->\n");
      out.write("    <!--右侧部分开始-->\n");
      out.write("    <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\n");
      out.write("        <div class=\"row border-bottom\">\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("                <div class=\"navbar-header\" style=\"width: 40%;height: 60px;\"><a class=\"navbar-minimalize minimalize-styl-2 btn btn-primary \" href=\"#\"><i class=\"fa fa-bars\"></i> </a>\n");
      out.write("                    <form role=\"search\" class=\"navbar-form-custom\" method=\"post\" action=\"search_results.html\">\n");
      out.write("                        <div class=\"form-group\" >\n");
      out.write("                            <input type=\"text\" placeholder=\"捷微  开源微信管家系统\" class=\"form-control\" name=\"top-search\" id=\"top-search\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                <!-- update-start--Author: chenj Date:20160812 for: TASK #1269 【ace h+】风格无用的右上角功能隐藏，暂时注释掉 -->\n");
      out.write("                   ");
      out.write("\n");
      out.write("                    <!-- update-end--Author: chenj Date:20160812 for: TASK #1269 【ace h+】风格无用的右上角功能隐藏，暂时注释掉 -->\n");
      out.write("                    \n");
      out.write("                    <!-- //update-start--Author: chenj Date:20160726 for: TASK #1207 [改造]h+风格下，去掉logo下面的内容，迁移位置到右上角，主题位置 -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                    \t<a class=\"dropdown-toggle count-info\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                    \t<i class=\"fa fa-user\" style=\"color:green\"></i> \n");
      out.write("                                <span ><strong class=\"font-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</strong></span>\n");
      out.write("                                <span title=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write('>');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t                  ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t                  <b class=\"caret\"></b></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                            <li><a href=\"javascript:openwindow('个人信息','userController.do?userinfo')\">个人信息</a></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:add('修改密码','userController.do?changepassword','',550,200)\">\n");
      out.write("                                    \t修改密码\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"javascript:add('风格切换','userController.do?changestyle','',550,250)\">首页风格</a></li>\n");
      out.write("                            <li><a href=\"javascript:window.open('http://yun.jeecg.org')\">云插件中心</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- //update-end--Author: chenj Date:20160726 for: TASK #1207 [改造]h+风格下，去掉logo下面的内容，迁移位置到右上角，主题位置 -->\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                   <!--  <li class=\"dropdown hidden-xs\">\n");
      out.write("                        <a class=\"right-sidebar-toggle\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-tasks\"></i> 主题\n");
      out.write("                        </a>\n");
      out.write("                    </li> -->\n");
      out.write("                    \n");
      out.write("                      <li class=\"dropdown hidden-xs\">\n");
      out.write("                        <a class=\"\" aria-expanded=\"false\" href=\"javascript:logout()\">\n");
      out.write("                            <i class=\"fa fa fa-sign-out\"></i> 退出\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                   <!-- //update-begin--Author: chenj Date:20160729 for: TASK #1207 [改造]h+风格下，修改 退出 按钮的位置 -->\n");
      out.write("                      <!--  <li class=\"dropdown\">\n");
      out.write("                     <a href=\"javascript:logout()\" class=\"roll-nav roll-right J_tabExit\"><i class=\"fa fa fa-sign-out\"></i> 退出</a>\n");
      out.write("                     </li>  --> \n");
      out.write("                     <!-- //update-end--Author: chenj Date:20160729 for: TASK #1207 [改造]h+风格下，修改 退出 按钮的位置 -->\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row content-tabs\">\n");
      out.write("            <button class=\"roll-nav roll-left J_tabLeft\"><i class=\"fa fa-backward\"></i>\n");
      out.write("            </button>\n");
      out.write("            <nav class=\"page-tabs J_menuTabs\">\n");
      out.write("                <div class=\"page-tabs-content\">\n");
      out.write("                    <a href=\"javascript:;\" class=\"active J_menuTab\" data-id=\"loginController.do?home\">首页</a>\n");
      out.write("                </div>\n");
      out.write("            <button class=\"roll-nav roll-right J_tabRight\"><i class=\"fa fa-forward\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"btn-group roll-nav roll-right\">\n");
      out.write("                <button class=\"dropdown J_tabClose\" data-toggle=\"dropdown\">关闭操作<span class=\"caret\"></span>\n");
      out.write("\n");
      out.write("                </button>\n");
      out.write("                <ul role=\"menu\" class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                    <li class=\"J_tabShowActive\"><a>定位当前选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li class=\"J_tabCloseAll\"><a>关闭全部选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"J_tabCloseOther\"><a>关闭其他选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- \n");
      out.write("            <a href=\"javascript:logout()\" class=\"roll-nav roll-right J_tabExit\"><i class=\"fa fa fa-sign-out\"></i> 退出</a>\n");
      out.write("             -->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row J_mainContent\" id=\"content-main\">\n");
      out.write("            <iframe class=\"J_iframe\" name=\"iframe0\" width=\"100%\" height=\"100%\" src=\"loginController.do?home\" frameborder=\"0\" data-id=\"loginController.do?home\" seamless></iframe>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"pull-right\">&copy; 版权所有 <span class=\"tip\"><a href=\"http://www.jeewx.com\" target=\"_blank\" title=\"捷微JeeWx：免费开源微信公众账号开发平台\">捷微JeeWx</a> (推荐谷歌浏览器，获得更快响应速度) 技术支持:<a href=\"http://www.jeecg.org\" target=\"_blank\" title=\"JEECG开源社区\">JEECG 开源社区</a> </span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--右侧部分结束-->\n");
      out.write("    <!--右侧边栏开始-->\n");
      out.write("    <div id=\"right-sidebar\">\n");
      out.write("        <div class=\"sidebar-container\">\n");
      out.write("\n");
      out.write("            <ul class=\"nav nav-tabs navs-3\">\n");
      out.write("\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a data-toggle=\"tab\" href=\"#tab-1\">\n");
      out.write("                        <i class=\"fa fa-gear\"></i> 主题\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <!-- update-start--Author: chenj Date:20160812 for: TASK #1269 【ace h+】风格无用的右上角功能隐藏，暂时注释掉 -->\n");
      out.write("               <!--  <li class=\"\"><a data-toggle=\"tab\" href=\"#tab-2\">\n");
      out.write("                    通知\n");
      out.write("                </a>\n");
      out.write("                </li>\n");
      out.write("                <li><a data-toggle=\"tab\" href=\"#tab-3\">\n");
      out.write("                    项目进度\n");
      out.write("                </a>\n");
      out.write("                </li> -->\n");
      out.write("                <!-- update-end--Author: chenj Date:20160812 for: TASK #1269 【ace h+】风格无用的右上角功能隐藏，暂时注释掉 -->\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div class=\"tab-content\">\n");
      out.write("                <div id=\"tab-1\" class=\"tab-pane active\">\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-comments-o\"></i> 主题设置</h3>\n");
      out.write("                        <small><i class=\"fa fa-tim\"></i> 你可以从这里选择和预览主题的布局和样式，这些设置会被保存在本地，下次打开的时候会直接应用这些设置。</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"skin-setttings\">\n");
      out.write("                        <div class=\"title\">主题设置</div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                            <span>收起左侧菜单</span>\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"collapsemenu\" class=\"onoffswitch-checkbox\" id=\"collapsemenu\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"collapsemenu\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                            <span>固定顶部</span>\n");
      out.write("\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"fixednavbar\" class=\"onoffswitch-checkbox\" id=\"fixednavbar\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"fixednavbar\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                                <span>\n");
      out.write("                        固定宽度\n");
      out.write("                    </span>\n");
      out.write("\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"boxedlayout\" class=\"onoffswitch-checkbox\" id=\"boxedlayout\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"boxedlayout\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"title\">皮肤选择</div>\n");
      out.write("                        <div class=\"setings-item default-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                         <a href=\"#\" class=\"s-skin-0\">\n");
      out.write("                             默认皮肤\n");
      out.write("                         </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item blue-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                        <a href=\"#\" class=\"s-skin-1\">\n");
      out.write("                            蓝色主题\n");
      out.write("                        </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item yellow-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                        <a href=\"#\" class=\"s-skin-3\">\n");
      out.write("                            黄色/紫色主题\n");
      out.write("                        </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"tab-2\" class=\"tab-pane\">\n");
      out.write("\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-comments-o\"></i> 最新通知</h3>\n");
      out.write("                        <small><i class=\"fa fa-tim\"></i> 您当前有10条未读信息</small>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <div class=\"sidebar-message\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"pull-left text-center\">\n");
      out.write("                                    <img alt=\"image\" class=\"img-circle message-avatar\" src=\"plug-in-ui/hplus/img/a1.jpg\">\n");
      out.write("\n");
      out.write("                                    <div class=\"m-t-xs\">\n");
      out.write("                                        <i class=\"fa fa-star text-warning\"></i>\n");
      out.write("                                        <i class=\"fa fa-star text-warning\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("\n");
      out.write("                                    据天津日报报道：瑞海公司董事长于学伟，副董事长董社轩等10人在13日上午已被控制。\n");
      out.write("                                    <br>\n");
      out.write("                                    <small class=\"text-muted\">今天 4:21</small>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sidebar-message\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"pull-left text-center\">\n");
      out.write("                                    <img alt=\"image\" class=\"img-circle message-avatar\" src=\"plug-in-ui/hplus/img/a2.jpg\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    HCY48之音乐大魔王会员专属皮肤已上线，快来一键换装拥有他，宣告你对华晨宇的爱吧！\n");
      out.write("                                    <br>\n");
      out.write("                                    <small class=\"text-muted\">昨天 2:45</small>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sidebar-message\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"pull-left text-center\">\n");
      out.write("                                    <img alt=\"image\" class=\"img-circle message-avatar\" src=\"plug-in-ui/hplus/img/a3.jpg\">\n");
      out.write("\n");
      out.write("                                    <div class=\"m-t-xs\">\n");
      out.write("                                        <i class=\"fa fa-star text-warning\"></i>\n");
      out.write("                                        <i class=\"fa fa-star text-warning\"></i>\n");
      out.write("                                        <i class=\"fa fa-star text-warning\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    写的好！与您分享\n");
      out.write("                                    <br>\n");
      out.write("                                    <small class=\"text-muted\">昨天 1:10</small>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sidebar-message\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"pull-left text-center\">\n");
      out.write("                                    <img alt=\"image\" class=\"img-circle message-avatar\" src=\"plug-in-ui/hplus/img/a4.jpg\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    国外极限小子的炼成！这还是亲生的吗！！\n");
      out.write("                                    <br>\n");
      out.write("                                    <small class=\"text-muted\">昨天 8:37</small>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sidebar-message\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"pull-left text-center\">\n");
      out.write("                                    <img alt=\"image\" class=\"img-circle message-avatar\" src=\"plug-in-ui/hplus/img/a8.jpg\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("\n");
      out.write("                                    一只流浪狗被收留后，为了减轻主人的负担，坚持自己觅食，甚至......有些东西，可能她比我们更懂。\n");
      out.write("                                    <br>\n");
      out.write("                                    <small class=\"text-muted\">今天 4:21</small>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sidebar-message\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"pull-left text-center\">\n");
      out.write("                                    <img alt=\"image\" class=\"img-circle message-avatar\" src=\"plug-in-ui/hplus/img/a7.jpg\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    这哥们的新视频又来了，创意杠杠滴，帅炸了！\n");
      out.write("                                    <br>\n");
      out.write("                                    <small class=\"text-muted\">昨天 2:45</small>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sidebar-message\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"pull-left text-center\">\n");
      out.write("                                    <img alt=\"image\" class=\"img-circle message-avatar\" src=\"plug-in-ui/hplus/img/a3.jpg\">\n");
      out.write("\n");
      out.write("                                    <div class=\"m-t-xs\">\n");
      out.write("                                        <i class=\"fa fa-star text-warning\"></i>\n");
      out.write("                                        <i class=\"fa fa-star text-warning\"></i>\n");
      out.write("                                        <i class=\"fa fa-star text-warning\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    最近在补追此剧，特别喜欢这段表白。\n");
      out.write("                                    <br>\n");
      out.write("                                    <small class=\"text-muted\">昨天 1:10</small>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sidebar-message\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"pull-left text-center\">\n");
      out.write("                                    <img alt=\"image\" class=\"img-circle message-avatar\" src=\"plug-in-ui/hplus/img/a4.jpg\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    我发起了一个投票 【你认为下午大盘会翻红吗？】\n");
      out.write("                                    <br>\n");
      out.write("                                    <small class=\"text-muted\">星期一 8:37</small>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"tab-3\" class=\"tab-pane\">\n");
      out.write("\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-cube\"></i> 最新任务</h3>\n");
      out.write("                        <small><i class=\"fa fa-tim\"></i> 您当前有14个任务，10个已完成</small>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <ul class=\"sidebar-list\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"small pull-right m-t-xs\">9小时以后</div>\n");
      out.write("                                <h4>市场调研</h4> 按要求接收教材；\n");
      out.write("\n");
      out.write("                                <div class=\"small\">已完成： 22%</div>\n");
      out.write("                                <div class=\"progress progress-mini\">\n");
      out.write("                                    <div style=\"width: 22%;\" class=\"progress-bar progress-bar-warning\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"small text-muted m-t-xs\">项目截止： 4:00 - 2015.10.01</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"small pull-right m-t-xs\">9小时以后</div>\n");
      out.write("                                <h4>可行性报告研究报上级批准 </h4> 编写目的编写本项目进度报告的目的在于更好的控制软件开发的时间,对团队成员的 开发进度作出一个合理的比对\n");
      out.write("\n");
      out.write("                                <div class=\"small\">已完成： 48%</div>\n");
      out.write("                                <div class=\"progress progress-mini\">\n");
      out.write("                                    <div style=\"width: 48%;\" class=\"progress-bar\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"small pull-right m-t-xs\">9小时以后</div>\n");
      out.write("                                <h4>立项阶段</h4> 东风商用车公司 采购综合综合查询分析系统项目进度阶段性报告武汉斯迪克科技有限公司\n");
      out.write("\n");
      out.write("                                <div class=\"small\">已完成： 14%</div>\n");
      out.write("                                <div class=\"progress progress-mini\">\n");
      out.write("                                    <div style=\"width: 14%;\" class=\"progress-bar progress-bar-info\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span class=\"label label-primary pull-right\">NEW</span>\n");
      out.write("                                <h4>设计阶段</h4>\n");
      out.write("                                <!--<div class=\"small pull-right m-t-xs\">9小时以后</div>-->\n");
      out.write("                                项目进度报告(Project Progress Report)\n");
      out.write("                                <div class=\"small\">已完成： 22%</div>\n");
      out.write("                                <div class=\"small text-muted m-t-xs\">项目截止： 4:00 - 2015.10.01</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"small pull-right m-t-xs\">9小时以后</div>\n");
      out.write("                                <h4>拆迁阶段</h4> 科研项目研究进展报告 项目编号: 项目名称: 项目负责人:\n");
      out.write("\n");
      out.write("                                <div class=\"small\">已完成： 22%</div>\n");
      out.write("                                <div class=\"progress progress-mini\">\n");
      out.write("                                    <div style=\"width: 22%;\" class=\"progress-bar progress-bar-warning\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"small text-muted m-t-xs\">项目截止： 4:00 - 2015.10.01</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"small pull-right m-t-xs\">9小时以后</div>\n");
      out.write("                                <h4>建设阶段 </h4> 编写目的编写本项目进度报告的目的在于更好的控制软件开发的时间,对团队成员的 开发进度作出一个合理的比对\n");
      out.write("\n");
      out.write("                                <div class=\"small\">已完成： 48%</div>\n");
      out.write("                                <div class=\"progress progress-mini\">\n");
      out.write("                                    <div style=\"width: 48%;\" class=\"progress-bar\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"small pull-right m-t-xs\">9小时以后</div>\n");
      out.write("                                <h4>获证开盘</h4> 编写目的编写本项目进度报告的目的在于更好的控制软件开发的时间,对团队成员的 开发进度作出一个合理的比对\n");
      out.write("\n");
      out.write("                                <div class=\"small\">已完成： 14%</div>\n");
      out.write("                                <div class=\"progress progress-mini\">\n");
      out.write("                                    <div style=\"width: 14%;\" class=\"progress-bar progress-bar-info\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--右侧边栏结束-->\n");
      out.write("    <!--mini聊天窗口开始-->\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <!--mini聊天窗口结束-->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 全局js -->\n");
      out.write("<script src=\"plug-in-ui/hplus/js/jquery.min.js?v=2.1.4\"></script>\n");
      out.write("<script src=\"plug-in-ui/hplus/js/bootstrap.min.js?v=3.3.6\"></script>\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/layer/layer.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 自定义js -->\n");
      out.write("<script src=\"plug-in-ui/hplus/js/hplus.js?v=4.1.0\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in-ui/hplus/js/contabs.js\"></script>\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!-- 第三方插件 -->\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/pace/pace.min.js\"></script>\n");
      out.write("<!-- Sweet alert -->\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/sweetalert/sweetalert.min.js\"></script>\n");
      out.write("<script src=\"plug-in/jquery-plugs/storage/jquery.storageapi.min.js\"></script>\n");
      out.write("<!-- 弹出TAB -->\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/hplus-tab.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"content/chat/layui/css/layui.css\">\n");
      out.write("<script src=\"content/chat/layui/layui.js\"></script>\n");
      out.write("<script src=\"plug-in/layim/config.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function logout(){\n");
      out.write("        /*bootbox.confirm(\"\", function(result) {\n");
      out.write("            if(result)\n");
      out.write("                location.href=\"loginController.do?logout\";\n");
      out.write("        });*/\n");
      out.write("        /*swal({\n");
      out.write("            title: \"您确定要注销吗？\",\n");
      out.write("            text: \"注销后需要重新登录！\",\n");
      out.write("            type: \"warning\",\n");
      out.write("            showCancelButton: true,\n");
      out.write("            confirmButtonColor: \"#DD6B55\",\n");
      out.write("            confirmButtonText: \"确定\",\n");
      out.write("            cancelButtonText: \"取消\",\n");
      out.write("            closeOnConfirm: false,\n");
      out.write("            closeOnCancel: true\n");
      out.write("        },\n");
      out.write("        function (isConfirm) {\n");
      out.write("            if (isConfirm) {\n");
      out.write("                //swal(\"注销成功！\", \"您已经成功注销。\", \"success\");\n");
      out.write("                location.href=\"loginController.do?logout\";\n");
      out.write("            } else {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        });*/\n");
      out.write("        layer.confirm('您确定要注销吗？', {\n");
      out.write("            btn: ['确定','取消'], //按钮\n");
      out.write("            shade: false //不显示遮罩\n");
      out.write("        }, function(){\n");
      out.write("            location.href=\"loginController.do?logout\";\n");
      out.write("        }, function(){\n");
      out.write("            return;\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    function clearLocalstorage(){\n");
      out.write("        var storage=$.localStorage;\n");
      out.write("        if(!storage)\n");
      out.write("            storage=$.cookieStorage;\n");
      out.write("        storage.removeAll();\n");
      out.write("        //bootbox.alert( \"浏览器缓存清除成功!\");\n");
      out.write("        layer.msg(\"浏览器缓存清除成功!\");\n");
      out.write("    }\n");
      out.write("    function goAllNotice(){\n");
      out.write("        var addurl = \"noticeController.do?noticeList\";\n");
      out.write("        createdetailwindow(\"公告\", addurl, 800, 400);\n");
      out.write("    }\n");
      out.write("    function goAllMessage(){\n");
      out.write("        var addurl = \"tSSmsController.do?getSysInfos\";\n");
      out.write("        createdetailwindow(\"消息\", addurl, 800, 400);\n");
      out.write("    }\n");
      out.write("    function toJeecgYun(){\n");
      out.write("    \twindow.open(\"http://yun.jeecg.org\",\"_blank\");\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_t_005fmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:menu
    org.jeecgframework.tag.core.easyui.MenuTag _jspx_th_t_005fmenu_005f0 = (org.jeecgframework.tag.core.easyui.MenuTag) _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.get(org.jeecgframework.tag.core.easyui.MenuTag.class);
    _jspx_th_t_005fmenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmenu_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(74,16) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmenu_005f0.setStyle("hplus");
    // /webpage/main/hplus_main.jsp(74,16) name = menuFun type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmenu_005f0.setMenuFun((java.util.Map) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menuMap}", java.util.Map.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fmenu_005f0 = _jspx_th_t_005fmenu_005f0.doStartTag();
    if (_jspx_th_t_005fmenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.reuse(_jspx_th_t_005fmenu_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.reuse(_jspx_th_t_005fmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(149,59) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(roleName) gt 6}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:substring(roleName,0,6)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
        out.write("...\n");
        out.write("\t\t\t\t                  ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /webpage/main/hplus_main.jsp(152,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(roleName) le 6}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("\t\t\t\t                  ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(650,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }
}
