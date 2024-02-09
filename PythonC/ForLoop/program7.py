playerList = ["Rohit","Shubhman","Virat","Ayyar","KLRahul"]
playerName = input("Enter playername :")
flag = False
for player in playerList:
    if(player == playerName):
        flag = True;
        break;

if(flag):
    print(playerName, " is present in list ")
else:
    print(playerName, " is not present in list ")


