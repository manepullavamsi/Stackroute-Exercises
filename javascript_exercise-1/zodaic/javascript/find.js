function display()
{


var text=document.getElementById("input1").value;

if(text.toLowerCase()==="aries")
{

document.write('<center><img src="images/aries.jpg" title="aries" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Aries</h1></center>");
}
else if(text.toLowerCase()==="aquarius")
{

document.write('<center><img src="images/Aquarius.jpg" title="aries" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Aquarius</h1></center>");
}
else if(text.toLowerCase()==="cancer")
{

document.write('<center><img src="images/Cancer.jpg" title="Cancer" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Cancer</h1></center>");
}
else if(text.toLowerCase()==="capricorn")
{

document.write('<center><img src="images/capricorn.jpg" title="Capricorn" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Capricorn</h1></center>");
}
else if(text.toLowerCase()==="gemini")
{

document.write('<center><img src="images/Gemini.jpg" title="Gemini" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Gemini</h1></center>");
}
else if(text.toLowerCase()==="libra")
{

document.write('<center><img src="images/lebra.jpeg" title="Lebra" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Lebra</h1></center>");
}
else if(text.toLowerCase()==="leo")
{

document.write('<center><img src="images/Leo.jpg" title="Leo" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Leo</h1></center>");
}
else if(text.toLowerCase()==="pisces")
{

document.write('<center><img src="images/pisces.jpg" title="pisces" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Pisces</h1></center>");
}
else if(text.toLowerCase()==="sagittarius")
{

document.write('<center><img src="images/Sagittarius.jpg" title="Sagittarius" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Sagittarius</h1></center>");
}
else if(text.toLowerCase()==="scorpio")
{

document.write('<center><img src="images/scorpio.jpg" title="scorpio" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Scorpio</h1></center>");
}
else if(text.toLowerCase()==="taurus")
{

document.write('<center><img src="images/taurus.jpg" title="taurus" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Taurus</h1></center>");
}
else if(text.toLowerCase()==="virgo")
{

document.write('<center><img src="images/virgo.jpg" title="virgo" height=1000vh width=1000vw margin=0 opacity=0.5/>');
document.write("<h1>Virgo</h1></center>");
}
else{
    document.write("<center><h1 style='color:red'> Opps Sorry !! please try again by refreshing or check spelling...</h1>")
}




}