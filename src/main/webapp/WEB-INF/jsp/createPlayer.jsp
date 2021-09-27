<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
  <header>Header</header>
    <div>
        <form action="/createPlayer" method="post">
          <div>
            <input id="games" name="games" placeholder="Enter Games Played"/>
            <input id="atBats" name="atBats" placeholder="Enter At Bats" />
            <input id="hits" name="hits" placeholder="Enter Hits"/>
          </div>
          <div>
            <input id="runs" name="runs" placeholder="Enter Runs" />
              <input id="rbis" name="rbis" placeholder="Enter Runs Batted In"/>
              <input id="hrs" name="hrs" placeholder="Enter Home Runs"/>
            </div>
            <div>
              <input id="walks" name="walks" placeholder="Enter Walks"/>
              <input id="strikeouts" name="strikeouts" placeholder="Enter Times Struck Out"/>
            </div> 
              <button type="submit" id="button">Submit</button>
          </form>
          </div>
        <h2 class="stats-header">Stats</h2>
        <table class="table">
          <tr>
            <th>Games Played</th>
            <th>AtBats</th>
            <th>Runs</th>
            <th>Hits</th>
            <th>Batting Average</th>
            <th>HR</th>
            <th>RBI</th>
            <th>Walks</th>
            <th>SO</th>
          </tr>
        </table>
    </div>
</body>
<script>
    var button = document.getElementById("button");
    var table = document.querySelector("table");
    var games = document.querySelector("#games");
    var atBats = document.querySelector("#atBats");
    var runs = document.querySelector("#runs");
    var rbi = document.querySelector("#rbis");
    var deleteButton = document.getElementById("delete");
    button.addEventListener("click", function(e){
      e.preventDefault();
      var battingAverage = hits.value/atBats.value;
      var tr = document.createElement("tr");
      tr.classList.add("tableRows");
      table.appendChild(tr);
      tr.innerHTML+=`<td>${games.value}</td><td>${atBats.value}</td><td>${runs.value}</td><td>${rbi.value}</td><td>${battingAverage.toFixed(3)}</td><button style=background-color:red;>Delete</button></tr>`;
      setIdtoRows();
    });


    function setIdtoRows() {
      var tableRows = document.querySelectorAll(".tableRows");
      var deleteButtons = document.querySelectorAll(".delete-row");
      for(var i=0;i<tableRows.length;i++) {
        deleteButtons[i].setAttribute("id",i+1);
      }
     }

     function createDeleteButtonforRows() {
       var button = document.createElement("button");
       button.setAttribute(id,i);
     }

     function deleteRow(e,id) {
        var id = e.target.id;
        e.parentElement.style.display = none;

       //maybe put the button inside of the row so it will have the id when it is clicked
        //get the id of the row that is selected to be deleted
        //row.getAttribute(id);
        //row.getElementById(id).style.display = none;
        //
        //remove the visibility of the row and possibly remove it from the parent node;
     }
  </script>
</html>

