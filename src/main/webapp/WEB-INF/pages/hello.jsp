<html>
<head>
	<script src="${pageContext.request.contextPath}/resources/jquery/dist/jquery.min.js"></script>
</head>
<body>
�׽�Ʈ
<script>
	var contextPath = "${pageContext.request.contextPath}";
	$(function() {

		var reply1 = {idx:1,content:'reply1',regDate:'regDate1',modDate:'modDate1',user:{idx:1,name:'test1'}};
		var reply2 = {idx:2,content:'reply2',regDate:'regDate2',modDate:'modDate2',user:{idx:2,name:'test2'}};
		var reply3 = {idx:3,content:'reply3',regDate:'regDate3',modDate:'modDate3',user:{idx:3,name:'test3'}};
		var reply4 = {idx:4,content:'reply4',regDate:'regDate4',modDate:'modDate4',user:{idx:4,name:'test4'}};
		var complexObject = {test1:reply1, test2:reply2, test3:reply3, test4:reply4}
		$.ajax({
			url : contextPath + "/complexTest2",
			type : "post",
			async : false,
			data : JSON.stringify({complexObject:complexObject}),
			contentType: 'application/json',
			dataType:"json"
		}).done(function(response){
			console.log(response);
		});

		/*var complexObject = {test1:[{name:'name11',value:'value11'},{name:'name12',value:'value12'},{name:'name13',value:'value13'}]
							,test2:[{name:'name21',value:'value21'},{name:'name22',value:'value22'}]
							,test3:[{name:'name31',value:'value31'}]
							,test4:[{name:'name41',value:'value41'},{name:'name42',value:'value42'},{name:'name43',value:'value43'}]}
		$.ajax({
			url : contextPath + "/complexTest",
			type : "post",
			async : false,
			data : JSON.stringify({complexObject:complexObject}),
			contentType: 'application/json',
			dataType:"json"
		}).done(function(response){
			console.log(response);
		});*/

		/*var reply = {idx:3,content:'reply3',regDate:'regDate3',modDate:'modDate3',user:{idx:2,name:'test'}};
		var post = {idx:2,subject:'subject2',content:'content2',regDate:'regDate2',modDate:'modDate2',user:{idx:1,name:'ksb'},replies:[reply]};
		var board = {idx:1,name:'name1',description:'description1',regDate:'regDate1',modDate:'modDate1',posts:[post]};
		$.ajax({
			url : contextPath + "/post1test",
			type : "post",
			async : false,
			data : JSON.stringify({board:board}),
			contentType: 'application/json',
			dataType:"json"
		}).done(function(response){
			console.log(response);
		});*/

	})
</script>
</body>
</html>