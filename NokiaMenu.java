import java.util.Scanner;
public class NokiaMenu {
public static void main (String [] args) {
Scanner fuckyou = new Scanner(System.in);

System.out.println("NOKIA 5510 MENU");

System.out.println("1. Phone Book");
System.out.println("2. Messages");
System.out.println("3. Chat");
System.out.println("4. Call Register");
System.out.println("5. Tones");
System.out.println("6. Settings");
System.out.println("7. Call Divert");
System.out.println("8. Music");
System.out.println("9. Games");
System.out.println("10. Calculator");
System.out.println("11. Reminders");
System.out.println("12. Clock");
System.out.println("13. Profiles");
System.out.println("14. Services");
System.out.println("15. Sim Services");

System.out.print("Enter your Choice(1-15): ");
int choice = fuckyou.nextInt();

if(choice==1) {
    System.out.println("PHONE BOOK");
    System.out.println("1. Search");
    System.out.println("2. Service Nos");
    System.out.println("3. Add Name");
    System.out.println("4. Erase");
    System.out.println("5. Edit");
    System.out.println("6. Copy");
    System.out.println("7. Assign");
    System.out.println("8. Send b'card");
    System.out.println("9. Options");
    System.out.println("10. Speed dials");
    System.out.println("11. Voice tags");
    
    System.out.print("Enter your Choice: ");
    choice = fuckyou.nextInt();
    
    if(choice==9) {
    System.out.println("1. Memory in use");
    System.out.println("2. Type of");
    System.out.println("3. Memory status");
    }
    else {
    System.out.println("INVALID INPUT!!!");
    }
}
else if (choice==2) {
    System.out.println("MESSAGES");
    System.out.println("1. Write messages");
    System.out.println("2. Inbox");
    System.out.println("3. Outbox");
    System.out.println("4. Picture messages");
    System.out.println("5. Template");
    System.out.println("6. Smileys");
    System.out.println("7. Message settings");
    System.out.println("8. Info service");
    System.out.println("9. Voice mailbox number");
    System.out.println("10. Service command editor");
    
    System.out.print("Enter your Choice: ");
    choice = fuckyou.nextInt();
    
    if (choice==7) {
        System.out.println("1. Set 1");
        System.out.println("2. Common");
        
        System.out.print("Enter your Choice: ");
        choice = fuckyou.nextInt();
        
        if (choice==1) {
            System.out.println("Set 1");
            System.out.println("1. Message centre number");
            System.out.println("2. Message sent as");
            System.out.println("3. Message validity");
        }
        
        else if (choice==2) {
            System.out.println("Common");
            System.out.println("1. Delivery reports");
            System.out.println("2. Reply via same centre");
            System.out.println("3. Character support");
        }
        else {
            System.out.println("INVALID INPUT!!!");
        }
    }
    else {
        System.out.println("INVALID INPUT!!!");
    }
}

else if(choice==3) {
    System.out.println("3. Chat");
}

else if(choice==4) {
    System.out.println("CALL REGISTER");
    System.out.println("1. Missed calls");
    System.out.println("2. Receoved calls");
    System.out.println("3. Dialed calls");
    System.out.println("4. Erase recent call lists");
    System.out.println("5. Show call duration");
    System.out.println("6. Show call costs");
    System.out.println("7. Call cost settings");
    System.out.println("8. Prepaid credit");
    
    System.out.print("Enter your Choice: ");
    choice = fuckyou.nextInt();
    
    if(choice==5) {
        System.out.println("SHOW CALL DURATION");
        System.out.println("1. Last call duration");
        System.out.println("2. All calls' duration");
        System.out.println("3. Received calls' duration");
        System.out.println("4. Dialed calls' duration");
        System.out.println("5. Clear timers");
    }
    
    else if(choice==6) {
        System.out.println("SHOW CALL COSTS");
        System.out.println("1. Last call cost");
        System.out.println("2. All calls' cost");
        System.out.println("3. Clear counter");
    }
    else if(choice==7) {
        System.out.println("CALL COST SETTINGS");
        System.out.println("1. Call cost limit");
        System.out.println("2. Show cost");
    }
    else{
       System.out.println("INVALID INPUT!!!");
    }
}

else if (choice==5) {
    System.out.println("TONES");
    System.out.println("1. Ringing tone");
    System.out.println("2. Ringing volume");
    System.out.println("3. Incoming call alert");
    System.out.println("4. Message Alert tone");
    System.out.println("5. Keypad tone");
    System.out.println("6. Warning tone");
    System.out.println("7. Vibrating alert");
    System.out.println("8. Screen saver");
}
else if(choice==6) {
    System.out.println("SETTINGS");
    System.out.println("1. Call settings");
    System.out.println("2. Phone settings");
    System.out.println("3. Security settings");
    System.out.println("4. Restore factory");
    
    System.out.print("Enter your Choice: ");
    choice = fuckyou.nextInt();
    
    if(choice==1) {
        System.out.println("CALL SETTINGS");
        System.out.println("1. Automatic redial");
        System.out.println("2. Speed dialing");
        System.out.println("3. Call waiting options");
        System.out.println("4. Own number sending");
        System.out.println("5. Phone line in use");
        System.out.println("6. Automatic answer");
    }
    
    else if(choice==2) {
        System.out.println("PHONE SETTINGS");
        System.out.println("1. Language");
        System.out.println("2. Cell info display");
        System.out.println("3. Welnote note");
        System.out.println("4. Network selection");
        System.out.println("5. Confirm service action");
    }
    
    else if(choice==3) {
        System.out.println("SECURITY SETTINGS");
        System.out.println("1. Pin code request");
        System.out.println("2. Call barring service");
        System.out.println("3. Fixed dialing");
        System.out.println("4. Closed user group");
        System.out.println("5. Security level");
        System.out.println("6. Change access code");
    }
    
    else{
       System.out.println("INVALID INPUT!!!");
    }
}

else if(choice==7) {
    System.out.println("7. Call Divert");
}

else if (choice==8) {
    System.out.println("MUSIC");
    System.out.println("1. Music player");
    System.out.println("2. Radio");
    System.out.println("3. Recorder");
    System.out.println("4. Trackl ist");
}

else if(choice==9) {
    System.out.println("9. Games");
}

else if (choice==10) {
    System.out.println("10. Calculator");
}

else if(choice==11) {
    System.out.println("11. Reminders");
}

else if (choice==12) {
    System.out.println("CLOCK");
    System.out.println("1. Alarm clock");
    System.out.println("2. Clock settings");
    System.out.println("3. Date settings");
    System.out.println("4. Stopwatch");
    System.out.println("5. Countdown timer");
    System.out.println("6. Auto update of date and time");
}

else if(choice==13) {
    System.out.println("13. Profiles");
}

else if (choice==14) {
    System.out.println("14. Services");
}

else if(choice==15) {
    System.out.println("15. Sim Services");
}

else{
    System.out.println("INVALID INPUT!!!");
}
}
}