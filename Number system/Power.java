class Power{
int pow( int n , int p){
int pw = 1;
while(p > 0){
pw = pw * n;
p --;
}
return pw;
}
}