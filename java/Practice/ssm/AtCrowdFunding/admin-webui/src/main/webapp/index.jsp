<%--
  Created by IntelliJ IDEA.
  User: Chan_GR
  Date: 2022/5/27
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <script type="text/javascript" src="jquery/jquery-3.5.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn_01").click(function () {
                $.ajax({
                    url:"send/one/array.html",
                    type:"post",
                    data:{
                        "array":[1,2,3],
                    },
                    dataType:"text",
                    "success":function (response) {
                        alert(response)
                    },
                    "error":function (response) {
                        alert(response)
                    }
                });
            })

            $("#btn_02").click(function () {
                let array = [1,2,3];
                let requestBody = JSON.stringify(array);

                $.ajax({
                    url:"send/two/array.html",
                    type:"post",
                    data:requestBody,
                    contentType:"application/json;charset=UTF-8",
                    dataType:"text",
                    "success":function (response) {
                        alert(response)
                    },
                    "error":function (response) {
                        alert(response)
                    }
                });
            })

            $("#btn_03").click(function () {
                let student = {
                    sName:"Tom",
                    sId:"01",
                    desc:"good",
                    subject:{
                        chinese:90,
                        math:100,
                        english:90
                    }
                };
                let requestBody = JSON.stringify(student);

                $.ajax({
                    url:"send/three/array.html",
                    type:"post",
                    data:requestBody,
                    contentType:"application/json;charset=UTF-8",
                    dataType:"text",
                    "success":function (response) {
                        console.log(response)
                    },
                    "error":function (response) {
                        console.log(response)
                    }
                });
            })

            $("#btn_04").click(function () {
                let student = {
                    sName:"Tom",
                    sId:"01",
                    desc:"good",
                    subject:{
                        chinese:90,
                        math:100,
                        english:90
                    }
                };
                let requestBody = JSON.stringify(student);

                $.ajax({
                    url:"send/four/array.json",
                    type:"post",
                    data:requestBody,
                    contentType:"application/json;charset=UTF-8",
                    dataType:"json",
                    "success":function (response) {
                        console.log(response)
                    },
                    "error":function (response) {
                        console.log(response)
                    }
                });
            })
        })
    </script>
</head>
<body>
<h1>demo</h1>
<a href="test/ssm.html">测试ssm整合环境</a>
<br>
<br>
<a href="admin/login.html">进入登录界面</a>
<br>
<br>
<button id="btn_01">test RequestBody 01</button>
<button id="btn_02">test RequestBody 02</button>
<button id="btn_03">test RequestBody 03</button>
<button id="btn_04">test RequestBody 04</button>
</body>
</html>
