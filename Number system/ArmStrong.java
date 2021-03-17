class ArmStrong{
boolean isArmStrongNumber(int x){
int c = countDigit(x);
int sum = 0, t = x;
do{
int r = x % 10;
sum = sum + pow(r, c);
x = x / 10;
}while(x != 0);
return sum == t; 
}
int countDigit(int a){
int count = 0;
do{
count ++;
a = a / 10;
}while (a != 0);
return count;
}
int pow (int n, int p){
int pw = 1;
while (p > 0){
pw = pw * n;
p --;
}
return pw;
}
}