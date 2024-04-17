<%@ Page Language="C#" AutoEventWireup="true" CodeFile="p15.aspx.cs" Inherits="p15" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <asp:DataList ID="DataList1" runat="server" OnCancelCommand="DataList1_CancelCommand" OnEditCommand="DataList1_EditCommand" OnItemCommand="DataList1_ItemCommand" RepeatColumns="3" CellPadding="5" CellSpacing="10" Font-Bold="False" GridLines="Both">
            <HeaderTemplate>
                Category Information
            </HeaderTemplate>
            <ItemTemplate>
                <asp:Label ID="Label1" runat="server" Text='<%# Eval("Cid") %>'></asp:Label>
                <asp:Label ID="Label2" runat="server" Text='<%# Eval("Cname") %>'></asp:Label></br></br>
                <asp:LinkButton ID="LinkButton1" runat="server" CommandName="edit">Edit</asp:LinkButton>
                <asp:LinkButton ID="LinkButton2" runat="server" CommandName="Delete">Delete</asp:LinkButton>
            </ItemTemplate>
            <FooterTemplate>
                <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
                <asp:LinkButton ID="LinkButton3" runat="server" CommandName="Insert">insert</asp:LinkButton>
            </FooterTemplate>
            <EditItemTemplate>
                <asp:Label ID="Label3" runat="server" Text='<%# Eval("Cid") %>'></asp:Label>
                <asp:TextBox ID="TextBox2" runat="server" Text='<%# Eval("Cname") %>'></asp:TextBox>
                <asp:LinkButton ID="LinkButton4" runat="server" CommandName="Update">Update</asp:LinkButton>
                <asp:LinkButton ID="LinkButton5" runat="server" CommandName="Cancel">Cancel</asp:LinkButton>
            </EditItemTemplate>
        </asp:DataList>
    </form>
</body>
</html>
