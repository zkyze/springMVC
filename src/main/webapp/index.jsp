<html>
<body>
<h2>Hello World!</h2>
<div>
    name:<input type="text" id="name"/>
     age:<input type="text" id="age"/>
    <input type="button" value="sure"onclick="sure()">
</div>
</body>
<script>
    function sure() {
        $.ajax({
            type:"POST",
            url:"/json.do",
            data:{
                name:$("#name").val(),
                age:$("#age").val()
            },
            dataType:"json",
            success:function(data){
                alert("222");
            }
        });
    }
</script>
</html>
