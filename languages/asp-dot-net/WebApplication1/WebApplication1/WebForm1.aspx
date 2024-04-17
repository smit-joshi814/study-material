<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication1.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    
    <div>
        <form id="form1" runat="server">
        <asp:updatepanel ID="Updatepanel1" runat="server">
            <ContentTemplate>
                <asp:Panel ID="Panel1" runat="server">

        <asp:ScriptManager ID="ScriptManager1" runat="server"></asp:ScriptManager>

        <asp:Label ID="lblfirst" runat="server" Text="enter first value"></asp:Label>
        <asp:TextBox ID="txtfirst" runat="server"></asp:TextBox>   
   
        <asp:Label ID="lblsecond" runat="server" Text="enter second value"></asp:Label>
        <asp:TextBox ID="txtsecond" runat="server"></asp:TextBox>
        <br />
        <asp:Label ID="lblans" runat="server" Text="the ans is"></asp:Label>
        <asp:TextBox ID="txtans" runat="server"></asp:TextBox>
        <br />
        <asp:Button ID="btnsum" runat="server" Text="sum" OnClick="btnsum_Click" />

</asp:Panel>
</ContentTemplate>
</asp:updatepanel>

            <asp:UpdateProgress ID="UpdateProgress1" runat="server">
                <ProgressTemplate>
                    <asp:Label ID="lblmessage" runat="server" Text="calculating.."
                        Font-Names="Arial Rounded MT Bold"
                        ForeColor="#003399">
                    </asp:Label>
                </ProgressTemplate>
            </asp:UpdateProgress>
             </div>
    </form>
</body>


</html>
