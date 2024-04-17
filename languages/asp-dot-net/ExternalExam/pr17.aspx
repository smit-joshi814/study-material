<%@ Page Language="C#" AutoEventWireup="true" CodeFile="pr17.aspx.cs" Inherits="pr17" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <table border="1">
        <asp:ListView ID="ListView1" runat="server" OnItemCanceling="ListView1_ItemCanceling" OnItemEditing="ListView1_ItemEditing" OnPreRender="ListView1_PreRender" >
            <LayoutTemplate>
                    <tr>
                        <td>ID</td>
                        <td>CustName</td>
                        <td>CustNum</td>
                    </tr>
                <tr id="ItemPlaceholder" runat="server"></tr>
                <tr>
                    <td>
                    <asp:DataPager ID="DataPager1" runat="server" PageSize="2">
                        <Fields>               
                          <asp:NumericPagerField />
                        </Fields>
                    </asp:DataPager>
                        </td>
                </tr>
            </LayoutTemplate>
            <ItemTemplate>
                <tr>
                    <td><asp:Label ID="Label1" runat="server" Text='<%# Eval("Id") %>'></asp:Label></td>
                    <td><asp:Label ID="Label2" runat="server" Text='<%# Eval("ProductName") %>'></asp:Label></td>
                    <td><asp:Label ID="Label3" runat="server" Text='<%# Eval("cid") %>'></asp:Label></td>
                    <td><asp:LinkButton ID="LinkButton1" runat="server" CommandName="edtbtn">Edit</asp:LinkButton></td>
                    <td><asp:LinkButton ID="LinkButton2" runat="server" CommandName="delbtn">Delete</asp:LinkButton></td>
                </tr>
            </ItemTemplate>
            <EditItemTemplate>
                 <tr>
                    <td><asp:Label ID="Label1" runat="server" Text='<%# Eval("Id") %>'></asp:Label></td>
                   <td><asp:TextBox ID="TextBox1" runat="server" Text='<%# Eval("ProductName") %>'></asp:TextBox></td>
                     <td><asp:TextBox ID="TextBox2" runat="server" Text='<%# Eval("cid") %>'></asp:TextBox></td>
                    <td><asp:LinkButton ID="LinkButton1" runat="server" CommandName="upd">update</asp:LinkButton></td>
                    <td><asp:LinkButton ID="LinkButton2" runat="server" CommandName="cel">cancel</asp:LinkButton></td>
                </tr>
            </EditItemTemplate>
        </asp:ListView>
            </table>
    </div>
    </form>
</body>
</html>
