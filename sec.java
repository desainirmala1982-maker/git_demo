<html>
<head>
<script language="javascript">
function add() {
    var a = parseFloat(document.f1.t1.value);
    var b = parseFloat(document.f1.t2.value);
    document.f1.result.value = a + b;
}

function sub() {
    var a = parseFloat(document.f1.t1.value);
    var b = parseFloat(document.f1.t2.value);
    document.f1.result.value = a - b;
}

function mult() {
    var a = parseFloat(document.f1.t1.value);
    var b = parseFloat(document.f1.t2.value);
    document.f1.result.value = a * b;
}

function div() {
    var a = parseFloat(document.f1.t1.value);
    var b = parseFloat(document.f1.t2.value);
    document.f1.result.value = a / b;
}

function exchange() {
    var temp = document.f1.t1.value;
    document.f1.t1.value = document.f1.t2.value;
    document.f1.t2.value = temp;
}
</script>
</head>

<body>
<form name="f1">
    Number 1: <input type="text" name="t1"><br><br>
    Number 2: <input type="text" name="t2"><br><br>

    Result: <input type="text" name="result" readonly><br><br>

    <input type="button" value="Add" onclick="add()">
    <input type="button" value="Sub" onclick="sub()">
    <input type="button" value="Mul" onclick="mul()">
    <input type="button" value="Div" onclick="div()">
	
	<input type="button" value="Swap" onclick="exchange()">
   
</form>
</body>
</html>