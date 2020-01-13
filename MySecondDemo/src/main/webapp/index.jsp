<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Test</title>
</head>
<!-- 引入 ECharts 文件 -->
<script src="${pageContext.request.contextPath}/core/echarts.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/core/jquery-3.4.1.min.js"></script>
<body>
<div>
    <button id="select">
        查询
    </button>
</div>
<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
<div id="main" style="width: 95%; height: 60%;"></div>
<script type="text/javascript">
    $("#select").click(function () {
        console.log("进入点击事件");
        initEcharts();
    });

    function initEcharts() {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        option = {
            legend: {
                left: '12%',
                top: 45
            },
            tooltip: {
                trigger: 'axis',
                showContent: false
            },
            dataset: {
                source: [
                    ['dateTime', '周日', '周一', '周二', '周三', '周四', '周五', '周六'],
                    ['EMUI 8.0', 41.1, 30.4, 65.1, 53.3, 83.8, 9.7],
                    ['EMUI 9.0', 6.5, 92.1, 85.7, 83.1, 73.4, 55.1],
                    ['EMUI 10.0', 24.1, 67.2, 7.5, 86.4, 65.2, 82.5]
                ]
            },
            xAxis: {
                name: '时间',
                type: 'category',
                boundaryGap: false,
                axisTick: {
                    show: false
                },
                axisLine: {
                    symbol: ["none", "arrow"]
                }
            },
            yAxis: {
                name: 'VNR',
                gridIndex: 0,
                axisTick: {
                    show: false
                },
                axisLine: {
                    symbol: ["none", "arrow"]
                },
                splitLine: {//去除网格线
                    show: false
                }
            },
            toolbox: {
                right: '12%',
                top: 40,
                feature: {
                    magicType: {show: true, type: ['bar','line']},
                    restore: {}
                }
            },
            grid: {top: '10%'},
            series: [
                {type: 'line', smooth: true, seriesLayoutBy: 'row'},
                {type: 'line', smooth: true, seriesLayoutBy: 'row'},
                {type: 'line', smooth: true, seriesLayoutBy: 'row'}
            ]
        };
        myChart.setOption(option);
    }
</script>
</body>
</html>