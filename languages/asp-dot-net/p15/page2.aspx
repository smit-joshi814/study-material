<%@ Page Language="C#" AutoEventWireup="true" CodeFile="page2.aspx.cs" Inherits="page2" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Enter Catagory Name"></asp:Label>
        &nbsp;<asp:TextBox ID="catN" runat="server"></asp:TextBox>
        <br /><br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="adCat" runat="server" Text="Add" OnClick="adCat_Click" />

        &nbsp;&nbsp;&nbsp;
        <asp:Button ID="upd" runat="server" OnClick="upd_Click" Text="Update" ToolTip="Will Update The Selected Item With The Item Entered In The Box" />
        &nbsp;&nbsp;&nbsp;
        <asp:Button ID="del" runat="server" Text="Delete" OnClick="del_Click" />

        <br /><br /><br /><br />
        <asp:Label ID="Label2" runat="server" Text="Select Catagory"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp; <asp:DropDownList ID="sCat" runat="server" OnSelectedIndexChanged="sCat_SelectedIndexChanged">
        </asp:DropDownList>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="Enter Product Name"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp; <asp:TextBox ID="pName" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label4" runat="server" Text="Products"></asp:Label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:DropDownList ID="sProd" runat="server"></asp:DropDownList>
        <br />
        <br />

        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="adPro" runat="server" Text="Add" OnClick="adPro_Click" />
    
    &nbsp;&nbsp;&nbsp;
        <asp:Button ID="updPro" runat="server" Text="Update" OnClick="updPro_Click" />
&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button2" runat="server" Text="Delete" OnClick="Button2_Click" />
    
    </div>
    </form>
</body>
</html>
