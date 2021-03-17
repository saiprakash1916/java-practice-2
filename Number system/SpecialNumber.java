//link to mainrunner program
class SpecialNumber{
boolean isSpecialTwoDigit(int x){
int d1 = x % 10;
int d2 = x / 10;
int sum = d1 + d2 + d1 * d2;
return sum == x;
}
}