<%@ page import="com.example.musicDemo.pojo.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/2/27
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="../css/index2.css">
<%--    <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">--%>
</head>

<body>
<div class="Top">
    <div class="middle">
        <div class="TopOne">网易云音乐</div>
        <span>发现音乐</span>
        <span>我的音乐</span>
        <span>关注</span>
        <span>商城</span>
        <span>音乐人</span>
        <span>下载客户端</span>
        <form action="/music1_war_exploded/MusicListServlet" method="get">
            <input autocomplete="on" type="text" placeholder="音乐/视频/电台/用户">
        </form>
        <div class="TopTwo">创作者中心</div>
        </tr>
<%--        <%--%>
<%--            int i=1;--%>
<%--            List<User> userList=(List<User>)request.getAttribute("userList");--%>
<%--            for(User u:userList){--%>
<%--        %>--%>
<%--        <span>id=<%=u.getUsername()%></span>--%>
<%--        <%--%>
<%--            }--%>
<%--        %>--%>
<%--        </table--%>


    </div>
</div>
<div class="Second">
    <div class="middleSecond">
        <span>推荐</span>
        <span>排行榜</span>
        <span>歌单</span>
        <span>主播电台</span>
        <span>歌手</span>
        <span>新碟上架</span>
    </div>
</div>
<div class="Third">
    <div class="middleThird">
        <span><i class="fa fa-angle-left" style="font-size:80px"></i></span>
        <div class="ThirdMiddle">
            <div class="ThirdMiddleOne">
                <img src="../img/01.jpg" style="height: 200px;width: 825px;">
                <span></span>
                <span></span>
            </div>
            <div class="ThirdMiddleTwo"></div>
        </div>
        <span id="left"><i class="fa fa-angle-right" style="font-size:80px"></i></span>
    </div>
</div>
<div class="Fourth">
    <div class="FourthMiddle">
        <div class="FourthTop">
            <div class="FourthTopRed"><span></span></div>
            <div class="FourthTopOne">热门推荐</div>
            <span>华语</span>
            <span>|</span>
            <span>流行</span>
            <span>|</span>
            <span>摇滚</span>
            <span>|</span>
            <span>民谣</span>
            <span>|</span>
            <span>电子</span>
        </div>
        <span>更多</span>
        <div class="BoxLine"></div>
    </div>
</div>
<div class="Fifth">

    <div class="Fifthmiddle">
        <div class="FifthFloat">
            <div class="FifthOne">
                <div class="FifthOneTop">
                    <img src="../img/03.jpg" alt="">
                    <span>
                        <span><a href="/music1_war_exploded/MusicListServlet">10万</a></span>

                            <i class="fa fa-play-circle" style="font-size: 16px;"></i>
                        </span>
                </div>
                <div class="FifthOneBottom">别灰心，普普通通的你也值得被万般宠溺</div>
            </div>

            <div class="FifthOne">
                <div class="FifthOneTop">
                    <img src="../img/03.jpg" alt="">
                    <span>
                        <span><a href="/music1_war_exploded/MusicListServlet">10万</a></span>

                            <i class="fa fa-play-circle" style="font-size: 16px;"></i>
                        </span>
                </div>
                <div class="FifthOneBottom">♪新疆舞曲♥新疆人能歌善舞 不是盖的♛</div>
            </div>

            <div class="FifthOne">
                <div class="FifthOneTop">
                    <img src="../img/05.jpg" alt="">
                    <span>
                        <span><a href="/music1_war_exploded/MusicListServlet">10万</a></span>


                            <i class="fa fa-play-circle" style="font-size: 16px;"></i>
                        </span>
                </div>
                <div class="FifthOneBottom">全网流行热歌（持续更新）</div>
            </div>

            <div class="FifthOne">
                <div class="FifthOneTop">
                    <img src="../img/06.jpg" alt="">
                    <span>
                        <span><a href="/music1_war_exploded/MusicListServlet">10万</a></span>


                        <i class="fa fa-play-circle" style="font-size: 16px;"></i>
                        </span>
                </div>
                <div class="FifthOneBottom">听见马天宇的AB面：时间让我学会，先感受再去享受生活</div>
            </div>
        </div>


        <div class="FifthFloat">
            <div class="FifthOne">
                <div class="FifthOneTop">
                    <img src="../img/03.jpg" alt="">
                    <span>
                        <span><a href="/music1_war_exploded/MusicListServlet">10万</a></span>

                        <i class="fa fa-play-circle" style="font-size: 16px;"></i>
                        </span>
                </div>
                <div class="FifthOneBottom">别拿我教你的去爱别人（Cover.）</div>
            </div>

            <div class="FifthOne">
                <div class="FifthOneTop">
                    <img src="../img/04.jpg" alt="">
                    <span>
                        <span><a href="/music1_war_exploded/MusicListServlet">10万</a></span>
                        <i class="fa fa-play-circle" style="font-size: 16px;"></i>
                        </span>
                </div>
                <div class="FifthOneBottom">小王子 Chapter 16</div>
            </div>

            <div class="FifthOne">
                <div class="FifthOneTop">
                    <img src="../img/05.jpg" alt="">
                    <span>
                        <span><a href="/music1_war_exploded/MusicListServlet">10万</a></span>

                            <i class="fa fa-play-circle" style="font-size: 16px;"></i>

                        </span>
                </div>
                <div class="FifthOneBottom">好多话想说 好多话没说 好多话不能说”</div>
            </div>

            <div class="FifthOne">
                <div class="FifthOneTop">
                    <img src="../img/06.jpg" alt="">
                    <span>
                            <span><a href="/music1_war_exploded/MusicListServlet">10万</a></span>

                        <i class="fa fa-play-circle" style="font-size: 16px;"></i>
                        </span>
                </div>
                <div class="FifthOneBottom">童话 偷米</div>
            </div>
        </div>
    </div>
</div>
<%--<div class="Sixth">--%>
<%--    <span>登录网易云音乐，可以享受无限收藏的乐趣，并且无限同步到手机</span>--%>
<%--    <button><a href="login.jsp">用户登录</a></button>--%>
<%--</div>--%>
</body>

</html>