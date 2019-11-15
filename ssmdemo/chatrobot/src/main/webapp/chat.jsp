<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2019/11/10
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            background-image: url("1.jpg");
            background-repeat: no-repeat;
        }

        #wk {
            width: 600px;
            height: 600px;
            border: 2px salmon solid;
            border-radius: 5px;
            margin-left: 10%;
            margin-top: 5%;
        }

        #chat {
            min-height: 500px;
            width: 100%;
            /*background-color: black;*/
        }

        #topnar {
            height: 50px;
            width: 100%;
            background-color: salmon;
            display: flex;
            justify-content: center;
            align-items: center;
            font-size: 18px;
            font-weight: bold;
        }

        #content {
            width: 100%;
            height: 450px;
            overflow-y:scroll;
        }

        #cleft {
            width: 45%;
            float: left;
        }

        #cright {
            width: 45%;
            float: right;
        }

        .cf {
            width: 80%;
            margin: 20px;
            margin-bottom: 70px;
            border: 1px silver solid;
            border-radius: 20px;
            background-color: white;
            padding-left: 20px;
        }

        .cf span {
            color: red;
            font-weight: bold;
        }

        .cr {
            margin-top: 80px;
        }

        /**/
        #send {
            min-height: 100px;
            width: 100%;
            display: flex;
        }

        #send textarea {
            height: 100px;
            resize: none;
            width: 80%;
            font-size: 20px;
        }

        #send button {
            height: 100px;
            width: 20%;
            font-size: 25px;
            background-color: #f89832;
            border: none;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div id="wk">
    <div id="chat">
        <div id="topnar">界灵小可爱</div>
        <div id="content">
            <div id="cleft">
                <div class="cf">
                    <span>界灵小可爱：</span>
                    <br>
                    凡人，何事惊扰本大人？
                </div>
            </div>
            <div id="cright">

            </div>

        </div>
    </div>
    <div id="send">
        <textarea id="send-text" required></textarea>
        <button onclick="sendMessage()">发送</button>
    </div>
</div>
</body>
<script>
    function sendMessage() {
        var tex = document.getElementById("send-text").value;
        var cright = document.getElementById("cright");

        //创建回答节点
        var d2 = document.createElement("div");
        var d2span = document.createElement("span");
        var d2br = document.createElement("br");
        d2span.innerText = "你：";
        var d2node = document.createTextNode(tex);
        d2.appendChild(d2span);
        d2.appendChild(d2br);
        d2.appendChild(d2node);
        d2.classList.add("cr");
        d2.classList.add("cf");
        //把新节点放到右侧内容区域
        cright.appendChild(d2);
        //清空内容
        document.getElementById("send-text").value = "";
        // 让消息自动滚动
        var wk = document.getElementById("content");
        wk.scrollTop=wk.scrollHeight;
    }

    //文本框回车发送
    document.onkeydown = function (e) {
        if (e.keyCode == 13 && e.ctrlKey) {
            // 这里实现换行
            document.getElementById("send-text").value += "\n";
        } else if (e.keyCode == 13) {
            // 避免回车键换行
            e.preventDefault();
            // 下面写你的发送消息的代码
            sendMessage();
            //清空内容
            document.getElementById("send-text").value = "";
        }
    }


</script>
</html>
