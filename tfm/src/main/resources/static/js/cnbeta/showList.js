(function ($) {
    'use strict';
    var pagefn = doT.template($("#pagetmpl").html());   //初始化列表模板
    function updateList(data) {
        $("#pagetmpl").empty(); //清空模板数据
        for(var i in data){
            data[i].img = ""+Math.ceil(Math.random()*10);
        }
        $("#dot-body").html(pagefn(data));   //加入数据到模板
    }
    //创建MeScroll对象
    var mescroll = initMeScroll("mescroll", {
        down:{
            auto:true,//是否在初始化完毕之后自动执行下拉回调callback; 默认true
            callback: downCallback //下拉刷新的回调
        },
        up: {
            auto:false,//初始化完毕,是否自动触发上拉加载的回调
            isBoth: false, //上拉加载时,如果滑动到列表顶部是否可以同时触发下拉刷新;默认false,两者不可同时触发; 这里为了演示改为true,不必等列表加载完毕才可下拉;
            callback: upCallback //上拉加载的回调
        }
    });

    /*下拉刷新的回调 */
    function downCallback(){
        $.ajax({
            type: "POST",
            url: '/rss/rssList',
            dataType: 'json', //当这里指定为json的时候，获取到了数据后会自己解析的，只需要 返回值.字段名称 就能使用了
            cache: false,
            success: function (data) {
                mescroll.endSuccess();
                if (data.length>0) {
                    updateList(data);   //更新数据
                }
            },
            error:function () {
                mescroll.endErr();
            }
        });
    }

    /*上拉加载的回调 page = {num:1, size:10}; num:当前页 从1开始, size:每页数据条数 */
    function upCallback(page){
        //联网加载数据
        getListDataFromNet(page.num, page.size, function(curPageData){
            //联网成功的回调,隐藏下拉刷新和上拉加载的状态;
            //mescroll会根据传的参数,自动判断列表如果无任何数据,则提示空;列表无下一页数据,则提示无更多数据;
            console.log("page.num="+page.num+", page.size="+page.size+", curPageData.length="+curPageData.length);

            //方法一(推荐): 后台接口有返回列表的总页数 totalPage
            //mescroll.endByPage(curPageData.length, totalPage); //必传参数(当前页的数据个数, 总页数)

            //方法二(推荐): 后台接口有返回列表的总数据量 totalSize
            //mescroll.endBySize(curPageData.length, totalSize); //必传参数(当前页的数据个数, 总数据量)

            //方法三(推荐): 您有其他方式知道是否有下一页 hasNext
            //mescroll.endSuccess(curPageData.length, hasNext); //必传参数(当前页的数据个数, 是否有下一页true/false)

            //方法四 (不推荐),会存在一个小问题:比如列表共有20条数据,每页加载10条,共2页.如果只根据当前页的数据个数判断,则需翻到第三页才会知道无更多数据,如果传了hasNext,则翻到第二页即可显示无更多数据.
            mescroll.endSuccess(curPageData.length);

            //设置列表数据
            setListData(curPageData, true);
        }, function(){
            //联网失败的回调,隐藏上拉加载的状态
            mescroll.endErr();
        });
    }

    /*设置列表数据*/
    function setListData(curPageData, isAppend) {
        for (var i = 0; i < curPageData.length; i++) {
            var img = ""+Math.ceil(Math.random()*10);
            var it=curPageData[i];
            var html='<a href="/jsoupUrl/getArticle?url='+it.link+'&title='+it.title+'"' +
                ' class="weui-media-box weui-media-box_appmsg">' +
                ' <div class="weui-media-box__hd">' +
                '  <img class="weui-media-box__thumb" src="/images/img/'+img+'.jpg">' +
                '  </div>' +
                '  <div class="weui-media-box__bd">' +
                '  <h4 class="weui-media-box__title"></h4>' +
                '  <p class="weui-media-box__desc">'+it.title+'</p>' +
                '  </div>' +
                '  </a>';
            if (isAppend) {
                $("#dot-body").append(html);
            } else{
                $("#dot-body").insertBefore(html);
            }
        }
    }

    /*联网加载列表数据*/
    function getListDataFromNet(pageNum,pageSize,successCallback,errorCallback) {
        $.ajax({
            type: "POST",
            url: '/rss/rssListPage',
            dataType: 'json',
            data:{
                pageNum:pageNum,
                pageSize:pageSize
            },
            success: function (data) {
                successCallback&&successCallback(data);
            },
            error: function () {
                errorCallback&&errorCallback();
            }
        });
    }
    //禁止PC浏览器拖拽图片,避免与下拉刷新冲突;如果仅在移动端使用,可删除此代码
    document.ondragstart=function() {return false;}
}(jQuery));
