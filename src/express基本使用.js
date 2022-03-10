const express = require('express');
const {request, response} = require("express");
const app = express();

app.get('/server',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers",'*');
    response.send("Hello Ajax Server Get");
});

app.post('/server',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    response.send("Hello Ajax Server Post");
});

app.all('/test',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    response.send("Hello Ajax Test All");
});

app.all('/keyboard',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    response.send("Hello Ajax KeyboardDown All");
});

app.all('/keyup',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    response.send("Hello Ajax KeyboardUp All");
});

//json数据 处理
app.all('/json',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    const data = {
        name: "jiang",
        age: 21
    }

    //将json数据转换成 字符串
    let str = JSON.stringify(data);

    response.send(str);
});

//处理IE ,现在的 Microsoft Edge 没问题
app.all('/ie',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    response.send("Hello Ajax IE All");
});

//延时响应
app.all("/delay",(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    setTimeout(()=>{
        response.send("Hello Ajax Delay All");
    },3000)
})

//处理重复请求
app.all('/dup',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    response.send("Hello Ajax Dup All");
});

app.get('/jquery-get',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    response.send("Hello Ajax JQuery-Get All");
});

app.post('/jquery-post',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    response.send("Hello Ajax JQuery-Post All");
});

app.all('/jquery-general',(request , response)=>{
    response.setHeader("Access-Control-Allow-Origin",'*');
    response.setHeader("Access-Control-Allow-Headers", "*");
    let data = {
        name :"jiang",
        age : 21
    }
    let str = JSON.stringify(data);
    response.send(str);
});




app.listen(8000,(request,response)=>{
    console.log("服务正在启动,8000端口监听中...");
})






