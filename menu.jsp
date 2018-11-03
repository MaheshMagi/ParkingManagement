<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
    <div id = menu-buttons style= left:60px;>
        <a href="Link.do?actionToCall=Register" class="button-menu"><span>Register</span></a><br>
        <a href="Link.do?actionToCall=View" class="button-menu" style="vertical-align:middle"><span>View</span></a><br>
        <a href="Direct.do?actionToCall=slotPage" class="button-menu" style="vertical-align: middle"><span>Slots</span></a><br>
    </div>
    </body>
</html>
<style>
    #menu-buttons{
        margin-top: 100%;
    }
    .button-menu {
        margin-left:30%;
        margin-bottom: 8px;
        display: inline-block;
        border-radius: 4px;
        background-color: #f4311d;
        border: none;
        color: #FFFFFF;
        text-align: center;
        font-size: 15px;
        padding: 10px;
        width: 50px;
        transition: all 0.5s;
        cursor: pointer;
    }
    .button-menu span {
        cursor: pointer;
        display: inline-block;
        position: relative;
        transition: 0.5s;
    }

</style>