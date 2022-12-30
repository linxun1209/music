//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//public class t {import java.io.IOException;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//    public class ValidLoginFilter implements Filter {
//        private FilterConfig filterconfig = null;
//        public void init(FilterConfig config) throws ServletException {
//            this.filterconfig = config;
//        }
//        public void destroy() {
//            this.filterconfig = null;
//        }
//        public void doFilter(ServletRequest request, ServletResponse response,
//                             FilterChain chain) throws IOException, ServletException {
//            HttpServletRequest hreq = (HttpServletRequest) request;
//            String currentURI = hreq.getRequestURL().toString();
//
////判断是否是要过滤的资源
//            if (currentURI != null) {
//                if(currentURI.indexOf("user.do") != -1||currentURI.indexOf("coupons.do")!= -1 )
//                {
//                    chain.doFilter(request, response);
//                    return ;
//                }
//                else if(currentURI.indexOf("testuser.do") != -1)
//                {
//                    chain.doFilter(request, response);
//                    return ;
//                }
//                else if(currentURI.indexOf("createorder.do") != -1)
//                {
//                    chain.doFilter(request, response);
//                    return ;
//                }//判断请求中是否包含以下内容
//                else if (currentURI.indexOf("loginagain.jsp") <= 0) {
//                    if (((currentURI.indexOf("index.jsp") <= 0)
//                            && (currentURI.indexOf("login.jsp") <= 0)
//                            && (currentURI.indexOf("logout.jsp") <= 0)
//                            && (currentURI.indexOf("loginagain.jsp") <= 0)
//                            && (currentURI.indexOf(".jsp") > 0))
//                            || ((currentURI.indexOf("login.do") <= 0)
//                            && (currentURI.indexOf("userlogout.do") <= 0) && (currentURI
//                            .indexOf(".do") > 0))) {
//// 判断用户是否登录
//                        HttpSession session = hreq.getSession(false);
//                        if ((session != null)&& (session.getAttribute("username") != null)) {
//
//                        } //session 有效结束
//                        else { //session 无效 重新登录\
//                            filterconfig.getServletContext().getRequestDispatcher("/my/loginagain.jsp").forward(request, response);
//                            return;
//                        }
//                    }
//                }
//            } else {
//
//                filterconfig.getServletContext().getRequestDispatcher("/my/loginagain.jsp").forward(request, response);
//                return;
//            }
//            chain.doFilter(request, response);
//        }
//    }
//}
