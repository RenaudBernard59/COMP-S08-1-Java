i = 2
tab = []
while (i<=50):
    j = 2
    while (j<=50):
        if (i>=j):
            print("T:j="+str(j)+".i="+str(i))
            #OK
            mod = i%j
            if (i%j !=0):
                print("TT:i="+str(i)+".j="+str(j)+"Modulo="+str(mod))
                #OK
                if (j == i):
                    print("TTT:j="+str(j)+".i="+str(i))
                    #On est à la fin de la boucle
                    tab.append(i)
                    print("TAB="+str(tab))
                    i+=1
                else:
                    print("FFF:j="+str(j)+".i="+str(i))
                    #NON on continue la boucle j
                    j+=1
                #END Else 3
            else:
                print("FF:i="+str(i)+".j="+str(j)+"Modulo="+str(mod))
                #Est un nb divisible
                i+=1
            #END Else 2
        else:
            print("F:j="+str(j)+".i="+str(i))
            #NON on trouve un nouveau nombre
            i+=1
        #END Else 1
    #END while j
#END while i
