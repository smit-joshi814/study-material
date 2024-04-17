<%@ Page Language="C#" AutoEventWireup="true" CodeFile="index.aspx.cs" Inherits="index" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        
        
        
                    <asp:Label ID="Label1" runat="server" Text="Enter Category"></asp:Label>
                    &nbsp;&nbsp;&nbsp;
                    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
                    
                        &nbsp;&nbsp;&nbsp;
                    
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ErrorMessage="This Field Required" ControlToValidate="TextBox1" ForeColor="Red"></asp:RequiredFieldValidator>
            
                    <br />
                    <br />
&nbsp;&nbsp;&nbsp;
            
                    <asp:Button ID="Button1" runat="server" Text="Insert" OnClick="Button1_Click" />
            
                    <br />
            
                    <asp:Label ID="Label2" runat="server" Text="Categories Avalialbe"></asp:Label>
                
                    &nbsp;&nbsp;&nbsp;
                
                    <asp:DropDownList ID="DropDownList1" runat="server"></asp:DropDownList>
            
        
    </div>
    </form>
</body>
</html>
