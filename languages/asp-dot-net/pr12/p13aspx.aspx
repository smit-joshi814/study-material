<%@ Page Language="C#" AutoEventWireup="true" CodeFile="p13aspx.aspx.cs" Inherits="p13aspx" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:Button ID="Button1" runat="server" Text="Werite XML" OnClick="Button1_Click" /><br /><br />
        <asp:Button ID="Button2" runat="server" Text="Read XML" OnClick="Button2_Click" /> <br /><br /><br />
        <asp:GridView ID="GridView1" runat="server"></asp:GridView>
    </div>
    </form>
</body>
</html>
