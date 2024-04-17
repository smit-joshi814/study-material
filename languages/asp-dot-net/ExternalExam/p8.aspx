<%@ Page Language="C#" AutoEventWireup="true" CodeFile="p8.aspx.cs" Inherits="p8" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
       <asp:Label ID="Label1" runat="server" Text="Enter Name"></asp:Label><asp:TextBox ID="TextBox1" runat="server" ToolTip="Enter Name"></asp:TextBox>  
        <asp:RequiredFieldValidator ID="RequiredFieldValidator1" ControlToValidate="Textbox1" runat="server" Text="Field Can't Be Empty" ErrorMessage="Fill Name First"></asp:RequiredFieldValidator>
        <br /><br />
        <asp:Label ID="Label2" runat="server" Text="Enter Address"></asp:Label><asp:TextBox ID="TextBox2" runat="server" TextMode="MultiLine" ToolTip="Enter Address"></asp:TextBox>
        <asp:RequiredFieldValidator ID="RequiredFieldValidator2" ControlToValidate="Textbox2" runat="server" Text="Field Can't Be Empty" ErrorMessage="Fill Address First"></asp:RequiredFieldValidator>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="Enter Email"></asp:Label><asp:TextBox ID="TextBox3" runat="server" TextMode="Email" ToolTip="Enter Email"></asp:TextBox>
        <asp:RequiredFieldValidator ID="RequiredFieldValidator4" ControlToValidate="Textbox3" runat="server" Text="Field Can't Be Empty" ErrorMessage="Fill Email First"></asp:RequiredFieldValidator>
        <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ErrorMessage="Enter Correct Email" ControlToValidate="TextBox3" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>
        <br /><br />
        <asp:Label ID="Label4" runat="server" Text="Enter Percentage"></asp:Label><asp:TextBox ID="TextBox4" runat="server" Text TextMode="Number" ToolTip="Enter Percentage"></asp:TextBox>
        <asp:RequiredFieldValidator ID="RequiredFieldValidator3" ControlToValidate="Textbox4" runat="server" Text="Field Can't Be Empty" ErrorMessage="Fill percantage First"></asp:RequiredFieldValidator>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Text="Button" />

        <asp:ValidationSummary ID="ValidationSummary1" runat="server" />
    </div>
    </form>
</body>
</html>
