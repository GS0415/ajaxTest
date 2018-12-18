<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/14
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <style>
        * {
            margin: 0;
            padding: 0;

        }
        div {
            width: 400px;
            height: 80px;
            background-color: deepskyblue;
            padding: 20px;
            margin: auto;
            /* margin-top: 250px ;*/
        }
    </style>
</head>
<body>
<div>
    <form action="doDoRegister" id="form">
        账号：<input type="text" name="username" id="us" class="aaa"><span id="tip"></span><br>
        密码：<input type="text" name="pwd" id="pwd" class="aaa"><br>
        确认密码：<input type="text" name="pwds" id="pwds" class="aaa"><span id="tip1"></span><br>
        电话：<input type="text" name="tel"><br>
        <input type="button" value="提交" disabled="disabled" id="but">
    </form>
    <script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            var un;
            var pwd;
            var pwds;
            var tel;
            $(".aaa").keyup(function () {
                un = $("#us").val();
                pwd = $("#pwd").val();
                pwds = $("#pwds").val();
                tel = $("#tel").val();
                $.ajax({
                    url: "doRegister",
                    type: "get",
                    data: {"us": un, "pwd": pwd, "pwds": pwds, "tel": tel},
                    success: function (result) {
                        /*console.log(result);*/
                        if (result === "1") {
                            $("#tip").text("可以使用");
                            $("#but").attr("disabled", true);
                        }
                        if (result === "2") {
                            $("#tip").text("用户名已存在");
                            $("#but").attr("disabled", true);
                        }
                        if (result === "12") {
                            $("#tip").text("可以使用");
                            $("#tip1").text("密码不一致");
                            $("#but").attr("disabled", true);
                        }
                        if (result === "11") {
                            $("#tip").text("可以使用");
                            $("#tip1").text("√");
                            $("#but").attr("disabled", false);
                        }
                        if (result === "22") {
                            $("#tip").text("用户名已存在");
                            $("#tip1").text("密码不一致");
                            $("#but").attr("disabled", true);
                        }
                        if (result === "21") {
                            $("#tip").text("用户名已存在");
                            $("#tip1").text("√");
                            $("#but").attr("disabled", true);
                        }
                    }
                });

            })
            $("#but").click(function () {
                $("#form").submit()
            })
        })
    </script>
</div>
</body>
</html>
