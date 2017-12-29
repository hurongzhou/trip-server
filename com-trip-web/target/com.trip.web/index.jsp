<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>上传图片</title>
</head>
<body>
<form action="fileUpload.json" method="post" enctype="multipart/form-data">
    <input type="file" name="file" />
    <br/>
    类型：<input type="text" name="type"/>
    <br/>
    外键：<input type="text" name="foreignId">
    <br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>