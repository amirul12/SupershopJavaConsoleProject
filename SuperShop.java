import java.util.Scanner;
class Food {

	public String fProducName;
	public  int fUnitPrice;
	public  int fToatalQuentity;
	public  int fTotalAmount;
	
	
	
	public Food(){
		fProducName = new String();
		fUnitPrice = 0;
		fToatalQuentity = 0;
		fTotalAmount = 0;
	}
	
	public Food(String name, int fUnitPric, int fTotalQuentity){
		fProducName = new String(name);
		fUnitPrice = fUnitPric;
		fToatalQuentity = fTotalQuentity;
	}
	
	public void totalItemAmount(){
		fTotalAmount = fUnitPrice*fToatalQuentity;
		System.out.println("Toatal Quentity : "+fToatalQuentity);
		System.out.println("Toatal Amount : "+fTotalAmount);
	}
	
 	public void addingNewItem(int add){
		fToatalQuentity = fToatalQuentity + add;
		fTotalAmount = fUnitPrice*fToatalQuentity;
	}
 	public void addingNew(int add){
		fToatalQuentity = fToatalQuentity + add;
	 
	}
 	public void changefProducName(String  name){
		 fProducName = name;
	 
	}
	
	public void sellinFoodProduct(int sell){
		fToatalQuentity = fToatalQuentity - sell;
	}

	public void afterAdding(){
		System.out.print(" Product Name: "+fProducName+"\n Total Qyt: "+fToatalQuentity+"\t Total Amount: "+fUnitPrice*fToatalQuentity+" Taka\n");
	}
	public void dispFoodDetails(){
		System.out.print(" Total Qyt: "+fToatalQuentity+"\t Total Amount: "+fUnitPrice*fToatalQuentity+" Taka\n");
	}
	
}





  class SuperShop {

	 
		 
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String fFoodName[] = new String[100];
		int fUnitPrice[] = new int[100];
		int fQuentity[] = new int[100];
		int option;
		String fname;
		int zeroo=1;
 
		Food[] n =  new Food[12];
		fFoodName[0]="Banana";
		fFoodName[1]="Cake";
		fFoodName[2]="Bread";
		fFoodName[3]="Gelly";
		fFoodName[4]="rochi";
		fFoodName[5]="Paddis";
		fFoodName[6]="Paddis";
		fFoodName[7]="Biscuit";
		fFoodName[8]="tea";
		fFoodName[9]="coffee";
		
		fUnitPrice[0] =40;
		fUnitPrice[1] =10;
		fUnitPrice[2] =15;
		fUnitPrice[3] =20;
		fUnitPrice[4] =35;
		fUnitPrice[5] =30;
		fUnitPrice[6] =12;
		fUnitPrice[7] =22;
		fUnitPrice[8] =19;
		fUnitPrice[9] =10;
		 
		 fQuentity[0] = 80;
		 fQuentity[1] = 30;
		 fQuentity[2] = 200;
		 fQuentity[3] = 122;
		 fQuentity[4] = 50;
		 fQuentity[5] = 33;
		 fQuentity[6] = 32;
		 fQuentity[7] = 22;
		 fQuentity[8] = 33;
		 fQuentity[9] = 44;
	 
		
		System.out.println(" \n\n\n\n\n\n\t\t\t\t\t\t********************************************** ");
		System.out.println(" 													         ");
		System.out.println(" 															 ");
		System.out.println(" 		\t\t\t\t\t\t	Ornet Super Shop								 ");
		System.out.println(" 													         ");		
		System.out.println(" 													         ");		
		
	
	System.out.println("tFood Name-- Unit Price--Total Qyt ");	
		for(int j = 0; j< 10; j++){
			n[j] = new Food(fFoodName[j], fUnitPrice[j],fQuentity[j]);
			System.out.println(" Item "+(j+1)+":"+fFoodName[j]+"\t"+fUnitPrice[j]+"\t"+fQuentity[j]);
		}
	System.out.print("   **********************************************\n ");
 
		do{
				System.out.print(" Select option:\n ");
				System.out.print(" 1:Show Details Above Item \n ");
				System.out.print(" 2: Edit\n ");
				System.out.print(" 3: Add qyt\n ");
				System.out.print(" 4: Selling\n ");
				System.out.print(" 5: exit\n ");
		 
			 
			
				 option = sc.nextInt();
				
				switch(option){
					case 1:{
						System.out.print(" Enter the product ID: ");
						int num = sc.nextInt();
						System.out.print(" Name OF Product: "+n[num-1].fProducName+"\n");
						n[num-1].dispFoodDetails();
						break;
					}
					case 2:{
						System.out.println("Select name of FooD ID:");
						int choiceSell = sc.nextInt();
						System.out.print((choiceSell)+": "+n[choiceSell-1].fProducName+"\n");
						System.out.println("Enter  name of FooD :");
						 fname = sc.next();
						n[choiceSell-1].changefProducName(fname);
						n[choiceSell-1].afterAdding();
						
						break;
					}
					case 3:{
						System.out.print(" ----Adding----\n Enter number of Food ID:  ");
						int serch = sc.nextInt();
						System.out.print(" Name OF Product: "+n[serch-1].fProducName+"\n");
						System.out.print(" \n\nAdding number of Qyt: ");
						int nu = sc.nextInt();
						n[serch-1].addingNew(nu);
						System.out.print("\n\n\nAfter Adding:\n\n Details Of ");
						n[serch-1].afterAdding();
						
						break;
					}
					case 4:{
						System.out.println("Selling : select name of FooD ID:");
						 int choiceSell = sc.nextInt();
						System.out.print((choiceSell)+": "+n[choiceSell-1].fProducName+"\n");
						 
						
						System.out.println(" Enter onumber of FooD selling:  ");
						int sell = sc.nextInt();
						n[choiceSell-1].sellinFoodProduct(sell);
						n[choiceSell-1].afterAdding();
						
						break;
					}
			 
 
 
					default:
					System.out.print("not valid\n ");
				}
				System.out.print("\nEnter 0 for continue: and anykey for exit\n ");
				 zeroo = sc.nextInt();
		 }while(zeroo == 0);
 
 	
	}

}