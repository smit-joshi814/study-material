<%@ Page Language="C#" AutoEventWireup="true" CodeFile="p12.aspx.cs" Inherits="p12" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style>
       
        a {
            text-decoration:none;
        }
         
        .row {
            background-color:lightblue;
            border:1px double black;
        }
        .layout {
            text-align:center;
            display:flex;
            border:hidden;
            justify-content: space-around;  
        }
        th,td {
            padding:10px;
            width:100px;
        }
        
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:GridView ID="GridView1" runat="server" AllowPaging="True" AllowSorting="True" AutoGenerateColumns="False" OnPageIndexChanging="GridView1_PageIndexChanging" OnSorting="GridView1_Sorting" PageSize="3" CssClass="layout">
       <Columns>
           <asp:BoundField DataField="Cid" HeaderText="Cid" SortExpression="Cid" />
           <asp:BoundField DataField="Cname" HeaderText="CategoryName" SortExpression="Cname" />
       </Columns>
            <HeaderStyle CssClass="header" BackColor="Black" ForeColor="White" />
            <PagerStyle BackColor="Black" ForeColor="White" />
            <RowStyle CssClass="row" />
        </asp:GridView>
    
    </div>
    </form>
</body>
</html>
