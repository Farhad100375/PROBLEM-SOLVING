n = int(input())
C=0
while n!=0:
    mod=n%10
    if mod==4 or mod==7:
        C=C+1
    n=n//10
if C==4 or C==7:
    print("YES")
else:
    print("NO")
exit(0)