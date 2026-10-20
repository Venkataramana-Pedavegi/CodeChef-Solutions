<!DOCTYPE html>
<html>
<head>
  <title><%= title %></title>
</head>
<body>
  <!-- this is how we import components from other files in other directory -->
  <%- include('partials/navbar') %>

  <%- body %>
</body>
</html>
