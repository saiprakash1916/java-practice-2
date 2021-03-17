class Palidrone{
boolean isPalidronenumber(int x){
return(x)  == reverse(x);
}
int reverse (int n){
int rev = 0;
do{
int r = n % 10;
rev = rev * 10 + r;
n = n / 10;
}while(n != 0);
return rev;
}
}