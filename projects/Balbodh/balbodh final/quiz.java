import java.util.*;
import java.io.*;
public class quiz
{

/**  Bal Bodh Chauhan 
 *   X-A              
 *   Seth Anadram Jaipuria School
 *   Board project-----QUIZ
 */

// Questions         

   // Science & Technology
   String sc[][] = {{"Which type of rays have the smallest wavelength??",
                      "What would you find at www.fred.net/mjj/ ??",         
                      "Which has been the largest diamond ever mined??",
                      "What is the full form for the abbreviation NASA??",                                          
                      "What part of your body would be affected from osteoporosis??",},
                     {"A)X-Rays          B)Gamma rays",                   
                      "A)Biography of Andrew Flintoff   B)UN system",        
                      "A)Cullinan        B)Pitt",                       
                      "A)Non-Administrative Space Association          B)National Associative Space Administration",
                      "A)Liver       B)Veins"},
                     {"C)Infra-Red rays  D)Alpha rays",                   
                      "C)Michael Jackson's fan club     D)Scooby-Doo movies",
                      "C)Kohinoor        D)Rocio",                      
                      "C)National Aeronautics Space Administration     D)NATO Space Association",
                      "C)Muscles     D)Bones"}};
    String anssc[][] = {{"B","C","A","C","D"},
                        {"Gamma rays","Michael Jackson's fan club","Cullinan","National Aeronautics Space Administration","Bones"}};                 
    
    // History & Geography
    String hg[][] = {{"Which cities were destroyed in the erupton of Mt.Vesuvius in 79 A.D.??",
                      "Which company owned the Titanic??",                
                      "Which is the highest freshwater lake in the world??",
                      "The name of which European country means 'Land of Rabbits'??",
                      "Which country was the first to issue coins bearing the year 2000??"},
                     {"A)Herculaneum & Pompeii      B)Alexandria & Pompeii",                  
                      "A)The Blue Star Line        B)The Red Star Line",  
                      "A)Lake Titicaca          B)Lake Baikal",             
                      "A)Finland              B)France",                             
                      "A)Australia             B)India"},
                     {"C)Delton & Herculaneum       D)Tirane & Gronzy",                       
                      "C)The White Star Line       D)The Green Star Line",
                      "C)Lake Mansarovar        D)Lake Michigan",           
                      "C)The Netherlands      D)Spain",                              
                      "C)USA                   D)France"}};
    String anshg[][] = {{"A","C","B","D","A"},
                        {"Herculaneum & Pompeii","The White Star Line","Lake Baikal","Spain","Australia"}};
    
    // Cricket
    String cr[][] = {{"By how many types can a batsman be given out in ODI's??",
                      "In a cricket innings if each batsman gets out on the first ball he plays which no. batsman would remain not out?? ",
                      "Which fielding position is also called 'Grieg Point'??",
                      "How many pieces of wood would you see on a field during a match??",
                      "Which South African cricketer is/was also known as ZULU??"},
                     {"A)8              B)9",                      
                      "A)2nd                     B)11th",                                                                                   
                      "A}Silly Point       B)Short-Leg",                       
                      "A)11               B)13",                                          
                      "A)Jacques Kallis           B)Lance Klusner"},
                     {"C)10             D)11",                
                      "C)8th                     D)10th",                                                                                   
                      "C)First Slip        D)Leg Slip",                        
                      "C)12               D)10",                                          
                      "C)Johnty Rhodes            D)Hansie Cronje"}};
    String anscr[][] = {{"C","C","A","C","B"},
                        {"10","8th","Silly Point","12","Lance Klusner"}};
    
    // Mythology
    String mt[][] = {{"Which Greek goddess shares her name with a sports company??",
                      "In Greek mythology who is the king of gods??",
                      "Which will be the 'Tenth Avatar' of Vishnu??",
                      "Which pair of gods have the same name in the Roman & Greek mythologies??",
                      "Which Indian god is also known as Rudra??"},
                     {"A)Adidas             B)Nike",
                      "A)Zeus               B)Cronus",
                      "A)Pigeon             B)Lion",
                      "A)Zeus & Mars                B)Saturn & Haydes",
                      "A)Vishnu             B)Brahma"},
                     {"C)Cupid              D)Reebok",
                      "C)Hermes             D)Hercules",
                      "C)Fish               D)Horse",
                      "C)Apollo & Uranus            D)Mercury & Hermes",
                      "C)Ganesh             D)Shiva"}};
    String ansmt[][] = {{"B","A","D","C","D"},
                        {"Nike","Zeus","Horse","Apollo & Uranus","Shiva"}};
    
