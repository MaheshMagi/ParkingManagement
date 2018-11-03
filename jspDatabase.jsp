<html>
<head><meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <title>MainPage</title>
</head>
<body>
</script>--%>
<form action="Link.do?actionToCall=dateView" style="float : right;margin: 0px 38px;" method="POST">
    <label><b>Date Chooser:</b></label>
    <input type="date" name="date-picker" />
    <input type="submit" value="Submit" />
</form>
<!--div ID="view-table">
<client:showView viewName="HorizontalTable"/>
</div-->
<form action="Link.do?actionToCall=View" class="filter-form" method="POST">
    <label><b>Filter Slot:</b></label>
    <input type="text" name="filter" placeholder="SLOT NAME" />
    <input type="submit" value="Submit" />
</form>
</body>
</html>
<style>
    /*.buttons{
        display:inline-flex;
        margin-bottom: 2px;
    }
    .download-button{

        margin: 2px;
        padding: 4px;
        border: 1px;
        background-color: #ee1113;
        border-radius: 2px;
        font-size: small;
        color: white;
        font-family: "Trebuchet MS", Helvetica, sans-serif;
        text-align: center;
    }*/
    .filter-form{
        margin:5% 19%;
    }
</style>