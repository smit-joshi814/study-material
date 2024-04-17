<%@ Page Language="C#" AutoEventWireup="true" CodeFile="pr13.aspx.cs" Inherits="pr13" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:GridView ID="GridView1" runat="server"></asp:GridView>    
        <br />
        <asp:Button ID="Button1" runat="server" Text="Write" OnClick="Button1_Click" />
        <asp:Button ID="Button2" runat="server" Text="Read" OnClick="Button2_Click" />
    </div>
    </form>
</body>
</html>
