<%@ Page Language="C#" AutoEventWireup="true" CodeFile="p16.aspx.cs" Inherits="newpage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style>
         td,th {
           border:1px inset black;
           text-align:center;
        }
          tr:hover {
            background-color:#c5c5c5;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:Button ID="Button1" runat="server" Text="Show" OnClick="Button1_Click" />    
    </div>
    </form>
</body>
</html>
