<html>
<head>
    <title>Change Text</title>
    <script>
        function clicked() {
            var elem = document.getElementsByClassName("name");
            elem[1].style.color = "red"; 
        }
    </script>
</head>
<body>

    <h1 class="name">about</h1>
    <h1 class="name">home</h1>

    <button onclick="clicked()">change</button>

</body>
</html>