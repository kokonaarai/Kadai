package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class QS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

    request.setCharacterEncoding("UTF-8");
    int t = Integer.parseInt(request.getParameter("total"));
    int c = Integer.parseInt(request.getParameter("count"));
    int ty = Integer.parseInt(request.getParameter("type"));
    out.print("総額" + request.getParameter("total") + "円<br>");
    if(ty ==1){
    out.print("雑貨<br>");
    }
    else if(ty ==2){
    out.print("生鮮食品<br>");
    }
    else if(ty ==3){
    out.print("その他<br>");
    }
    out.print("個数" + request.getParameter("count") + "個(１個あたり" + t / c + "円）<br><br>");
    if (t > 4999) {
        double p = t * 0.05;
        out.print("5000円以上" + p + "ポイント");
    } else if (t > 2999) {
        double p = t * 0.04;
        out.print("3000円以上" + p + "ポイント");
    }

      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h1> 1.</h1>\n");
      out.write("        typeが１だったら、「雑貨」<br>\n");
      out.write("        typeが２だったら、「生鮮食品」<br>\n");
      out.write("        typeが３だったら、「その他」<br>\n");
      out.write("        \n");
      out.write("        <h1> 2.</h1>\n");
      out.write("        ");
 int i = 1500/10;
        out.print("一個あたりの値段は"+i+"です");

      out.write("\n");
      out.write("\n");
      out.write("<h1>3.</h1>\n");

     double a= 3000*0.04;     
           out.print("3000円以上で"+a+"ポイント"+"<br>");
            double j = 5000*0.05;
            out.print("5000円以上"+j+"ポイント");
            
           
            
            
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
