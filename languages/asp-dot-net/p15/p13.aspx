﻿<%@ Page Language="C#" AutoEventWireup="true" CodeFile="p13.aspx.cs" Inherits="p13" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:GridView ID="GridView1" runat="server">
        </asp:GridView>
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Read" />
        <br />
        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Write" />
    
    </div>
    </form>
</body>
</html>
