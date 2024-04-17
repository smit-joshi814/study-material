<%@ Page Language="C#" AutoEventWireup="true" CodeFile="pr9.aspx.cs" Inherits="pr9" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:Label ID="Label1" runat="server" Text="Select category"></asp:Label>
        <asp:DropDownList ID="DropDownList1" runat="server" OnSelectedIndexChanged="DropDownList1_SelectedIndexChanged">
        </asp:DropDownList>
        <br />
         <asp:Label ID="Label2" runat="server" Text="selct Product"></asp:Label>
        <asp:DropDownList ID="DropDownList2" runat="server">
          <asp:ListItem Text="val1"></asp:ListItem>
          <asp:ListItem Text="val1"></asp:ListItem>
        </asp:DropDownList>
    </div>
    </form>
</body>
</html>
