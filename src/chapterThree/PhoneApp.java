package chapterThree;
import java.util.Scanner;

public class PhoneApp {
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("1.Phone Book");
    System.out.println("2.Messages");
    System.out.println("3.Chat");
    System.out.println("4.Call Register");
    System.out.println("5.Tones");
    System.out.println("6.Settings");
    System.out.println("7.Call Divert");
    System.out.println("8.Games");
    System.out.println("9.Calculator");    
    System.out.println("10.Reminders");
    System.out.println("11.Clock");
    System.out.println("12.Profiles");
    System.out.println("13.Sim Services");

    System.out.println("Select a Number");
    int number = inputCollector.nextInt();

    if(number == 1){
        System.out.println("1.Search");
        System.out.println("2.Service Nos");
        System.out.println("3.Add Name");
        System.out.println("4.Erase");
        System.out.println("5.Edit");
        System.out.println("6.Assign tone");
        System.out.println("7.Send b'card");
        System.out.println("8.Options");
        System.out.println(" 1.Type of view");
        System.out.println(" 2.Memory Status");
        System.out.println("9.Speed dials");
        System.out.println("10.Voice Tags");
    }
    
    if(number == 2){
        System.out.println("1.Write Message");
        System.out.println("2.Inbox");
        System.out.println("3.Outbox");
        System.out.println("4.Picture Message");
        System.out.println("5.Tempelates");
        System.out.println("6.Smileys");
        System.out.println("7.Message settings");
        System.out.println(" 1.Set 1");
        System.out.println("  1.Message centre Number");
        System.out.println("  2.Messages sent as");
        System.out.println("  3.Message validity");
        System.out.println(" 2.Common");
        System.out.println("  1.Delivery reports");
        System.out.println("  2.Reply via same centre");
        System.out.println("  3.Character support");
        System.out.println("8.Info service");
        System.out.println("9.Voice mailbox number");
        System.out.println("10.Service command editor");
    }
       
    if(number == 3){
        System.out.println("");
    }
    
    if(number == 4){
        System.out.println("1.Missed calls");
        System.out.println("2.Recieved calls");
        System.out.println("3.Dialed number");
        System.out.println("4.Erase recent call");
        System.out.println("5.Show call duration");
        System.out.println("  1.Last call duration");
        System.out.println("  2.All calls duration");
        System.out.println("  3.Recieved calls duration");
        System.out.println("  4.Dialed calls duration");
        System.out.println("  5.Clear times");
        System.out.println("6.Show call costs");
        System.out.println("  1.last call cost");
        System.out.println("  2.All calls costs");
        System.out.println("  3.Clear counters");
        System.out.println("7.Call costs settings");
        System.out.println("  1.Call cost limit");
        System.out.println("  2.Show costs in");
        System.out.println("8.Prepaid credit");       
    }

    if(number == 5){
        System.out.println("1.Ringing tone");
        System.out.println("2.Ringing volume");
        System.out.println("3.Incoming call alert");
        System.out.println("4.Composer");
        System.out.println("5.Message alert Tone");
        System.out.println("6.Keypad tones");
        System.out.println("7.Warning and game tones");
        System.out.println("8.Vibrating alert");
        System.out.println("9.Screen saver");
    }

    if(number == 6){
        System.out.println("1.Call settings");
        System.out.println("  1.Automatic redial");
        System.out.println("  2.Speed dialing");
        System.out.println("  3.Call waiting options");
        System.out.println("  4.Own number sending");
        System.out.println("  5.Phone line in use");
        System.out.println("  6.Automatic answer");
        System.out.println("2.Phone settings");
        System.out.println("  1.Language");
        System.out.println("  2.Cell info display");
        System.out.println("  3.welcome note");
        System.out.println("  4.Netwok selection");
        System.out.println("  5.Lights");
        System.out.println("  6.Confirm SIM service actions");
        System.out.println("3.Security settings");
        System.out.println("  1.PIN code request");
        System.out.println("  2.Call barring services");
        System.out.println("  3.Fixed dialing");
        System.out.println("  4.Closed user group");
        System.out.println("  5.Phone security");
        System.out.println("  6.Closed access codes");
        System.out.println("4.Restore factory settings");
    }

    if(number == 7){
        System.out.println("");
    }
    if(number == 8){
        System.out.println("");
    }
    if(number == 9){

    }

    if(number == 10){

    }
    if(number == 11){

    }
    
}










}