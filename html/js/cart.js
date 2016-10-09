window.onload = function() {
    //购物车表格
    var table = document.getElementById("cartTable");
    // console.log(table);
    var tr = table.children[1].rows;
    // console.log(tr);
    //所有勾选框
    var selectInputs = document.getElementsByClassName("check");
    // console.log(selectInputs.length)
    //全选框
    var selectAllInput = document.getElementsByClassName("check-all");
    //总计
    var priceTotal = document.getElementById("priceTotal")
        //数量
    var selectedTotal = document.getElementById("selectedTotal")
        //已选择的商品
    var selected = document.getElementById("selected");
    for (var i = 0; i < selectInputs.length; i++) {
        selectInputs[i].onclick = function() {
            //如果选中了全选的话
            if (this.className.indexOf('check-all') >= 0) {
                for (var j = 0; j < selectInputs.length; j++) {
                    selectInputs[j].checked = this.checked;
                }
            }
            //只要有一个没有选中，那么全选框就不选中
            if (!this.checked) {
                for (var i = 0; i < selectAllInput.length; i++) {
                    selectAllInput[i].checked = false;
                }
            }
            //选完后更新总计
            getTotal();
        }
    }
    //更新总计和总数的getTotal()方法
    function getTotal() {
        //已选的商品
        var selected = 0;
        var price = 0;
        for (var i = 0; i < tr.length; i++) {
            if (tr[i].getElementsByTagName('input')[0].checked == true) {
                tr[i].className = "on";
                //已选商品数量进行累加
                selected += parseInt(tr[i].getElementsByTagName('input')[1].value);
                // console.log(selected);
                //已选商品的价格进行累加
                price += parseFloat(tr[i].cells[4].innerHTML);
            } else {
                tr[i].className = "";
            }
            priceTotal.innerHTML = price.toFixed(2);
            selectedTotal.innerHTML = selected;
            // console.log(tr[i]);
        }
    }
    //给每行元素添加事件、数量改变，价格跟着改变
    for (var i = 0; i < tr.length; i++) {
        tr[i].onclick = function(e) {
            var e = e || window.event;
            //通过事件对象的target 属性来触发元素
            var el = e.target;
            var cls = el.className;
            // console.log(e);
            // console.log(el);
            // console.log(cls);
            var countInput = this.getElementsByTagName('input')[1];
            var value = parseInt(countInput.value);
            //判断点击的是什么
            switch (cls) {
                case "add":
                    countInput.value = value + 1;
                    getSubtotal(this);
                    break;
                case "reduce":
                    if (value > 1) {
                        countInput.value = value - 1;
                        getSubtotal(this);
                    }
                    break;
                case "delete":
                    var con = confirm("确定要删除此商品吗？")
                    if (con) {
                        this.parentNode.removeChild(this);
                    }
            }
            getTotal();
        }
    }
    //单行价格小计
    function getSubtotal(tr) {
        var cells = tr.cells;
        var price = cells[2];
        var subtotal = cells[4];
        var countIn = tr.getElementsByTagName('input')[1];
        var span = tr.getElementsByTagName('span')[1];
        //写入HTML
        subtotal.innerHTML = (parseInt(countIn.value) * parseFloat(price.innerHTML)).toFixed(2);
        if (countIn.value == 1) {
            span.innerHTML = "";
        } else {
            span.innerHTML = "-";
        }
    }
    //点击删除全部
    deleteAll.onclick = function() {
        if (selectedTotal.innerHTML != 0) {
            var con = confirm('确定删除所选商品吗？');
            if (con) {
                for (var i = 0; i < tr.length; i++) {
                    if (tr[i].getElementsByTagName('input')[0].checked) {
                        tr[i].parentNode.removeChild(tr[i]);
                        i--;
                    }
                }
            } else {
                alert('请选择商品！');
            }
        }
    }
}
jQuery(document).ready(function($) {
    $(".scroll").click(function(event) {
        event.preventDefault();
        $('html,body').animate({ scrollTop: $(this.hash).offset().top }, 1200);
    });
});
