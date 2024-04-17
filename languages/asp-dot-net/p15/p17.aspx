<%@ Page Language="C#" AutoEventWireup="true" CodeFile="p17.aspx.cs" Inherits="p17" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>PR17</title>
    
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:ListView ID="ListView1" runat="server" OnItemCanceling="ListView1_ItemCanceling" OnItemDeleting="ListView1_ItemDeleting" OnItemEditing="ListView1_ItemEditing" OnItemUpdating="ListView1_ItemUpdating" OnPreRender="ListView1_PreRender" >
            <LayoutTemplate>
                <table>
                    <tr>
                        <td>CID</td>
                        <td>CNAME</td>
                    </tr>
                    <tr id="ItemPlaceholder" runat="server"></tr>
                    <tr>
                        <td>
                            <asp:DataPager ID="DatPager1" runat="server" PageSize="2">
                                <Fields>
                                    <asp:NextPreviousPagerField ButtonType="Link" />
                                    <asp:NumericPagerField />
                                </Fields>
                            </asp:DataPager>
                        </td>
                    </tr>
                </table>
            </LayoutTemplate>
            <ItemTemplate>
                <table>
                    <tr>
                        <td>
                            <asp:Label ID="Label1" runat="server" Text='<%# Eval("Cid") %>'></asp:Label>
                            </td>
                        <td>
                            <asp:Label ID="Label2" runat="server" Text='<%# Eval("Cname") %>'></asp:Label>
                        </td>
                        <td>
                             <asp:LinkButton ID="LinkButton1" runat="server" CommandName="edit">Edit</asp:LinkButton>
                        </td>
                        <td>
                             <asp:LinkButton ID="LinkButton2" runat="server" CommandName="Delete">Delete</asp:LinkButton>
                        </td>
                    </tr>
                </table>
            </ItemTemplate>
             <EditItemTemplate>
                <asp:Label ID="Label3" runat="server" Text='<%# Eval("Cid") %>'></asp:Label>
                <asp:TextBox ID="TextBox2" runat="server" Text='<%# Eval("Cname") %>'></asp:TextBox>
                <asp:LinkButton ID="LinkButton4" runat="server" CommandName="Update">Update</asp:LinkButton>
                <asp:LinkButton ID="LinkButton5" runat="server" CommandName="Cancel">Cancel</asp:LinkButton>
            </EditItemTemplate>
        </asp:ListView>
    </div>
    </form>
</body>
</html>
