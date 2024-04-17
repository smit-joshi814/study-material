<%@ Page Language="C#" AutoEventWireup="true" CodeFile="p11.aspx.cs" Inherits="p11" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style>
      
       td,th {
           border:1px inset black;
           text-align:center;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:DropDownList ID="dl" runat="server">
            <asp:ListItem>Products</asp:ListItem>
            <asp:ListItem>Categories</asp:ListItem>
        </asp:DropDownList>
        <asp:Button ID="myProduct" runat="server" Text="ShowData" OnClick="Button1_Click" />
    &nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="ShowGrid" />
        <br />
        <asp:GridView ID="GridView1" runat="server">
        </asp:GridView>
    </div>
    </form>
</body>
</html>
