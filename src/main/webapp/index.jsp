<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#test").click(function(){
                $.get("/test",
                    {
                        arg: document.getElementById("x").value,
                        step: document.getElementById("n").value
                    },
                    function(data){
                        document.getElementById("result").value = data;
                    });
            });
        });
    </script>
</head>
<body>
<h2>Hello World!</h2>
<input id="x">
<input id="n">
<button id="test">TEST</button>
<input id="result">
</body>
</html>
