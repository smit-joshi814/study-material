<%@ Page Language="C#" AutoEventWireup="true" CodeFile="pr15.aspx.cs" Inherits="pr15" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
                <asp:datalist ID="Datalist1" runat="server" OnCancelCommand="Datalist1_CancelCommand" OnEditCommand="Datalist1_EditCommand" OnItemCommand="Datalist1_ItemCommand">
                    <HeaderTemplate>
                        <asp:Label ID="Label1" runat="server" Text="ID"></asp:Label>
                        <asp:Label ID="Label2" runat="server" Text="CUSTOMER NAME"></asp:Label>
                        <asp:Label ID="Label3" runat="server" Text="CUSTOMER NUMBER"></asp:Label>
                    </HeaderTemplate>
                    <ItemTemplate>
                        <asp:Label ID="Label1" runat="server" Text='<%# Eval("Id") %>'></asp:Label>
                        <asp:Label ID="Label2" runat="server" Text='<%# Eval("CustName") %>'></asp:Label>
                        <asp:Label ID="Label3" runat="server" Text='<%# Eval("CustNum") %>'></asp:Label>
                        <asp:LinkButton ID="LinkButton1" runat="server" CommandName="edit">Edit</asp:LinkButton>
                        <asp:LinkButton ID="LinkButton2" runat="server" CommandName="Delete">delete</asp:LinkButton>
                    </ItemTemplate>
                    <FooterTemplate>
                        <asp:Label ID="Label2" runat="server" Text="Customer Name"></asp:Label>
                        <asp:TextBox ID="txtnewName" runat="server"></asp:TextBox>
                        <br />
                        <asp:Label ID="Label3" runat="server" Text="Customer Number"></asp:Label>
                        <asp:TextBox ID="txtnewNum" runat="server"></asp:TextBox>
                        <br />
                        <asp:LinkButton ID="LinkButton3" runat="server" CommandName="insert">Insert</asp:LinkButton>
                    </FooterTemplate>
                    <EditItemTemplate>
                        <asp:Label ID="lblId" runat="server" Text='<%# Eval("Id") %>'></asp:Label>
                        <asp:TextBox ID="txtName" runat="server" Text='<%# Eval("CustName") %>'></asp:TextBox>
                        <asp:TextBox ID="txtNum" runat="server" Text='<%# Eval("CustNum") %>'></asp:TextBox>
                        <asp:LinkButton ID="LinkButton1" runat="server" CommandName="Update">Update</asp:LinkButton>
                        <asp:LinkButton ID="LinkButton2" runat="server" CommandName="cancel">Cancel</asp:LinkButton>
                    </EditItemTemplate>
                </asp:datalist>    
    </div>
    </form>
</body>
</html>

