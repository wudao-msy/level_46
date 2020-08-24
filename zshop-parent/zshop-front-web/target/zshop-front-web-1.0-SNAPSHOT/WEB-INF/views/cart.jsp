<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>我的购物车</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/layer/layer.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/zshop.css"/>

    <script>
        //继续购物
        function shopping(){
            location.href='${pageContext.request.contextPath}/front/product/main';
        }

        //显示删除确认框
        function showModal(id,count){
            //alert(id);
            //将id存入模态框的隐藏表单域
            $('#deleteItemId').val(id);
            $('#count').val(count);
            //显示删除模态框
            $('#deleteItemModal').modal("show");

        }

        //删除订单
        function deleteItem(){
            $.post('${pageContext.request.contextPath}/front/product/removeItemById',
                    {"id":$('#deleteItemId').val()},
                    function(result){
                        if(result.status==1){
                            layer.msg(result.message,{
                                time:2000,
                                skin:'successMsg'
                            },function(){
                                //整个页面刷新
                                //location.href='${pageContext.request.contextPath}/front/product/toCart';
                                //局部页面刷新
                                let count=$('#count').val();
                                //找到该count对应的tr,将其删除即可
                                $('#id_'+count).remove();
                                //关闭删除确认框
                                $('#deleteItemModal').modal("hide");

                            });

                        }
                        else{
                            layer.msg(result.message,{
                                time:2000,
                                skin:'errorMsg'
                            },function(){
                                //整个页面刷新
                                //location.href='${pageContext.request.contextPath}/front/product/toCart';
                                //局部页面刷新
                                //let count=$('#count').val();
                                //找到该count对应的tr,将其删除即可
                                //$('#id_'+count).remove();

                            });


                        }
                    });
        }

    </script>
</head>

<body>
<% request.setAttribute("index",2);%>
<jsp:include page="top.jsp"/>
<!-- content start -->
<div class="container">
    <div class="row">
        <div class="col-xs-12">
            <div class="page-header" style="margin-bottom: 0px;">
                <h3>我的购物车</h3>
            </div>
        </div>
    </div>
    <table class="table table-hover table-striped table-bordered">
        <tr>
            <th>
                <input type="checkbox" id="all">
            </th>
            <th>序号</th>
            <th>商品名称</th>
            <th>商品图片</th>
            <th>商品数量</th>
            <th>商品单价</th>
            <th>商品总价</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${sessionScope.shoppingCart.items}" var="item" varStatus="s">
        <tr id="id_${s.count}">
            <td>
                <input type="checkbox">
            </td>
            <td>${s.count}</td>
            <td>${item.product.name}</td>
            <td> <img src="${pageContext.request.contextPath}/front/product/showPic?image=${item.product.image}" alt="" width="60" height="60"></td>

            <td>
                <input type="text" value="${item.quantity}" size="5">
            </td>
            <td>${item.product.price}</td>
            <td>${item.product.price * item.quantity}</td>
            <td>
                <button class="btn btn-success" type="button"> <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改</button>
                <button class="btn btn-danger" type="button" onclick="showModal(${item.product.id},${s.count})">
                    <span class="glyphicon glyphicon-remove" aria-hidden="true" ></span>删除
                </button>
            </td>
        </tr>
        </c:forEach>
        <tr>
            <td colspan="8" align="right">
                <button class="btn btn-warning margin-right-15" type="button"> 删除选中项</button>
                <button class="btn btn-warning  margin-right-15" type="button"> 清空购物车</button>
                <button class="btn btn-warning margin-right-15" type="button" onclick="shopping()"> 继续购物</button>
                <a href="order.html">
                    <button class="btn btn-warning " type="button"> 结算</button>
                </a>
            </td>
        </tr>
        <tr>
            <td colspan="8" align="right" class="foot-msg">
                总计： <b><span>${shoppingCart.totalMoney}</span> </b>元
            </td>
        </tr>
    </table>
</div>
<!-- content end-->
<!-- footers start -->
<div class="footers">
    版权所有：中兴软件技术
</div>
<!-- footers end -->

<!--删除确认框  start-->
<div class="modal fade" tabindex="-1" id="deleteItemModal">
    <input type="hidden" id="deleteItemId"/>
    <input type="hidden" id="count"/>
    <!-- 窗口声明 -->
    <div class="modal-dialog">
        <!-- 内容声明 -->

        <input type="hidden" id="deleteProductId"/>
        <div class="modal-content">
            <!-- 头部、主体、脚注 -->
            <div class="modal-header">
                <button class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">提示消息</h4>
            </div>
            <div class="modal-body row">
                <div class="col-sm-8">
                    <h4>确认要删除该订单吗？</h4>
                </div>

            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" onclick="deleteItem()">确认</button>
                <button class="btn btn-primary cancel" data-dismiss="modal">取消</button>
            </div>
        </div>

    </div>
</div>

<!--删除确认框  end-->

</body>

</html>
