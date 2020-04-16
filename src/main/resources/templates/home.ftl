<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>영업일보</title>
    <link >

    <link type="text/css" rel="stylesheet" href="/jsgrid/jsgrid.min.css" />
    <link type="text/css" rel="stylesheet" href="/jsgrid/jsgrid-theme.min.css" />
</head>
<body>

<div id="jsGrid"></div>

<script type="text/javascript" src="/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/jsgrid/jsgrid.min.js"></script>

<script>
    $(document).ready(function(){

        $("#jsGrid").jsGrid({
            width: "100%",
            height: "400px",

            inserting: true,
            editing: true,
            sorting: true,
            paging: true,

            fields: [
                { name: "Name", type: "text", width: 150, validate: "required" },
                { name: "Age", type: "number", width: 50 },
                { name: "Address", type: "text", width: 200 },
                { name: "test", type: "select", items: [{Id:0, Name:'test1'},{Id:1, Name:'test2'}], valueField: "Id", textField: "Name" },
                { name: "Country", type: "select", items: [], valueField: "Id", textField: "Name" },
                { name: "Married", type: "checkbox", title: "Is Married", sorting: false },
                { type: "control" }
            ]
        });


    });
</script>
</body>
</html>