ajax 案列
    1. 准备html
        1个按钮
        1个div(css)
    2. 更改请求地址, 传入request 和 response, 设置响应头,响应体 ,
       其中响应头设置允许跨域 ,响应体是要传给div 的信息
        response.setHeader('','')
        response.send('')
    3.选择元素,为按钮绑定点击事件 const btn =  document方法
    4.创建XMLHttpRequest对象 new XMLHttpRequest()
    5.配置此对象
        open('请求方式Get/Post','服务器地址')
        send()
        onreadystatechange()
            readystate == 4 时操作 , 此时 服务器返回最终结果
            判断状态码在 200 ~ 300之间时 ,执行下一步操作
    6.将响应回来的信息 显示在 div
        result.innerHTML = xhr.response;

    错误:
        在js中使用 document方法
        上述代码调用了 Document 类型提供的方法 getElementById()，属于 DOM 的应用，但是对于 DOM 和 BOM 的操作只有在浏览器环境下才能进行

        初学解决方法: 最好在html中 直接 用script 标签 写js代码

    注意:
        1.用直接绑定事件函数 和 addEventListener 的写法是不一样的
        2. json --> string 调用 let str = JSON.stringify(data);       ==> 用于后端
        3. string --> json 调用 let data = JSON.parse(xhr.response);  ==> 用于前端
        4. 错误POST http://127.0.0.1/ie net::ERR_CONNECTION_REFUSED 是地址写错了
        5. $()不识别 ==> 没有加载JQuery依赖
