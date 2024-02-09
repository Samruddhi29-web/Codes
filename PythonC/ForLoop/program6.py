playerList = ["Rohit","Shubhman","Virat","Ayyar","KLRahul"]
playerName = input("Enter player Name : ")
for player in playerList:
    if(player == playerName):
        print(playerName, " prsent in the list ")
        break;
else:
    print(playerName, " not present in the list ")


