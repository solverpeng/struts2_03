<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <center>
        Hello, Freemarker....
        <hr>
        <#if Request.requestKey?exists>
            ${Request.requestKey}
        </#if>
        <hr>
        <@s.property value="%{#request.requestKey}"/>

    </center>
</body>
</html>