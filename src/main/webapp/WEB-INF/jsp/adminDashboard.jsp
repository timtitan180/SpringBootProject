<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>

        body {
            background-color: whitesmoke;
        }
        header {
            background-color: white;
            position: fixed;
            overflow: auto;
            box-shadow: 0 6px 8px gray;
        }

        section {
            margin-bottom: 20px;
        }

        ul {
            list-style-type: none;
            align-items: center;
        }
        
        .horizontalDashboard {
            width:70%;
            margin-left:50px;
            border-bottom:2px;
        }
        .tableContainer {
            box-shadow: 0 3px 5px gray;
            background-color: white;
            text-align:center;
            justify-content: center;
            margin-left:400px;
        }

        h3 {
            color:gray;
        }
    </style>
</head>
<body>
    <header style="color:antiquewhite;height:100%;width:100px"><section></section><ul><li><a href="adminui.html">Edit</a></li></ul></header>
    <div class="horizontalHeader"><h2>Admin DashBoard</h2></div>
    <div class="tableContainer" id="table1" style="margin-bottom:10px;position:relative;height:200px;width:180px;border-radius:7px">
        <h3>Games</h3>
        <h4>Most current games can go here</h4>
    </div>
    <div class="tableContainer" id="table2" style="position:relative;height:200px;width:180px;border-radius:7px">
        <h3>Players</h3>
        <h4>Players with the best stats can go here</h4>
    </div>
  
</body>
</html>