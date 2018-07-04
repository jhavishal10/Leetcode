package leetcode;
public class lemonadeChange {
	public static void main(String[] args) {
int [] bills= {5,10,5,10};
boolean ans=true;
for(int i=0;i<bills.length;i++){
     if(bills[i]==5){
         ans=true;
     }
    if(bills[i]==10){
        for(int j=0;j<i;j++){
            if(bills[j]==5){
                ans=true;
                bills[j]=0;
                break;
        }
            else
            {
              //  return false;
            }
        }
    }
	}

}
