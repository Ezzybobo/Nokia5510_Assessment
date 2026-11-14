print("NOKIA 5510 MENU")

print("1. Phone Book")
print("2. Messages")
print("3. Chat")
print("4. Call Register")
print("5. Tones")
print("6. Settings")
print("7. Call Divert")
print("8. Music")
print("9. Games")
print("10. Calculator")
print("11. Reminders")
print("12. Clock")
print("13. Profiles")
print("14. Services")
print("15. Sim Services")

choice = int(input("Enter your Choice(1-15): "))

if choice==1:

    print("PHONE BOOK")
    print("1. Search")
    print("2. Service Nos")
    print("3. Add Name")
    print("4. Erase")
    print("5. Edit")
    print("6. Copy")
    print("7. Assign")
    print("8. Send b'card")
    print("9. Options")
    print("10. Speed dials")
    print("11. Voice tags")
    choice = int(input("Enter your Choice: "))
    if choice==9:
        print("1. Memory in use")
        print("2. Type of")
        print("3. Memory status")
    else:
        print("INVALID INPUT!!!")
        
elif choice==2:
    print("MESSAGES")
    print("1. Write messages")
    print("2. Inbox")
    print("3. Outbox")
    print("4. Picture messages")
    print("5. Template")
    print("6. Smileys")
    print("7. Message settings")
    print("8. Info service")
    print("9. Voice mailbox number")
    print("10. Service command editor")
    choice = int(input("Enter your Choice: "))
    if choice==7:
        print("1. Set 1")
        print("2. Common")
        choice = int(input("Enter your Choice: "))
        if choice==1:
            print("Set 1")
            print("1. Message centre number")
            print("2. Message sent as")
            print("3. Message validity")
        elif choice==2:
            print("Common")
            print("1. Delivery reports")
            print("2. Reply via same centre")
            print("3. Character support")
        else:
            print("INVALID INPUT!!!") 
    else:
        print("INVALID INPUT!!!") 
        
elif choice==3:
    print("3. Chat")
elif choice==4:
    print("CALL REGISTER")
    print("1. Missed calls")
    print("2. Receoved calls")
    print("3. Dialed calls")
    print("4. Erase recent call lists")
    print("5. Show call duration")
    print("6. Show call costs")
    print("7. Call cost settings")
    print("8. Prepaid credit")
    
    choice = int(input("Enter your Choice: "))
    if choice==5:
        print("SHOW CALL DURATION")
        print("1. Last call duration")
        print("2. All calls' duration")
        print("3. Received calls' duration")
        print("4. Dialed calls' duration")
        print("5. Clear timers")
    elif choice==6:
        print("SHOW CALL COSTS")
        print("1. Last call cost")
        print("2. All calls' cost")
        print("3. Clear counter")
    elif choice==7:
        print("CALL COST SETTINGS")
        print("1. Call cost limit")
        print("2. Show cost")
    else:
       print("INVALID INPUT!!!")
        
elif choice==5:
    print("TONES")
    print("1. Ringing tone")
    print("2. Ringing volume")
    print("3. Incoming call alert")
    print("4. Message Alert tone")
    print("5. Keypad tone")
    print("6. Warning tone")
    print("7. Vibrating alert")
    print("8. Screen saver")
elif choice==6:
    print("SETTINGS")
    print("1. Call settings")
    print("2. Phone settings")
    print("3. Security settings")
    print("4. Restore factory")
    
    choice = int(input("Enter your Choice: "))
    if choice==1:
        print("CALL SETTINGS")
        print("1. Automatic redial")
        print("2. Speed dialing")
        print("3. Call waiting options")
        print("4. Own number sending")
        print("5. Phone line in use")
        print("6. Automatic answer")
    elif choice==2:
        print("PHONE SETTINGS")
        print("1. Language")
        print("2. Cell info display")
        print("3. Welnote note")
        print("4. Network selection")
        print("5. Confirm service action")
    elif choice==3:
        print("SECURITY SETTINGS")
        print("1. Pin code request")
        print("2. Call barring service")
        print("3. Fixed dialing")
        print("4. Closed user group")
        print("5. Security level")
        print("6. Change access code")
    else:
       print("INVALID INPUT!!!")
    
elif choice==7:
    print("7. Call Divert")
elif choice==8:
    print("MUSIC")
    print("1. Music player")
    print("2. Radio")
    print("3. Recorder")
    print("4. Trackl ist")
elif choice==9:
    print("9. Games")
elif choice==10:
    print("10. Calculator")
elif choice==11:
    print("11. Reminders")
elif choice==12:
    print("CLOCK")
    print("1. Alarm clock")
    print("2. Clock settings")
    print("3. Date settings")
    print("4. Stopwatch")
    print("5. Countdown timer")
    print("6. Auto update of date and time")
elif choice==13:
    print("13. Profiles")
elif choice==14:
    print("14. Services")
elif choice==15:
    print("15. Sim Services")
else:
    print("INVALID INPUT!!!")
    

