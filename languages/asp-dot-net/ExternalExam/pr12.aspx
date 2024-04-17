<%@ Page Language="C#" AutoEventWireup="true" CodeFile="pr12.aspx.cs" Inherits="pr12" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:GridView ID="GridView1" runat="server" AllowSorting="True" AllowPaging="True" PageSize="4" OnSorting="GridView1_Sorting" OnPageIndexChanging="GridView1_PageIndexChanging"></asp:GridView>
    </div>
    </form>
</body>
</html>
