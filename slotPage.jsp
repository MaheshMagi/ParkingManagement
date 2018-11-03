<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<button type="button" id = "addSlot" class="slot-buttons" style="float: left">Add Slots</button>
<%--<button type="button" id = "viewSlot" class="slot-buttons" style="float: right">View Slots</button>--%>
<div class="dropdown" style="float: right">
    <button class="dropbtn">View Slots</button>
    <div class="dropdown-content">
        <a href="#">AA</a>
        <a href="#">Link 2</a>
        <a href="#">Link 3</a>
    </div>
</div>

<div id="myDiv" class = "modal">
    <div id = "Slot_Form" style= "width:291px;margin: 55px 641px;position: absolute;" method = "Post">
    <input type="text" placeholder="Enter Slot name" id ="slot_id" name="SlotName"><br/>
    <button type="submit" class="button" id="button_id">Register</button>
    </div>
</div >
    <div class= "success-message" id = "Slot_Success"  style= "display:none; margin:80px auto;width: 100%">
        <p >SLOT ADDED SUCCESSFULLY!</p>
    </div>
<script  type="text/javascript">
    var modal = document.getElementById('myDiv');
    var mybutton = document.getElementById("addSlot");

    mybutton.onclick = function() {
        modal.style.display="block";
        document.getElementById("Slot_Success").style.display = "none";
        $('#Slot_Form').show();
    }
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";

        }
    }
    $(document).ready(function() {
       $('#button_id').click(function () {
                $.ajax({
                    type: "post",
                    url: "Direct.do?actionToCall=addSlot",
                    data: "SlotName="+$('#slot_id').val(),
                    success: function(msg){
                        $('#Slot_Form').hide();
                        modal.style.display = "none";
                        document.getElementById("Slot_Success").style.display = "inline-block";
                    },
                    error : function(errorThrown) {
                        alert(errorThrown);
                    }
                });
        });
    });
</script>

</body>
</html>
<style>
    .success-message{
        margin: 70px auto;
        display: block;
        border-radius: 4px;
        border: none;
        color: #20bb41;
        height: 100px;
        text-align: center;
        font-size: 25px;
    }
    .slot-buttons{
        display: inline-block;
        border-radius: 4px;
        background-color: #f47320;
        border: none;
        color: #FFFFFF;
        text-align: center;
        font-size: 15px;
        padding: 10px;
        width: 10%;
        transition: all 0.5s;
        cursor: pointer;
        margin: 50px;
        position: relative;
        left: 191px;

    }
    .slot-buttons span{
        cursor: pointer;
        display: inline-block;
        position: relative;
        transition: 0.5s;
    }
    .modal {
        display: none; /* Hidden by default */
        position: fixed; /* Stay in place */
        z-index: 3; /* Sit on top */
        padding-top: 250px; /* Location of the box */
        left: 0;
        top: 0;
        width: 100%; /* Full width */
        height: 100%; /* Full height */
        overflow: auto; /* Enable scroll if needed */
        background-color: rgb(0,0,0); /* Fallback color */
        background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
    }
    .dropbtn {
        display: inline-block;
        border-radius: 4px;
        background-color: #f47320;
        border: none;
        color: #FFFFFF;
        text-align: center;
        font-size: 15px;
        padding: 10px;
        transition: all 0.5s;
        cursor: pointer;
        margin-top: 50px;
        margin-right: 50px;
        width: 124px;
    }

    .dropdown {
        position:relative;
        display: inline-block;
    }

    .dropdown-content {
        display: none;
        position: fixed;
        background-color: #f9f9f9;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
        z-index: 0;
    }

    .dropdown-content a {
        color: black;
        padding: 12px 16px;
        text-decoration: none;
        display: block;
    }

    .dropdown-content a:hover {background-color: #f1f1f1}

    .dropdown:hover .dropdown-content {
        display: block;
    }

    .dropdown:hover .dropbtn {
        background-color: #f47320;
    }
</style>
