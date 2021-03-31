function hi()
{
var n=document.getElementById("inp").value;
var s="";
for (var i = 1;i<=10;i++)
{
	s=s+i+" x "+n+" = "+(i*n)+"<br>";
}
document.getElementById("result").innerHTML =s;
var on="index.html";
document.getElementById("clr").innerHTML="<button><a href="+on+"> clear</a></button>"
}