    // Mixed Bag
    String mb[][] = {{"Which is the longest mountain range in the world??",
                      "Who was the American President at the time of atom bomb attack on Japan??",
                      "Which Braille sign is used in a 100-rupee note??",
                      "In the rhyme about magpies \"One for sorrow, two for joy \" what is six for??",
                      "Which was the world's first fully computer-animated feature film??"},
                     {"A)Himalayas              B)Rockies",                
                      "A)John F. Kennedy               B)Henry Truman",                           
                      "A)Square                B)Circle",                
                      "A)Jealousy                   B)Stick",                                         
                      "A)Antz                   B)A Bug's Life"},
                     {"C)Alps                   D)Andes",                  
                      "C)Thomas Jefferson              D)Abraham Lincoln",                        
                      "C)Triangle              D)Star ",                 
                      "C)Anger                      D)Wonder",                                        
                      "C)Herby                  D)Toy Story"}};
    String ansmb[][] = {{"D","A","C","A","D"},
                        {"Andes","John F. Kennedy","Triangle","Jealousy","Toy Story"}};
    // Speed Round            
    String speed[] = {"Which famous painting is also known as La Giaconda??",
                      "From which country does UN Secretary-General Kofi Annan originate??",
                      "In Archie comics what is the surname of Reggie??",
                      "What is the collective noun for a group of wolves??",
                      "On which river would one see the Aswan Dam??",
                      "Potter trivia. Whose nickname was Moony (Give the surname)??",
                      "Which comic character's best friend is Odie??",
                      "Which \"Merchant of Venice\" demanded his pound of flesh??",
                      "Insulin and testosterone are types of??",
                      "What is the Japanese art of flower arrangement called??",
                      "Which of the six noble gases has the highest atomic weight??",
                      "How many horsmen constitute a polo team?? (answer in words)",
                      "In which newspaper does Clark Kent ,Superman's alter ego,work??",
                      "Name the main river on which New York is situated??",
                      "What is the title of Adolf Hitler's autobiography??"};
    String ansspeed[] = {"Mona Lisa","Ghana","Mantle","pack","Nile",
                         "Lupin","Garfield","Shylock","Hormones","Ikebana",
                         "Radon","Four","Daily Planet","Hudson","Mein Kamph"};
                        
    // Topics          
    String topic[] = {"Science & Technology","History & Geography ","Cricket             ",
                      "Mythology           ","Mixed Bag           ","Speed Round         "};
    int score[]  = new int [6];
    int ques[] = new int [6];

