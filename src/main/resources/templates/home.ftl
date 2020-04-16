<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>home</title>
    <link>

    <link type="text/css" rel="stylesheet" href="/jsgrid/jsgrid.min.css"/>
    <link type="text/css" rel="stylesheet" href="/jsgrid/jsgrid-theme.min.css"/>
</head>
<body>

<div id="jsGrid"></div>

<script type="text/javascript" src="/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/jsgrid/jsgrid.min.js"></script>

<script>
    $(document).ready(function () {

        $("#jsGrid").jsGrid({
            width: "100%",
            height: "400px",

            inserting: true,
            editing: true,
            sorting: true,
            paging: true,

            controller: {
                insertItem: function (item) {
                    var d = $.Deferred();
                    $.ajax({
                        type: "POST",
                        url: "/dept",
                        accept: "application/json",
                        contentType: "application/json; charset=utf-8",
                        dataType:"json",
                        data: JSON.stringify(item),
                    }).done(function (data) {
                        d.resolve(data);
                    }).fail(function (msg) {
                        alert(msg.responseText);
                        d.reject();
                    });
                    return d.promise();
                }
            },

            fields: [
                {name: "co", title: '회사코드', type: "text", width: 50},
                {name: "sect", title: '부문코드', type: "text", width: 50},
                {name: "sectName", title: '부문명', type: "text", width: 50},
                {name: "dept", title: '부서코드', type: "text", width: 50},
                {name: "deptName", title: '부서명', type: "text", width: 50},
                {type: "control"}
            ]
        });


    });
</script>
</body>
</html>