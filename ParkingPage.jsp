<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MainPage</title>
</head>
<style>

.myButton {
	-moz-box-shadow: 0px 0px 0px 0px #040504;
	-webkit-box-shadow: 0px 0px 0px 0px #040504;
	box-shadow: 0px 0px 0px 0px #040504;
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #44c767), color-stop(1, #54ffeb));
	background:-moz-linear-gradient(top, #44c767 5%, #54ffeb 100%);
	background:-webkit-linear-gradient(top, #44c767 5%, #54ffeb 100%);
	background:-o-linear-gradient(top, #44c767 5%, #54ffeb 100%);
	background:-ms-linear-gradient(top, #44c767 5%, #54ffeb 100%);
	background:linear-gradient(to bottom, #44c767 5%, #54ffeb 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#44c767', endColorstr='#54ffeb',GradientType=0);
	background-color:#44c767;
	-moz-border-radius:29px;
	-webkit-border-radius:29px;
	border-radius:29px;
	border:2px solid #18ab29;
	display:inline-block;
	cursor:pointer;
	color:#2e2e2e;
	font-family:Times New Roman;
	font-size:17px;
	font-weight:bold;
	padding:4px 31px;
	text-decoration:none;
	text-shadow:1px 1px 4px #2f6627;
}
.myButton:hover {
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #54ffeb), color-stop(1, #44c767));
	background:-moz-linear-gradient(top, #54ffeb 5%, #44c767 100%);
	background:-webkit-linear-gradient(top, #54ffeb 5%, #44c767 100%);
	background:-o-linear-gradient(top, #54ffeb 5%, #44c767 100%);
	background:-ms-linear-gradient(top, #54ffeb 5%, #44c767 100%);
	background:linear-gradient(to bottom, #54ffeb 5%, #44c767 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#54ffeb', endColorstr='#44c767',GradientType=0);
	background-color:#54ffeb;
}
.myButton:active {
	position:relative;
	top:1px;
}

</style
<body>
<a href="FrontEndDesign.jsp" class="myButton">Register</a>
<a href= "/dbtb" class = "myButton">View</a>
</body>
</html>