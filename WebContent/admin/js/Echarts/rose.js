require.config({
             paths:{ 
                'echarts' : '../../js/Echarts/build/echarts',
                'echarts/chart/bar' : '../../js/Echarts/build/echarts',
                'echarts/chart/line' : '../../js/Echarts/build/echarts',
                'echarts/chart/pie' : '../../js/Echarts/build/echarts'
            }
        });
        
        // 使用
        require(
            [
                'echarts',
                // 'echarts/chart/bar',
                // 'echarts/chart/pie',
                'echarts/chart/line',
                'echarts/chart/pie'
                 // 使用柱状图就加载bar模块，按需加载
            ],
           
            function (ec) {
                // 基于准备好的dom，初始化echarts图表
                var myChart = ec.init(document.getElementById('pie'));
	        	var option = {
				    title : {
				        text: '成都市销售情况',
				        x:'center'
				    },
				    tooltip : {
				        trigger: 'item',
				        formatter: "{a} <br/>{b} : {c} ({d}%)",
				        fontFamily:'微软雅黑',
				        color:'yellow'
				    },
				    legend: {
				        x : 'center',
				        y : 'bottom',
				        data:['锦江区','青羊区','金牛区','青白江区','新都区','温江区','武侯区','龙泉驿区','成华区']
				    },
				    toolbox: {
				        show : true,
				        feature : {
				            mark : {show: true},
				            dataView : {show: true, readOnly: false},
				            restore : {show: true},
				            saveAsImage : {show: true}
				        }
				    },
				    calculable : true,
				    series : [

				        {
				            name:'面积模式',
				            type:'pie',
				            radius : [30, 110],
				            center : ['50%', 200],
				            roseType : 'area',
				            data:[
				                {value:10, name:'锦江区'},
				                {value:5, name:'青羊区'},
				                {value:15, name:'金牛区'},
				                {value:25, name:'青白江区'},
				                {value:20, name:'新都区'},
				                {value:35, name:'温江区'},
				                {value:30, name:'武侯区'},
				                {value:40, name:'龙泉驿区'},
				                {value:10, name:'成华区'}
				            ]
				        }
				    ]
				};
				myChart.setOption(option); 
				
            }
        );