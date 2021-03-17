class Date{
	int dd,mm,yy;
	int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
	String dName[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	Date(int dd,int mm, int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%100!=0)
			month[1]=29;
	}
	String getDayName(){
		int days = noOfDays();
		return dName[days%7];
	}
	int noOfDays(){
		int y=yy-1;
		int sum=y*365;
		sum=sum+y/400+y/4-y/100;
		for(int i=0;i<mm-1;i++){
			sum=sum+month[i];
		}
		sum=sum+dd;
		return sum;
	}
}