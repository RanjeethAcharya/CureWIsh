# cureWish
# cureWish
ranjeeth

<div class="row d-flex align-items-center">
      <div class="col text-center">
        <a href="#" type="" class="btn btn-outline-light ml-4 px-4 justify-content-center">To know more.</a>
      </div>
    </div>

    <h2>Enter two numbers to add:</h2>
  <form>
    <input type="text" id="num1" name="num1" placeholder="Enter first number">
    <input type="text" id="num2" name="num2" placeholder="Enter second number">
    <button type="button" onclick="add()">Add</button>
  </form>
  <p id="result"></p>

  <script>
    function add() {
      var num1 = parseFloat(document.getElementById("num1").value);
      var num2 = parseFloat(document.getElementById("num2").value);
      var sum = num1 + num2;
      document.getElementById("result").innerHTML = "The sum of " + num1 + " and " + num2 + " is " + sum;
    }
  </script>

<!--api-->
AIzaSyBhbdClU78NH2Zb0bOGN5_PkTRU2VakV-c

