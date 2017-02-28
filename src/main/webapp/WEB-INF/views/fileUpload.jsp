<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>File upload example</h3>
	
	<form action="upload" method="POST" enctype="multipart/form-data">
		File to Upload: <input type="file" name="file"/>
		
		<br/> <br/>
		<input type="submit" value="Upload" /> Press here to upload file!
	</form>

</body>
</html>