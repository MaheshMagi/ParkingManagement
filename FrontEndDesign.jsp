<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<form name = "M_Form" action="Link.do?actionToCall=RegisterProcess" class="form-login" method = "Post">
    <br class="container">
        <label><b>Unique username:</b></label>
        <br><input type="text" class ="form-input" placeholder="Enter Username" name="Username"><br/>

        <label><b>Car Model:</b></label>
        <input type="TEXT" class ="form-input" placeholder="Enter CarModel" name="CarModel" required><br/>

        <label><b>StartDate:</b></label>
        <input type="datetime-local" class ="form-input" placeholder="Enter StartDate" name="StartDate" required><br/>

        <label><b>EndDate:</b></label>
        <input type="datetime-local" class ="form-input" placeholder="Enter EndDate" name="EndDate" required><br/>

        <button class="register-button" type="submit">Register</button>
</form>
</body>
</html>
<style>
    .form-login{
        margin:7% 44%;

    }
    .register-button{
        background-color: #4CAF50; /* Green */
        border: none;
        color: white;
        padding: 15px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 10px 82px;
        cursor: pointer;
    }
    </style>