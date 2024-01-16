<%@ page import="fp.entity.Product"%>

<html>
<head>
<title>Product Details</title>
<style>
table {
	border-collapse: collapse;
	width: 50%;
	margin: 20px;
}

th, td {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

th {
	background-color: #f2f2f2;
}
</style>
</head>
<body>

	<h2>Product Details</h2>
	<%
	Product product = (Product) session.getAttribute("product");
	%>
	<table>
		<tr>
			<th>Attribute</th>
			<th>Value</th>
		</tr>
		<tr>
			<td>Name</td>
			<td><%=product.getName()%></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><%=product.getPrice()%></td>
		</tr>
		<tr>
			<td>Quantity</td>
			<td><%=product.getStockQuantity()%></td>
		</tr>
	</table>

</body>
</html>
