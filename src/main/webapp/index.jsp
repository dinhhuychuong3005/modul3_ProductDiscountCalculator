<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 29/06/2021
  Time: 3:07 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="index.css" />
  </head>
  <body>
  <div id="content">
  <h1> Product Discount Calculator</h1>
  <form action="/discount" method="post">
    <div id="data">
    <label>Product Description:</label>
    <input type="text" name="description"/><br/>
    <label>List Price: </label>
    <input type="number" name="price" value="0"/><br/>
    <label>Discount Percent:</label>
    <input type="number" name="discount_percent" value="0"/><br/>
  </div>
    <div id="buttons">
    <input type="submit" name="submit" value="Calculate Discount"/>
    </div>
  </form>
  </div>
  </body>
</html>
