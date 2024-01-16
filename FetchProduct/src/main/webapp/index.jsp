<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Add Product</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

form {
	background-color: #ffffff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

label {
	display: block;
	margin-bottom: 8px;
}

input {
	width: 100%;
	padding: 8px;
	margin-bottom: 16px;
	box-sizing: border-box;
}

button {
	background-color: #4caf50;
	color: #ffffff;
	padding: 10px 15px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}
</style>
</head>
<body>

	<form action="ProductServlet" method="post">
		<h2>Add Product</h2>

		<label for="productName">Product Name:</label> <input type="text"
			id="productName" name="productName" required> <label
			for="productPrice">Product Price:</label> <input type="number"
			id="productPrice" name="productPrice" required> <label
			for="productPrice">Stock Quantity:</label> <input type="number"
			id="stockQuantity" name="stockQuantity" required>

		<button type="submit">Add Product</button>
	</form>

</body>
</html>
