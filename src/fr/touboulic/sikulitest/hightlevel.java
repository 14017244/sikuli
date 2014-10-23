package fr.touboulic.sikulitest;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.watij.webspec.dsl.WebSpec;


public class hightlevel {

public static void main(String[] args) {
float similarity =(float) 0.8;

int timeout =5;
Pattern winxpStartButton =new Pattern("images/winbouton.png");

Screen screen =new Screen();

if (screen.exists(winxpStartButton.similar(similarity),
timeout)!=null )
{
try
{
screen.click(winxpStartButton, 0);
}
catch(FindFailed e)
{
e.printStackTrace();
}
}

/*
WebSpec spec = new WebSpec().ie();
spec.open("http://www.google.com");
spec.find.input().with.name("q").set.value("Watij");
spec.find.input().with.type("button").with.value("Google Search").click();
//check results
spec.find.a().with.href("http://watij.com/").shouldExist();
*/



}
}