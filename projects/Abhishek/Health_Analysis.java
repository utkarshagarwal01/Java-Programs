import java.io.*;
/**
 * Computer Project
 * @author (Abhishek Khanna) 
 * @version (26.12.2008)
 */
public class Health_Analysis
 {
     void main()throws IOException
     {
         BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));         
         System.out.println("BLUEJ PROJECT ");
         System.out.println("Health Analysis ");;
         System.out.println("Made by Abhishek Khanna, Class 10th");
         System.out.println("Description-In today's world, there is a need of a constant health check.");
         System.out.println("This project aims at printing the individual's health report in accordance with the data entered by him/her.");
         System.out.println();
         int run=1;
         while (run!=0)
         {
         System.out.println("MAIN MENU");
         System.out.println("Press 1 to check your OBESITY LEVEL via Bio Mass Index");
         System.out.println("Press 2 to check the amount of protein you need per day using PROTEIN POWER FORMULA");
         System.out.println("Press 3 for Calorie Calculator");
         System.out.println("Please enter your choice");
         int choice=Integer.parseInt(ob.readLine());
         String name;
         double height;
         double weight;
         switch(choice)
         {
             case 1:                     //checks the BMI
             System.out.println("BMI is an internationally used measure of obesity.");
             System.out.println("Enter Your Name");
             name = ob.readLine();
             System.out.println("Enter Your Height In CENTIMETRES");
             height=Double.parseDouble(ob.readLine());
             height=height/100;
             System.out.println("Enter Your Weight In KILOGRAMS");
             weight=Double.parseDouble(ob.readLine());
             System.out.println("Your BMI Report is given below ==>");
             double bmi = weight/(height*height);
             System.out.println("Name - "+name);
             System.out.println("Height - "+height+" m");
             System.out.println("Weight - "+weight+" Kgs");
             System.out.println("Bio Mass Index (BMI) - "+bmi);
             if(bmi<=18.5)
             {
                 System.out.println("You Are UNDERWEIGHT ");
                 System.out.println("Your BMI is less than NORMAL Bio Mass Index Range which is 18.5 to 24.9");
                }
                if(bmi>18.5 && bmi<=24.9)
                {
                    System.out.println("You Are Of Normal Weight");
                    System.out.println(" Your BMI NORMAL and is in the Bio Mass Index Range which is 18.5 to 24.9 ");
                }
                if(bmi>24.9)
                {
                    System.out.println("You Are OVER-WEIGHT");
                    System.out.println("You Are Over Weight as your BMI is more than Bio Mass Index Range which is 18.5 to 24.9");
                }
                System.out.println("To exit the program, press 0. To return to the Main Menu, press any other number.");
                run=Integer.parseInt(ob.readLine());
                System.out.println();
                break;
                case 2:
                System.out.println("Please Provide some details To furnish the daily protein requirement");
                System.out.println("Enter Your Weight");
                weight=Integer.parseInt(ob.readLine());
                System.out.println("In which category will you classify yourself");
                System.out.println("Enter 1 if you are Sedentary- A person who gets no physical activity ");
                System.out.println("Enter 2 If you are Moderately Active- Someone who exercises 20-30 minutes two or three times per week ");
                System.out.println("Enter 3 If you are Active- Someone who exercises 30 minutes or more three to five times per week");
                System.out.println("Enter 4 If you are Very Active- A person who exercises an hour or more at least five times per week ");
                System.out.println("Enter 5 If you are an Athlete- A competitive athlete who trains twice a day for an hour or more");
                int h=Integer.parseInt(ob.readLine());
                double pro=0;
                switch(h)
                {
                    case 1:
                    pro=0.5;
                    break;
                    case 2:
                    pro=0.6;
                    break;
                    case 3:
                    pro=0.7;
                    break;
                    case 4:
                    pro=0.8;
                    break;
                    case 5:
                    pro=1.0;
                    break;
                    default:
                }
                double protein=pro*(weight*2.205);
                System.out.println("Your daily diet should contain atleast "+protein+" gms of protein");
                System.out.println("Data calculated on the basis of measures given by World Health Organisation");
                System.out.println("To exit the program, press 0. To return to the Main Menu, press any other number.");
                run=Integer.parseInt(ob.readLine());
                System.out.println();
                break;
                case 3:
                int pi=0;
                double calorie=0;
                System.out.println("You will be asked a series of quesion and your calories will be calculated on the basis of answers given by you");
                System.out.println("Press any NUMBER and then ENTER when you are ready");
                int nouse=Integer.parseInt(ob.readLine());
                System.out.println("Do you take anything from the list below in a day? Press 1 for 1 YES , 2 for NO");
                System.out.println("Bread , Chapati , Other Indian Breads");
                int bread = Integer.parseInt(ob.readLine());
                if(bread==1)
                {
                    System.out.println("How many pieces Of the prescribed item do you take in one day?");
                    pi = Integer.parseInt(ob.readLine());
                    calorie=78.3*pi;
                }
                System.out.println("Do you take anything from the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Boiled Fish/Mutton , Potatoes");
                int fish=Integer.parseInt(ob.readLine());
                pi=0;
                if(fish==1)
                {
                    System.out.println("How many pieces Of the prescribed item do you take in one day?");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*100);
                }
                System.out.println("Do you take anything from the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Tandoori Chicken, Cooked Chicken, Veg. dish with onions & tomatoes ");
                int chick=Integer.parseInt(ob.readLine());
                if(chick==1)
                {
                    System.out.println("How many pieces of the prescribed item do you take in one day?"); 
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*300);
                }
                System.out.println("Do you take anything from the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Pulses(like DAL), Curd, Yoghurt");
                int dal=Integer.parseInt(ob.readLine());
                pi=0;
                if(dal==1)
                {
                    System.out.println("How many cups of the prescribed item do you take in one day?");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*250);
                }
                System.out.println("Do you take anything from the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Sandwich, Pakoda , Samosa , Meat Puff , Bhel Puri, French Fries, Other Snacks");
                int sam=Integer.parseInt(ob.readLine());
                if(sam==1)
                {
                    System.out.println("How many pieces of the prescribed item do you take in one day");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*250);
                }
                System.out.println("Do you take NORMAL Indian Vegetables?");
                System.out.println("Press 1 for Yes , 2 for NO");
                int veg=Integer.parseInt(ob.readLine());
                if(veg==1)
                {
                    System.out.println("How much vegetable do you take in one day? Unit: 80gm = 1 unit");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*250);
                }
                System.out.println("Do you take anything drom the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Chocolate, Icecream, Other SweetMeats");
                int swe=Integer.parseInt(ob.readLine());
                if(swe==1)
                {
                    System.out.println("How many pieces of the prescribed item do you take in one day? Unit: 40gm = 1 pc.");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*250);
                }
                int checking=0;
                System.out.println("You approx. gain "+calorie+" Calories per day");
                if(calorie>1200)
                {
                    System.out.println("You gain "+(calorie-1200)+" Calories more than a normal healthy person");
                    checking=1;
                }
                if(calorie<1000)
                {
                    checking=2;
                    System.out.println("You gain "+(1200-calorie)+" Calories less than a normal healthy person");
                }
                if(checking==0)
                {
                    System.out.println("Your Calorie Gain is normal");
                }
                System.out.println("To exit the program, press 0. To return to the Main Menu, press any other number.");
                run=Integer.parseInt(ob.readLine());
                System.out.println();
                break;
                default:
                System.out.println("Please enter a valid choice");
            }
        }
    }
}