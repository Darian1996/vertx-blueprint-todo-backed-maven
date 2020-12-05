
### 参考：

- https://github.com/sczyh30/vertx-blueprint-todo-backend.git
- 从 gradle 更改为 maven

### 页面测试：

- `http://www.todobackend.com/client/index.html`

- what need to be done (这里输入添加)
- x
- 双击修改
- 添加，删除
- 清楚已经完成的任务


### 测试 ajax


```js

var importJs=document.createElement('script')

// 给script标签增加type属性

importJs.setAttribute("type","text/JavaScript")

// 给script标签增加src属性

importJs.setAttribute("src", 'https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js')

// 把importJs标签添加在页面

document.getElementsByTagName("head")[0].appendChild(importJs);


```

```js

    jQuery.ajax({
        url: 'http://localhost:8082/todos',
        dataType: 'json',
        type: 'post',
        data: "{}",
        success: function(data) {
            console.log(data);
        },
        error: function(data) {
            console.log(data);
        }
    })


```

```html

    http://localhost:8081/todos

```