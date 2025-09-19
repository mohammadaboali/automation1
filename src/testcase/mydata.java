package testcase;

import java.util.Random;

public class mydata {
	String[] thefirstnamelist = {"mohammad","bilal","waleed","abdo","mazen"};
	String[] thelasttnamelist = {"ali","amaar","danial","shahbor","rashed"};

	
Random rand = new Random();
int indoffirstname=rand.nextInt(thefirstnamelist.length);
int indoflasttname=rand.nextInt(thelasttnamelist.length);

String thefirstname= thefirstnamelist[indoffirstname];
String thelasttname= thelasttnamelist[indoflasttname];
int numemail = rand.nextInt(19000);
String domain="@gmail.com";
String theemail = thefirstname+thelasttname+numemail+domain;
String thetelephone = "0796564856";
String thefax = "123321";
String theadress = "sportcity";
int rancountry = rand.nextInt(0,30);
int rancity = rand.nextInt(0,10);
String thezip = "00962";
String theloginname= thefirstname+indoflasttname+numemail;
String thepassword = "p@$$word";
String expectedmessage="Your Account Has Been Created!";


	


}
