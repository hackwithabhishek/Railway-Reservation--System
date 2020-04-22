import java.util.*; 
import java.util.Random; 
import java.io.*; 
class Rail1{ 
String passenger_name; 
String seat_choice; 
String pnr; 
String email; 
String source; 
String destination; 
String contact; 
 public void getInfo() 
{ 
Random rand = new Random(); 
int p = rand.nextInt(10000); 
pnr=Integer.toString(p); 
Scanner sc=new Scanner(System.in); 
System.out.println(""); 
System.out.println(""); 
System.out.println("");
System.out.println("           *********BOOK YOUR TICKET FOR SAFE AND HAPPY JOURNEY*********"); 
System.out.println(""); 
System.out.println(""); 
System.out.println("");
System.out.print("                          ENTER YOUR BOARDING STATION NAME: "); 
source=sc.nextLine(); 
System.out.println(""); 
System.out.print("                          ENTER YOUR DESTINATION STATION NAME: "); 
destination=sc.nextLine(); 
System.out.println(""); 
System.out.print("                          ENTER PASSENGER NAME: "); 
passenger_name=sc.nextLine(); 
System.out.println(""); 
System.out.print("                          SELECT SEAT (U/M/L): "); 
seat_choice=sc.nextLine(); 
System.out.println(""); 
System.out.print("                          ENTER YOUR E-MAIL: "); 
email=sc.nextLine(); 
System.out.println(""); 
System.out.print("                          ENTER CONTACT NUMBER: "); 
contact=sc.nextLine(); 
System.out.println(""); 
System.out.print("                          Kindly note your pnr: "+pnr); 
System.out.println(""); 
} 
} 
class book_ticket{ 
public void createFile() 
{  
Rail1 emp=new Rail1(); 
emp.getInfo(); 
try{ 
File f1=new File("file"+emp.pnr+".txt"); 
if(f1.createNewFile()) 
{ 
FileWriter myWriter = new FileWriter("file"+emp.pnr+".txt"); 
myWriter.write(
"                          PNR NO                       :"+emp.pnr+"\n"+"\n"+
"                          PASSENGER NAME               :"+emp.passenger_name+"\n"+"\n"+
"                          seat choice                  :"+emp.seat_choice+"\n"+"\n"+
"                          PASSENGER CONTACCT           :"+emp.contact+"\n"+"\n"+
"                          E-MAIL                       :"+emp.email+"\n"+"\n"+
"                          PASSENGER BOARDING STATINO   :"+emp.source+"\n"+"\n"+ 
"                          PASSENGER DESTINATION        :"+emp.destination+"\n"); 
myWriter.close(); 
System.out.println("\n           *************PASSENGER RESERVATION DONE SUCCESSFULLY*************"); 
} 
else { 
System.out.println("\n           *************PASSENGER RESERVATION ALREADY DONE*************"); 
} 
}catch(Exception e){System.out.println(e);} 
} 
} 
class cancel_ticket{ 
    public void removeFile(String ID){ 
       
    File file = new File("C:\\Users\\Lenovo\\Desktop\\java\\"+"file"+ID+".txt");    
      if(file.exists())  
       {if(file.delete()); 
         { System.out.println("                TICKET CANCELLED SUCCESSFULLY   !!!");} } 
      else 
       {  
            System.out.println("               TICKET CANCELLED SUCCESSFULLY   !!!");  
       }  
} 
} 
class update_passenger{ 
public void updateFile(String s,String o,String n) throws IOException 
{ 
 File file = new File("file"+s+".txt"); 
        Scanner sc = new Scanner(file);  
  String fileContext=""; 
    while (sc.hasNextLine())  
     { fileContext =fileContext+"\n"+sc.nextLine(); } 
        FileWriter myWriter = new FileWriter("file"+s+".txt"); 
        fileContext = fileContext.replaceAll(o,n); 
        myWriter.write(fileContext); 
myWriter.close(); 
 
} 
} 
 
class view_booking{ 
public void viewFile(String s) throws Exception 
{   
    File file = new File("file"+s+".txt");  
    Scanner sc = new Scanner(file);  
   
    while (sc.hasNextLine())  
     { System.out.println(sc.nextLine()); } 
   } 
}  
 
class RailwayReservation{ 
public static void main(String arv[]) 
{ 
Scanner sc=new Scanner(System.in); 
view_booking epv =new view_booking();  
System.out.println(""); 
System.out.println(""); 
System.out.println(""); 
System.out.println("                                    *********RAILWAY RESERVATION SYSTEM*********"); 
System.out.println(""); 
System.out.println(""); 
System.out.println(""); 
System.out.println("                          NAME      :-  ABHISHEK MISHRA");
System.out.println("");
System.out.println("                          ROLL NO.  :-  25"); 
System.out.println("");
System.out.println("                          REG NO.   :-  11804408"); 
System.out.println("");
System.out.println("                          SUBJECT   :-  CSE (310)"); 
System.out.println(""); 
System.out.println(""); 
System.out.println(""); 
int i=0; 
while(i<5) 
{ 
System.out.println(""); 
System.out.println(""); 
System.out.println("");
System.out.println("                                    *********WELCOME*********"); 
System.out.println(""); 
System.out.println(""); 
System.out.println("");
System.out.println("                          PRESS  1 TO BOOK YOUR TICKETS : "); 
System.out.println(""); 
System.out.println("                          PRESS  2 TO VIEW ALREADY BOOKED TICKET : "); 
System.out.println(""); 
System.out.println("                          PRESS  3 TO CALCLE YOUR RESERVATION : "); 
System.out.println(""); 
System.out.println("                          PRESS  4 TO CHANGE THE PASSENGER DETAILS : "); 
System.out.println(""); 
i=Integer.parseInt(sc.nextLine()); 
switch(i){ 
case 1: 
{ 
book_ticket ep =new book_ticket(); 
ep.createFile(); 
break; 
} 
case 2: 
{System.out.println("                          ENTER PNR NO. :"); 
String s=sc.nextLine(); 
try{ 
epv.viewFile(s);} 
catch(Exception e){System.out.println(e);} 
break; 
} 
case 3: 
{System.out.println("                          ENTER PNR NO. :"); 
String s=sc.nextLine(); 
cancel_ticket epr =new cancel_ticket(); 
epr.removeFile(s); 
break; 
} 
case 4: 
{ 
System.out.println("                          ENTER PNR NO.:"); 
String I=sc.nextLine();  
try{ 
epv.viewFile(I);} 
catch(Exception e){System.out.println(e);} 
update_passenger epu = new update_passenger(); 
System.out.println(""); 
System.out.println("");
System.out.println("                          ENTER THE DETAIL YOU WANT TO CHANGE :"); 
String s=sc.nextLine(); 
System.out.println("                          ENTER NEW DETAIL :"); 
String n=sc.nextLine(); 
try{epu.updateFile(I,s,n);} 
catch(IOException e){System.out.println(e);} 
} 
} 
System.out.println(""); 
System.out.println(""); 
System.out.println(""); 
System.out.println("                          ENTER 1 TO CONTINUE AND 6 TO EXIT"); 
System.out.println(""); 
System.out.println(""); 
i=Integer.parseInt(sc.nextLine()); 
} 
} 
} 