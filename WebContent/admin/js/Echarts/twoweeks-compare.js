require.config({
	paths: {
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
		'echarts/chart/bar'
		// 'echarts/chart/pie'
		// 使用柱状图就加载bar模块，按需加载
	],

	function(ec) {
		// 基于准备好的dom，初始化echarts图表
		var myChart = ec.init(document.getElementById('twoweeks'));
		myChart.showLoading({
			text: '正在努力的读取数据中...', //loading话术
		});


		setTimeout(function() {
			myChart.hideLoading();
		}, 1500);

		var option = {
			title: {
				text: '近两周销量对比',
			},
			tooltip: {
				trigger: 'axis',
				formatter: function(v) {
					return v[0][1] + ' : ' + (v[0][2] - v[1][2] > 0 ? '+' : '-') + v[3][2] + '<br/>' + v[0][0] + ' : ' + v[0][2] + '<br/>' + v[1][0] + ' : ' + v[1][2] + '<br/>'
				}
			},
			toolbox: {
				show: true,
				feature: {
					mark: {
						show: true
					},
					dataView: {
						show: true,
						readOnly: false
					},
					magicType: {
						show: true,
						type: ['line', 'bar']
					},
					restore: {
						show: true
					},
					saveAsImage: {
						show: true
					}
				}
			},
			legend: {
				data: ['本周', '上周'],
				selectedMode: false
			},
			xAxis: [{
				type: 'category',
				data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
			}],
			yAxis: [{
				type: 'value',
				min: 2000,
				max: 4500
			}],
			series: [{
				name: '本周',
				type: 'line',
				data: [4000, 3740, 2510, 3000, 4200, 4000, 4400]
			}, {
				name: '上周',
				type: 'line',
				symbol: 'none',
				itemStyle: {
					normal: {
						lineStyle: {
							width: 1,
							type: 'dashed'
						}
					}
				},
				data: [3200, 3320, 3010, 3340, 3600, 3300, 3500]
			}, {
				name: '上周2',
				type: 'bar',
				stack: '1',
				barWidth: 6,
				itemStyle: {
					normal: {
						color: 'rgba(0,0,0,0)'
					},
					emphasis: {
						color: 'rgba(0,0,0,0)'
					}
				},
				data: [3200, 3320, 2510, 3000, 3600, 3300, 3500]
			}, {
				name: '变化',
				type: 'bar',
				stack: '1',
				data: [
					800, 420, {
						value: 500,
						itemStyle: {
							normal: {
								color: 'red'
							}
						}
					}, {
						value: 340,
						itemStyle: {
							normal: {
								color: 'red'
							}
						}
					},
					600, 700, 900
				]
			}]
		};

		myChart.setOption(option);

	}
);