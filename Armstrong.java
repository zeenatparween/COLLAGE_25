class Armstrong{
public static void main(String args[]){
int num = 123,temp;
temp = num;
int sum = 0;
while(temp!=0){
int dig = temp%10;
sum += dig*dig*dig;
temp = temp/10;
}
if(sum == num){
System.out.println("is a Armstrong num");
}
else{
System.out.println("is Not a Armstrong number");
}
}
}