<html>

<body>
<%!
	String makeItLower(String data) {
	return data.toLowerCase();
	}
%>
Lower Case "Hello World" : <%= makeItLower("HELLo WORLD VOILA!") %>
</body>

</html>