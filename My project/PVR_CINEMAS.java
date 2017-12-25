import java.io.*;
import java.util.*;
public class PVR_CINEMAS
{
public static void main(String args[])throws IOException
{
System.out.println("88888888ba   8b           d8  88888888ba        ,ad8888ba,   88  888b      88  88888888888  88b           d88         db         ad88888ba   ");
System.out.println("88      '8b  `8b         d8'  88      '8b      d8''    `'8b  88  8888b     88  88           888b         d888        d88b       d8'     '8b ");
System.out.println("88      ,8P   `8b       d8'   88      ,8P     d8'            88  88 `8b    88  88           88`8b       d8'88       d8'`8b      Y8,          ");
System.out.println("88aaaaaa8P'    `8b     d8'    88aaaaaa8P'     88             88  88  `8b   88  88aaaaa      88 `8b     d8' 88      d8'  `8b     `Y8aaaaa,    ");
System.out.println("88'''''''       `8b   d8'     88''''88'       88             88  88   `8b  88  88'''''      88  `8b   d8'  88     d8YaaaaY8b      `'''''8b,  ");
System.out.println("88               `8b d8'      88    `8b       Y8,            88  88    `8b 88  88           88   `8b d8'   88    d8''''''''8b           `8b  ");
System.out.println("88                `888'       88     `8b       Y8a.    .a8P  88  88     `8888  88           88    `888'    88   d8'        `8b  Y8a     a8P ");
System.out.println("88                 `8'        88      `8b       `'Y8888Y''   88  88      `888  88888888888  88     `8'     88  d8'          `8b  'Y88888P'   ");
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
String movie,st;
int quantity,F=0;
int i=0,date,sum=0,amount,category,a=0;
int beverage,total_beverage;
int snack,total_snack=0,fd=0,total_fd,d,total_d;
String size,city;
char ch;
String ans="xxx";
String ans2="quit";
do
{
System.out.println("************WELCOME TO PVR CINEMAS************");
System.out.println("**********************************************");
System.out.println();
Date date1=new Date();
System.out.println("                                                                                   "+date1);
System.out.println("CHOOSE YOUR MOVIE");
int list[]=new int[6];
int cost[]=new int[6];
System.out.println("SELECT YOUR CITY. ENTER THE NAME OF YOUR CITY");
System.out.println("----------------------------------------------------------");
System.out.println("1: Kanpur");
System.out.println("2: Mumbai");
System.out.println("3: Delhi");
System.out.println("4: Bangalore");
System.out.println("5: Chennai");
city=ob.readLine();
System.out.println();
System.out.println();
System.out.println("Select your Category.Enter the correct number for your choice");
System.out.println("-------------------------------------------------------------");
System.out.println("1: PVR "+city+" Classic cinemas");
System.out.println("2: PVR "+city+" Mega Mall");
category=Integer.parseInt(ob.readLine());
System.out.println();
System.out.println();
System.out.println("You Can Also Avail Our New Feature Of Mobile or Internet Booking");
System.out.println("For Mobile Booking,contact 8888888888.* Premium Rates Apply");
System.out.println("For Internet Booking,visit :- http;//www.pvrcinemas.com");
System.out.println();
System.out.println();
System.out.println("SELECT YOUR DATE. ENTER THE CORRECT NUMBER FOR YOUR CHOICE");
System.out.println("1. Friday,5 October 2012");
System.out.println("2. Saturday,6 October 2012");
System.out.println("3. Sunday,7 October 2012");
System.out.println("4. Monday,8 October 2012");
System.out.println("5. Tuesday,9 October 2012");
System.out.println("6. Wednesday,10 October 2012");
System.out.println("7. Thursday,11 October 2012");
date=Integer.parseInt(ob.readLine());
System.out.println();
System.out.println();
System.out.println("Please enter your number of tickets");
quantity=Integer.parseInt(ob.readLine());
System.out.println();
switch(category)
{
case 1:
System.out.println("****NOW SHOWING****");
System.out.println();
System.out.println("KURBAAN(A)                      10:15am,1:00pm,4:00pm,9:15pm");
System.out.println("TWILIGHT(U/A)                   12:15pm,4:00pm,6:15pm");
System.out.println("A CHRISTMAS CAROL(U)            3:20pm");
System.out.println("TUM MILE(U/A)                   6:15pm,9:20");
System.out.println("2012(U/A)                       10:00am,6:20pm");
System.out.println("AJAB PREM KI GAJAB KAHANI(U/A)  1:05pm,4:00pm");
System.out.println("ALL THE BEST(U/A)               3:40pm");
System.out.println();
System.out.println("Enter the name for your selected movie");
movie=ob.readLine();
cost[i]=110;
sum=sum+110;
System.out.println("The total cost is Rs."+(quantity*110));
System.out.println("Your Seat number/s is/are:");
for(i=1;i<=quantity;i++)
System.out.print(17+i+",");
break;
case 2:
System.out.println("****NOW SHOWING****");
System.out.println();
System.out.println("KURBAAN(A)                      10:15am,1:00pm,4:00pm,9:15pm");
System.out.println("TWILIGHT(U/A)                   12:15pm,4:00pm,6:15pm");
System.out.println("A CHRISTMAS CAROL(U)            3:20pm");
System.out.println("TUM MILE(U/A)                   6:15pm,9:20");
System.out.println("2012(U/A)                       10:00am,6:20pm");
System.out.println("AJAB PREM KI GAJAB KAHANI(U/A)  1:05pm,4:00pm");
System.out.println("ALL THE BEST(U/A)               3:40pm");
System.out.println();
System.out.println("Enter the name for your selected movie");
movie=ob.readLine();
cost[i]=150;
sum=sum+150;
System.out.println("The total cost is Rs."+(quantity*150));
System.out.println("Your Seat number/s is/are:");
for(i=1;i<=quantity;i++)
System.out.print(56+i+",");
break;
default:
System.out.println("The entered number should be either 1 or 2");
System.out.println();
System.out.println("To quit enter 'xxx' ");
ans=ob.readLine();
}
}
while(!(ans.equalsIgnoreCase("xxx")));
System.out.println("*******************THANK YOU*******************");

do
{
System.out.println("WELCOME TO THE SNACK BAR OF PVR!!!");
System.out.println();
System.out.println();
System.out.println("STALL 1");
System.out.println("Beverages");
System.out.println("CHILLED");
System.out.println("1: Coca cola");
System.out.println("2: Sprite");
System.out.println("3: Frooty");
System.out.println("4: Pepsi");
System.out.println("5: Seven up");
System.out.println("6: Cold Coffee");
System.out.println("7: Iced Tea");
System.out.println("8: Chocolate Krushers");
System.out.println("9: Strawberry Krushers");
System.out.println("10: Lemon n' ice Tea");
System.out.println();
System.out.println("PIPING HOT DRINKS");
System.out.println("11: Tea(Regular)");
System.out.println("12: Hot Lemon tea");
System.out.println("Choose your beverage.Enter the correct number for your choice");
beverage=Integer.parseInt(ob.readLine());
System.out.println("Enter the total no. of beverages you want to buy");
total_beverage=Integer.parseInt(ob.readLine());
if(beverage>=1 && beverage<=7)
System.out.println("Total Cost is Rs. "+ (total_beverage*45));
else
if(beverage>=8 && beverage<=10)
System.out.println("Total Cost is Rs. "+ (total_beverage*55));
else
if(beverage>=11 && beverage<=12)
System.out.println("Total Cost is Rs. "+ (total_beverage*65));
System.out.println();
System.out.println("STALL 2");
System.out.println("QUICK BITES");
System.out.println("18: Pop Corn(Regular)");
System.out.println("19: Pop Corn(Cheese)");
System.out.println("20: Pop Corn(Caramel)");
System.out.println("21: Pop Corn(Tangy Tomato)");
System.out.println("22: Veg Samosa(2 pcs.)");
System.out.println("23: Veg Puff");
System.out.println("24: Veg Quiche");
System.out.println("25: Veg Pizza");
System.out.println("26: Veg Croissant");
System.out.println("27: Veg Burger");
System.out.println("28: French Fries");
System.out.println("29: Chicken Puff Roll");
System.out.println("30: Multi Grain Chicken Sandwich");
System.out.println("31: Foccaccia Chicken Sandwich");
System.out.println("32: Chicken Sandwich");
System.out.println("Choose your snack.Enter the correct number for your choice");
snack=Integer.parseInt(ob.readLine());
System.out.println("Enter the total no. of snacks you want to buy");
total_snack=Integer.parseInt(ob.readLine());
if(snack>=18&& snack<=21)
{
System.out.println("Enter 'S for small,'M'for medium and 'L'for Large");
size=ob.readLine();
if(size.equalsIgnoreCase("S"))
{
amount=total_snack*45;
System.out.println("Total cost in Rs. "+amount);
}
else
if(size.equalsIgnoreCase("M"))
{
amount=total_snack*55;
System.out.println("Total cost in Rs. "+amount);
}
else
if(size.equalsIgnoreCase("L"))
{
amount=total_snack*65;
System.out.println("Total cost in Rs. "+amount);
}
}
else if(snack>=22&& snack<=23) 
{
amount=total_snack*40;
System.out.println("Total cost in Rs. "+amount);
}
else if(snack>=24&& snack<=25) 
{
amount=total_snack*65;
System.out.println("Total cost in Rs. "+amount);
}
else if(snack>=26&& snack<=27) 
{
amount=total_snack*75;
System.out.println("Total cost in Rs. "+amount);
}
else if(snack==28) 
{
amount=total_snack*35;
System.out.println("Total cost in Rs. "+amount);
}
else if(snack>=29&& snack<=31) 
{
amount=total_snack*95;
System.out.println("Total cost in Rs. "+amount);
}
else if(snack==32) 
{
amount=total_snack*105;
System.out.println("Total cost in Rs. "+amount);
}

System.out.println("STALL 3");
System.out.println();
System.out.println("Main Course");
System.out.println("33. Pav Bhaji");
System.out.println("34. Chole Bature");
System.out.println("35. Schezwan Fried Rice");
System.out.println("36. Chicken Biryani");
System.out.println("37. Chicken Noodles");
System.out.println("Choose your Main Course.Enter the correct number for your choice");
fd=Integer.parseInt(ob.readLine());
System.out.println("Enter the total number of items you want to buy");
total_fd=Integer.parseInt(ob.readLine());
if(fd==33||fd==34)
{
amount=total_fd*46;
System.out.println("Total cost in Rs. "+amount);
}
else if(fd==35) 
{
amount=total_fd*60;
System.out.println("Total cost in Rs. "+amount);
}
else if(fd==36||fd==37) 
{
amount=total_fd*86;
System.out.println("Total cost in Rs. "+amount);
}
System.out.println("Are you intrested in proceeding to the next stall - DESSERTS ?");
System.out.println("Answer in YES or NO");
st=ob.readLine();
if(st.equalsIgnoreCase("YES"))
{
System.out.println("STALL 4");
System.out.println();
System.out.println("Melting Moments");
System.out.println("38. Banana Chocolate Mousse");
System.out.println("39. Banana Caramel Pie");
System.out.println("40. Chocolate/Walnut Brownie");
System.out.println("41. Chocolate Doughnut");
System.out.println("42. Marble Cake");
System.out.println("43. Mocha Magic");
System.out.println("44. Black Forest Gateaux");
System.out.println("Choose your Desserts.Enter the correct number for your choice");
d=Integer.parseInt(ob.readLine());
System.out.println("Enter the total number of items you want to buy");
total_d=Integer.parseInt(ob.readLine());
if(d==38||d==39)
{
amount=total_d*55;
System.out.println("Total cost in Rs. "+amount);
}
else if(d==40||d==41) 
{
amount=total_d*45;
System.out.println("Total cost in Rs. "+amount);
}
else if(d==42) 
{
amount=total_d*60;
System.out.println("Total cost in Rs. "+amount);
}
else if(d==43||d==44) 
{
amount=total_d*65;
System.out.println("Total cost in Rs. "+amount);
}
}
}
while(!(st.equalsIgnoreCase("NO")));
System.out.println("THANK YOU");
System.out.println();
System.out.println();
System.out.println();
System.out.println("CANCELLATION OF TICKETS");
System.out.println("If You want to cancel tickets, enter '1' else enter '2'");
a=Integer.parseInt(ob.readLine());
if(a==1)
{
System.out.println("You have chosen to cancel the tickets");
canceltickets();
}
else if(a==2)
{
System.out.println("You have chosen not to cancel the tickets");
System.out.println("THANK YOU");
System.out.println();
System.out.println("888888888888  88                          88888888888                        88");
System.out.println("     88       88                          88                                 88");
System.out.println("     88       88                          88                                 88");
System.out.println("     88       88,dPPYba,    ,adPPYba,     88aaaaa      8b,dPPYba,    ,adPPYb,88");
System.out.println("     88       88P'    '8a  a8P_____88     88'''''      88P'   `'8a  a8'    `Y88");
System.out.println("     88       88       88  8PP'''''''     88           88       88  8b       88");
System.out.println("     88       88       88  '8b,   ,aa     88           88       88  '8a,   ,d88");
System.out.println("     88       88       88   `'Ybbd8''     88888888888  88       88   `'8bbdP'Y8");
System.out.println();
System.out.println();
}
else
System.out.println("Invalid choice");
}
public static void canceltickets()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
int category,quantity,seat_no;
String date,movie,show_time;
System.out.println("Today's date: 20, October 2012");
System.out.println("Time:5:00pm");
System.out.println("You cannot cancel your tickets for any show before this timimg");
System.out.println("In which category would you like to cancel the tickets ?");
System.out.println();
System.out.println("1. Classic Cinemas");
System.out.println("2. Mega Mall");
category=Integer.parseInt(ob.readLine());
switch(category)
{
case 1 :
System.out.println("PVR CLASSIC CINEMAS");
System.out.println("Enter the date of cancellation");
date=ob.readLine();
System.out.println("Please enter tha name of the movie you would like to cancel");
movie=ob.readLine();
System.out.println("Please enter the show timings");
show_time=ob.readLine();
System.out.println("Please enter the quantity of tickets");
quantity=Integer.parseInt(ob.readLine());
System.out.println("Please enter the seat numbers.Press Enter after entering each seat no.");
for(int i=0;i<quantity;i++)
seat_no=Integer.parseInt(ob.readLine());
System.out.println();
System.out.print("Your tickets have been successfully cancelled");

break;
case 2:
System.out.println("PVR Mega Mall");
System.out.println("Enter the date of cancellation");
date=ob.readLine();
System.out.println("Please enter the name of the movie you would like to cancel");
movie=ob.readLine();
System.out.println("Please enter the show timings");
show_time=ob.readLine();
System.out.println("Please enter the no. of tickets");
quantity=Integer.parseInt(ob.readLine());
System.out.println("Please enter the seat numbers.Press Enter after entering each seat no.");
for(int i=0;i<quantity;i++)
seat_no=Integer.parseInt(ob.readLine());
System.out.println();
System.out.print("Your tickets have been successfully cancelled");
break;
}
System.out.println("888888888888  88                          88888888888                        88");
System.out.println("     88       88                          88                                 88");
System.out.println("     88       88                          88                                 88");
System.out.println("     88       88,dPPYba,    ,adPPYba,     88aaaaa      8b,dPPYba,    ,adPPYb,88");
System.out.println("     88       88P'    '8a  a8P_____88     88'''''      88P'   `'8a  a8'    `Y88");
System.out.println("     88       88       88  8PP'''''''     88           88       88  8b       88");
System.out.println("     88       88       88  '8b,   ,aa     88           88       88  '8a,   ,d88");
System.out.println("     88       88       88   `'Ybbd8''     88888888888  88       88   `'8bbdP'Y8");
}
}