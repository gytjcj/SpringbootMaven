$(function() {
	
	setInterval(getDate, 1000);
	function getDate() {
		var date = new Date();
		//格式化为本地时间格式
		var date = date.toLocaleString('chinese', { hour12: false });
		$(".nowtime").val(date);
	}
	
	//修改
	$(".sql_deviceinfo_secret,.sql_deviceinfo_notsecret").click(function() {
		var len = $(this).find('td').length;
		var array = new Array();
		for (var i = 0; i < len; i++) {
			array[i] = $(this).find('td').eq(i).text();
			//console.log(maintainrecord[i]);
		}
		$("#id").val(array[0]);
		$("#deviceid").val(array[1]);
		$("#deviceassetid").val(array[2]);
		$("#devicetype").val(array[3]);
		$("#manufacturersinfo").val(array[4]);
		$("#devicemodel").val(array[5]);
		$("#applicationname").val(array[6]);
		$("#currentusedepartment").val(array[7]);
		$("#currentinstalllocation").val(array[8]);
		$("#currentuseperson").val(array[9]);
		$("#currentpersonincharge").val(array[10]);
		$("#IPaddress").val(array[11]);
		$("#distributiondate").val(array[12]);
		$("#secretinfo").val(array[13]);
		$("#madein").val(array[14]);
		$("#serialnumber").val(array[15]);
		$("#CPUinfo").val(array[16]);
		$("#meminfo").val(array[17]);
		$("#hdiskinfo").val(array[18]);
		$("#hdisksn").val(array[19]);
		$("#OSinfo").val(array[20]);
		$("#DBinfo").val(array[21]);
		$("#appinfo").val(array[22]);
		$("#remarkinfo").val(array[23]);
		
		
	});
	
//派单
	$(".sql_maintainrecord").click(function() {
		var len = $(this).find('td').length;
		var maintainrecord = new Array();
		for (var i = 0; i < len; i++) {
			maintainrecord[i] = $(this).find('td').eq(i).text();
			//console.log(maintainrecord[i]);
		}

		$("#maintainrecordid").val(maintainrecord[0]);
		$("#deviceassetid").val(maintainrecord[1]);
		$("#deviceid").val(maintainrecord[2]);
		$("#repairasktime").val(maintainrecord[3]);
		$("#repairaskoffice").val(maintainrecord[4]);
		$("#repairaskpeople").val(maintainrecord[5]);
		$("#description").val(maintainrecord[7]);
	});
//维修
	$(".sql_maintainrecord2").click(function() {
		var len = $(this).find('td').length;
		var maintainrecord = new Array();
		for (var i = 0; i < len; i++) {
			maintainrecord[i] = $(this).find('td').eq(i).text();
			//console.log(maintainrecord[i]);
		}

		$("#maintainrecordid").val(maintainrecord[0]);
		$("#deviceassetid").val(maintainrecord[1]);
		$("#deviceid").val(maintainrecord[2]);
		$("#repairasktime").val(maintainrecord[3]);
		$("#repairaskoffice").val(maintainrecord[4]);
		$("#repairaskpeople").val(maintainrecord[5]);
		$("#responsetime").val(maintainrecord[6]);
		$("#receiver").val(maintainrecord[8]);
		$("#description").val(maintainrecord[9]);
	});

	$("a").click(function() {
		$("a").removeClass("a_style");
		$(this).addClass("a_style");
	});
	
	$(".back").click(function(){
		history.go(-1);
	});

	//清空
	$("input[type='reset']").click(function() {
		var reset = confirm("清空？");
		if (reset == true)
			return true;
		else return false;

	})
});

//字数限制50
function checkLength(which) {
	var maxChars = 50;
	if (which.value.length > maxChars)
		which.value = which.value.substring(0, maxChars);
	var curr = maxChars - which.value.length;
	document.getElementById("size").innerHTML = curr.toString();
}

$(function() {
	$('.theme-login').click(function(){
		$('.theme-popover-mask').fadeIn(100);
		$('.theme-popover').slideDown(200);
	})

	$('.theme-poptit .close').click(function(){
		$('.theme-popover-mask').fadeOut(100);
		$('.theme-popover').slideUp(200);
	})
})