    public void useThis()throws IOException // MAIN FUNCTION
    {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        
        int i,j;
        
System.out.println("                                    =====     ||      ||   ========   =========  ");
System.out.println("                                  //     \\\\   ||      ||      ||            // ");    
System.out.println("                                 ||       ||  ||      ||      ||          //     ");
System.out.println("                                 ||       ||  ||      ||      ||        //       ");
System.out.println("                                  \\\\     //    \\\\    //       ||      //     ");
System.out.println("                                    =====\\\\     ======     ========  ==========");
System.out.println("                                          \\\\                                   "); 
System.out.println("                                                                             (CREATED BY :: Bal Bodh Chauhan)");
System.out.println("                                                                             (CLASS -- X-A)");

        int c=0,s=0,ts=0,q=0,tq=0;
        
        System.out.println("\n\n");
        System.out.println("                             *****************RULES OF THE GAME***************** \n \n");
        System.out.println("o=====>  The game cosists of 6 categories of questions!!\n"+
                           "o=====>  There are 5 questions in the first five categories and 15 questions in the last category \n"
                           +"         i.e. Speed Round!!\n"+
                           "o=====>  The first 5 categories have multiple choice questions!!\n"+ 
                           "         There would be four options lettered (A,B,C,D) for each question out of which only one is correct.!!\n"+
                           "         The user can enter the choice in any case!!\n"+
                           "o=====>  The speed round cosists of 15 free answer type questions!!\n"+
                           "         The user can enter the answer in any case!!\n"+
                           "         The time limit for each question is 15 seconds!!\n"+
                           "o=====>  Follow the further directions as given!!\n\n"+
                           "                                                            BEST OF LUCK...\n"); 
        do  // Recurring Loop
        {
            System.out.println("Categories =============>>"+"\n");
            System.out.println("    Science & Technology --->1");
            System.out.println("    History & Geography --->2");
            System.out.println("    Cricket --->3");
            System.out.println("    Mythology --->4");
            System.out.println("    Mixed Bag --->5");
            System.out.println("    Speed Round --->6");
            System.out.println("Enter 7 to exit....."+"\n");
            System.out.print("Enter the choice of the category of your intrest :: ");
            String v1 = input.readLine();

            
            
            
            
            
            System.out.println("");                
            
            if(ch==1 || ch==2 || ch==3 || ch==4 || ch==5 || ch==6 || ch==7) // for preventing the entry of wrong choice
            {
                if(ch==1 || ch==2 || ch==3 || ch==4 || ch==5 || ch==7)  // for the first five categories
                {
                    q=0;
                    s=0;
                
                    for(i=0;i<5;i++)
                    {
                        for(j=0;j<3;j++)
                        {
                            if(j==0)
                            {
                                switch(ch)  // for printing the questions
                                {
                                    case 1:
                                    System.out.println("Q--"+sc[j][i]);
                                    break;
                                    case 2:
                                    System.out.println("Q--"+hg[j][i]);
                                    break;
                                    case 3:
                                    System.out.println("Q--"+cr[j][i]);
                                    break;
                                    case 4:
                                    System.out.println("Q--"+mt[j][i]);
                                    break;
                                    case 5:
                                    System.out.println("Q--"+mb[j][i]);
                                    break;
                                    case 6:
                                    break;
                                    default:
                                    System.out.println("Thank you for using this program."+"\n"+
                                    "Hope you enjoyed it!! You can save your comments in the README file.");
                                    System.exit(0);
                                }
                            }
                            else
                            {
                                switch(ch)  // for printing the options
                                {
                                    case 1:
                                    System.out.println(sc[j][i]);
                                    break;
                                    case 2:
                                    System.out.println(hg[j][i]);
                                    break;
                                    case 3:
                                    System.out.println(cr[j][i]);
                                    break;
                                    case 4:
                                    System.out.println(mt[j][i]);
                                    break;
                                    case 5:
                                    System.out.println(mb[j][i]);
                                }
                            }
                        }
                        System.out.println("");
                        System.out.print("Enter your choice :: ");
                        String v2=input.readLine().toUpperCase();
                        
                        switch(ch)  // for checking the answers
                        {
                            case 1:
                            q++;
                            tq++;
                            if(v2.equals(anssc[0][i]))
                            {
                                s++;
                                ts++;
                                System.out.println("Correct Answer"+"\n");
                            }
                            else
                            {
                                System.out.println("Wrong Answer");
                                System.out.println("Correct Answer = = "+anssc[0][i]+")"+anssc[1][i]+"\n");
                            }
                            break;
                            case 2:
                            q++;
                            tq++;
                            if(v2.equals(anshg[0][i]))
                            {
                                s++;
                                ts++;
                                System.out.println("Correct Answer"+"\n");
                            }
                            else
                            {
                                System.out.println("Wrong Answer");
                                System.out.println("Correct Answer = = "+anshg[0][i]+")"+anshg[1][i]+"\n");
                            }
                            break;
                        
                            case 3:
                            q++;
                            tq++;
                            if(v2.equals(anscr[0][i]))
                            {
                                s++;    
                                ts++;
                                System.out.println("Correct Answer"+"\n");
                            }
                            else
                            {
                                System.out.println("Wrong Answer");
                                System.out.println("Correct Answer = = "+anscr[0][i]+")"+anscr[1][i]+"\n");
                            }
                            break;
                            
                            case 4:
                            q++;
                            tq++;
                            if(v2.equals(ansmt[0][i]))
                            {
                                s++;
                                ts++;
                                System.out.println("Correct Answer"+"\n");
                            }
                            else
                            {
                                System.out.println("Wrong Answer");
                                System.out.println("Correct Answer = = "+ansmt[0][i]+")"+ansmt[1][i]+"\n");
                            }
                            break;
                        
                            case 5:
                            q++;
                            tq++;
                            if(v2.equals(ansmb[0][i]))
                            {
                                s++;
                                ts++;
                                System.out.println("Correct Answer"+"\n");
                            }
                            else
                            {
                                System.out.println("Wrong Answer");
                                System.out.println("Correct Answer = = "+ansmb[0][i]+")"+ansmb[1][i]+"\n");
                            }
                        }
                    }
                 }
                 else   // for speed round
                 {
                     s=0;
                     q=0;
                     for(int x=0;x<speed.length;x++)
                     {
                         q++;
                         tq++;
                         System.out.println("Q--"+speed[x]);
                         String m=quiz(15);
                         if(m.equals(""))
                         {
                             timer.cancel();
                             System.out.println("Correct Answer = = "+ansspeed[x]+"\n");
                             continue;
                         }
                         if(m.equalsIgnoreCase(ansspeed[x]))
                         {
                             s++;
                             ts++;
                             timer.cancel();
                             System.out.println("Correct Answer"+"\n");
                         }
                         else
                         {
                             timer.cancel();
                             System.out.println("Wrong answer");
                             System.out.println("Correct Answer = = "+ansspeed[x]);
                         }
                     }
                 }
                 score[c] = s;
                 ques[c] = q;
                 int choice[] = new int [6];
                 choice[c]=ch-1;
                 System.out.print("Do you wish to view your SCORE Card (y/n) :: ");
                 String v3 = input.readLine();
                 System.out.println("\n");
                 if(v3.equals("y"))   // for viewing the scorecard
                 {
                     System.out.println("<SCORECARD>"+"\n");                     
                     for(int p=5-c;p<=5;p++)
                     {
                     System.out.print(topic[choice[5-p]]+" ::   ");
                     System.out.println(score[5-p]+" out of "+ques[5-p]+"\n");
                     }
                     System.out.println("-------------------------------------------");
                     System.out.println("TOTAL SCORE          ::   "+ts+" out of "+tq);
                     System.out.println("-------------------------------------------"+"\n");
                 }
            }
            else    // for wrong choice 
            {   
                 System.out.println("Wrong Choice =-=-=-= TRY AGAIN");
                 System.out.println("");
            }
            c++;
            if(c==6)    // for ending the loop
            {    
                 System.out.print("Do you wish to play again......(y/n) :: ");
                 String w = input.readLine();
                 if(w.equalsIgnoreCase("n"))
                 {    
                      System.out.println("Thank you for using this program."+"\n"+
                                         "Hope you enjoyed it!! You can save your comments in the README file.");
                      System.exit(0);
                 }
            }
            
        }while(1>0);
    }
    public String speed()throws IOException
    {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.print("Enter your ANSWER :: ");
        String m=input.readLine();
        return m;
    }
    static Timer timer;
    public String quiz(int seconds)throws IOException   // Timer Function
    {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
        String m=speed();
        return m;
    }
    class RemindTask extends TimerTask 
    {
        public void run() 
        {
            timer.cancel();        
            System.out.println("\n"+"Time Up!!");
            System.out.print("Press ENTER to view this question's answer & to go to the next question........");
        }
    }
    
//  VARIABLE DECLERATION
//      String variables :
//          sc,hg,cr,mt,mb,speed------>for storing the questions
//          anssc,anshg,anscr,ansmt,ansmb,ansspeed------>for storing the answers of the questions
//          topic------>storing the topics
//          v1,v2,v3,m,w------>for storing the inputs
//      Integer Variables :
//          i,j,x,p------>loop varables
//          c------>counter
//          ch------>choice variable
//          s,qs,s,ts------>storing the no. of questions and correct answers
//          choice,score,ques
//      Other variables :
//          timer(type Timer)------>invoking timer class
}