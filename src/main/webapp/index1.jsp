<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Welcome</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<style type="text/css">
.form-style-1 {
    margin:10px auto;
    max-width: 400px;
    padding: 20px 12px 10px 20px;
    font: 13px "Lucida Sans Unicode", "Lucida Grande", sans-serif;
}
.form-style-1 li {
    padding: 0;
    display: block;
    list-style: none;
    margin: 10px 0 0 0;
}
.form-style-1 label{
    margin:0 0 3px 0;
    padding:0px;
    display:block;
    font-weight: bold;
}
.form-style-1 input[type=text], 
.form-style-1 input[type=date],
.form-style-1 input[type=datetime],
.form-style-1 input[type=number],
.form-style-1 input[type=search],
.form-style-1 input[type=time],
.form-style-1 input[type=url],
.form-style-1 input[type=email],
textarea, 
select{
    box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    border:1px solid #BEBEBE;
    padding: 7px;
    margin:0px;
    -webkit-transition: all 0.30s ease-in-out;
    -moz-transition: all 0.30s ease-in-out;
    -ms-transition: all 0.30s ease-in-out;
    -o-transition: all 0.30s ease-in-out;
    outline: none;  
}
.form-style-1 input[type=text]:focus, 
.form-style-1 input[type=date]:focus,
.form-style-1 input[type=datetime]:focus,
.form-style-1 input[type=number]:focus,
.form-style-1 input[type=search]:focus,
.form-style-1 input[type=time]:focus,
.form-style-1 input[type=url]:focus,
.form-style-1 input[type=email]:focus,
.form-style-1 textarea:focus, 
.form-style-1 select:focus{
    -moz-box-shadow: 0 0 8px #88D5E9;
    -webkit-box-shadow: 0 0 8px #88D5E9;
    box-shadow: 0 0 8px #88D5E9;
    border: 1px solid #88D5E9;
}
.form-style-1 .field-divided{
    width: 49%;
}

.form-style-1 .field-long{
    width: 100%;
}
.form-style-1 .field-select{
    width: 100%;
}
.form-style-1 .field-textarea{
    height: 100px;
}
.form-style-1 input[type=submit], .form-style-1 input[type=button]{
    background: #4B99AD;
    padding: 8px 15px 8px 15px;
    border: none;
    color: #fff;
}
.form-style-1 input[type=submit]:hover, .form-style-1 input[type=button]:hover{
    background: #4691A4;
    box-shadow:none;
    -moz-box-shadow:none;
    -webkit-box-shadow:none;
}
.form-style-1 .required{
    color:red;
}
</style>
<script>
function myfunction(){
	
	if(document.getElementById("selection").value=="CVE"){
		document.getElementById("Name").disabled=false;
		document.getElementById("Comp").disabled=false;
		
	}
	else{
		document.getElementById("Name").disabled=true;
		document.getElementById("Comp").disabled=true;
	}
}
</script>
</head>

<body>
<form action="A" method="post">
<ul class="form-style-1">
    <li><label>IP <span class="required">*</span></label><input type="text" name="IP" value="192.168.3.47" class="field-divided" />&nbsp;</li>
    <li>
        <label>Type Of File<span class="required">*</span></label>
        <select name="field4" id="selection" class="field-select" onChange="myfunction()">
       <option value=""></option>
		<option value="NMap">NMap</option>
		<option value="OpenSSL">OpenSSL</option>
		<option value="CVE">CVE</option>
		<option value="table">Cipher Table</option>
        </select>
    </li>
     <li>
        <label>CVE Number :</label>
        <input type="text" name="Name" id="Name" disabled="disabled" value="2014-3570" class="field-long" />
    </li>
    <li>
        <label>CVE Component Name :</label>
        <input type="text" disabled="disabled" name="Comp" id="Comp" value="openssl" class="field-long" />
    </li>
    
    <li>
        <input type="submit" value="Submit" name="submit" />
    </li>
</ul>
</form>
<h3><font color="green"><%= request.getAttribute("Name1")%> </font></h3>
</body>
</html>
