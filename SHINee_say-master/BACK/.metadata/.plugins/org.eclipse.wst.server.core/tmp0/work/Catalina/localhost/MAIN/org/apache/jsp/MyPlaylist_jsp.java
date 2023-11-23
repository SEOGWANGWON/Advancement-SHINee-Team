/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2023-11-19 17:42:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import shinee.vo.Playlist_info_VO;
import shinee.dao.MyPlayList_DAO;
import shinee.dao.SearchDAO;
import shinee.vo.Music_info_VO;
import shinee.vo.Playlist_info_VO;

public final class MyPlaylist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("shinee.dao.SearchDAO");
    _jspx_imports_classes.add("shinee.vo.Music_info_VO");
    _jspx_imports_classes.add("shinee.vo.Playlist_info_VO");
    _jspx_imports_classes.add("shinee.dao.MyPlayList_DAO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
request.setCharacterEncoding("UTF-8");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>my Playlist</title>\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/all.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("		");

			//user_id 값이 존재하지 않을 경우 로그인 페이지로 돌아갑니다.
			if(session.getAttribute("user_id") == null){
				
      out.write("\r\n");
      out.write("					<script>\r\n");
      out.write("						alert(\"로그인이 필요한 서비스입니다.\");\r\n");
      out.write("						location.href=\"login.jsp\";\r\n");
      out.write("					</script>\r\n");
      out.write("				");

			} else {
				//user_id값이 존재한다면
		
      out.write("\r\n");
      out.write("			<div class=\"container\" style=\"margin-top:30px;\">\r\n");
      out.write("	            <aside>\r\n");
      out.write("	                <button id=\"gotoMyPageButton\" style=\"margin-top: 250px;\">\r\n");
      out.write("	                    <img src=\"./img/mypage.png\" style=\"width:85px; padding:0;\" alt=\"myPage Icon\">\r\n");
      out.write("	                    <p><strong>mypage</strong></p>\r\n");
      out.write("	                </button>\r\n");
      out.write("	                <button id=\"gotoMyPlaylistButton\" style=\"margin-top: 50px;\">\r\n");
      out.write("	                    <img src=\"./img/lookaround.png\" style=\"width:85px; padding:0;\" alt=\"Search Icon\">\r\n");
      out.write("	                    <p><strong>My<br>PlayList</strong></p>\r\n");
      out.write("	                </button>\r\n");
      out.write("	                <button id=\"gotoSearchButton\" style=\"margin-top: 50px;\">\r\n");
      out.write("	                    <img src=\"./img/pixel_search.png\" style=\"width:85px; padding:0;\" alt=\"lookaround Icon\">\r\n");
      out.write("	                    <p><strong>Search</strong></p>\r\n");
      out.write("	                </button>\r\n");
      out.write("	            </aside>\r\n");
      out.write("	            <section>\r\n");
      out.write("	                <div class=\"bluetop\" style=\"margin-top:20px; width:1200px;\">\r\n");
      out.write("	                    <p style=\"margin-top:5px;\" ><img src=\"./img/Save.png\" style=\"height: 28px; float: left; margin-top: -8px; \"><strong>My_PlayList</strong></p>\r\n");
      out.write("	                </div>\r\n");
      out.write("	                <div style=\"width:1200px; height:30px; background-color: gray;\">\r\n");
      out.write("	                	<button id=\"new\"><a href=\"Create_Playlist.jsp\">NEW</a></button>\r\n");
      out.write("					</div>\r\n");
      out.write("	                <article id=\"articleP\">\r\n");
      out.write("	                	\r\n");
      out.write("	                	<div style=\"text-align: center; margin-top: 0%;\">\r\n");
      out.write("	                	</div>\r\n");
      out.write("	         \r\n");
      out.write("		                <table>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th></th>\r\n");
      out.write("								<th></th>\r\n");
      out.write("								<th></th>\r\n");
      out.write("								<th></th>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</table>\r\n");
      out.write("					");

						MyPlayList_DAO playlistDAO = new MyPlayList_DAO();
						String user_id = (String)session.getAttribute("user_id");
						List<Playlist_info_VO> playlists = playlistDAO.getAllPlaylists(user_id);
								
						for(Playlist_info_VO p : playlists){
					
      out.write("\r\n");
      out.write("							<form action=\"DeleteServlet\" method=\"post\">\r\n");
      out.write("							<tr>\r\n");
      out.write("							<div class=\"window\" style=\"width: 600px; height:200px; float: left; margin-left: 20%; margin-bottom: 5px; margin-top:10px;\">\r\n");
      out.write("							<div class=\"title-bar\">\r\n");
      out.write("							<div class=\"title-bar-text\" style=\"margin-left:5px;\">\r\n");
      out.write("							 MY_PlayList_♡ \r\n");
      out.write("							<td>");
      out.print(p.getPlaylist_id());
      out.write("</td>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"title-bar-controls\">\r\n");
      out.write("							<input type=\"hidden\" name=\"playlistId\" value=\"");
      out.print( p.getPlaylist_id() );
      out.write("\">\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-default pull right\">X</button>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("							</div></div>\r\n");
      out.write("				\r\n");
      out.write("							<td></td>\r\n");
      out.write("			\r\n");
      out.write("							<td><a href=\"playListDetail.jsp?playlistId=");
      out.print(p.getPlaylist_id());
      out.write("\"><img src=\"");
      out.print(p.getImage());
      out.write("\"style=\"width : 150px; height: 150px; margin-left:10px; margin-top:10px; border: 3px inset lightgray;\"></a></td>\r\n");
      out.write("							\r\n");
      out.write("							<td>\r\n");
      out.write("							<div style=\"float:right; width: 300px; text-align: left; margin-right:100px; \">\r\n");
      out.write("							<div style=\"background-color:white; margin-top:20px; padding-right: 20px; width:300px; height: 22px; border: 2px outset lightgray;\">\r\n");
      out.write("							<p style=\"margin-left: 30px; margin-top:1px;\">");
      out.print(p.getPlaylist_name());
      out.write("</p></div></div>\r\n");
      out.write("							</td>\r\n");
      out.write("							\r\n");
      out.write("							</tr><br>\r\n");
      out.write("							</form>\r\n");
      out.write("							</div><!-- container -->\r\n");
      out.write("							\r\n");
      out.write("					");

						} //for(Playlist_info_VO p : playlists)
					
      out.write("\r\n");
      out.write("	                	</article>\r\n");
      out.write("	                </section>\r\n");
      out.write("	                ");

						}//else
	                
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("            const List = document.getElementById(\"List\");\r\n");
      out.write("            const savedPosts = JSON.parse(localStorage.getItem(\"ListPosts\")) || [];\r\n");
      out.write("\r\n");
      out.write("            savedPosts.forEach(post => {\r\n");
      out.write("                const listItem = document.createElement(\"li\");\r\n");
      out.write("                listItem.textContent = post.content;\r\n");
      out.write("                List.appendChild(listItem);\r\n");
      out.write("  \r\n");
      out.write("            });\r\n");
      out.write("          \r\n");
      out.write("            //===================== 창 이동 함수 =====================\r\n");
      out.write("            	\r\n");
      out.write("			//검색버튼 누르면 검색 창으로 이동 (기본 음악검색)\r\n");
      out.write("			document.getElementById(\"gotoSearchButton\").addEventListener(\"click\",()=>{\r\n");
      out.write("				window.location.href = \"music_search.jsp\";\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			//마이페이지 버튼 누르면 이동\r\n");
      out.write("			document.getElementById(\"gotoMyPageButton\").addEventListener(\"click\",()=>{\r\n");
      out.write("				window.location.href = \"MyPage.jsp\";\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			//마이플레이리스트 버튼\r\n");
      out.write("			document.getElementById(\"gotoMyPlaylistButton\").addEventListener(\"click\",()=>{\r\n");
      out.write("				window.location.href = \"MyPlaylist.jsp\";\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			//메뉴바(?) new버튼 누르면 플레이리스트 생성창으로 이동\r\n");
      out.write("			document.getElementById(\"new\").addEventListener(\"click\",function(){\r\n");
      out.write("                window.location.href=\"Create_Playlist.jsp\";\r\n");
      out.write("            });\r\n");
      out.write("			\r\n");
      out.write("		</script>\r\n");
      out.write("       \r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
