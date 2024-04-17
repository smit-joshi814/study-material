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
        td:hover {
            color:aqua;
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
        <asp:Button ID="Button1" runat="server" Text="ShowData" OnClick="Button1_Click" />
    </div>
    </form>
</body>
</html>
