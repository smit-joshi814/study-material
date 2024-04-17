<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Pr11.aspx.cs" Inherits="Pr11" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <table border="1">
        <thead>
            <tr>
                <th>Id</th>
                <th>Product Name</th>
                <th>Cid</th>
            </tr>
        </thead>
        <tbody>
            <asp:Repeater ID="Repeater1" runat="server">
                <ItemTemplate>
            <tr>
                <td><%# Eval("id") %></td>
                <td><%# Eval("ProductName")%></td>
                <td><%# Eval("cid") %></td>
            </tr>
                    </ItemTemplate>
                </asp:Repeater>
        </tbody>
    </table>
    </div>
    </form>
</body>
</html>
