class Strong{
boolean isStrongNumber(int x){
int sum = 0, t = x;
do{
int r = x % 10;
sum = sum + fact(r);
x = x / 10;
}while(x != 0);
return sum == t;
}

int fact(int n){
int f = 1;
while (n > 1){
f = f * n;
n --;
}
return f;
}
}