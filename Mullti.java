import java.util.Scanner;


class Worker {

	public int wId[] = new int[100];
	public  String wName[]= new String[100];
	public  int wleave[]= new int[100];
	public  int wsalary[]= new int[100];
	public  int wTotalSalary[]= new int[100];
	
	
	public Worker(String wNam[], int wsal[]){
	 
		wName = new String(wNam);
		wsalary = wsal;
		 
	}
	
	public void disAllWorkers(){
	for(int i=0; i<10; i++){
		System.out.println(" Worker Id: "+wId[i]+" \nName of Worker: "+wName[i]+"\nWorker Leave: "+wleave[i]+"\nWorker Salary: "+wsalary[i]+" \nTotal Salary: "+wTotalSalary[i]);
	}
	}
	
}




  class Multi {

	 
		 
	public static void main(String[] args) {
		 

		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		 
		Worker worker = new Worker();
	 
		
		//worker instance
			 String wName[] = new String[100];
			int wleave[] = new int[100];
			int wsalary[]= new int[100];
			

		//name of worker.......
		wName[0] = "A";
		wName[1] = "B";
		wName[2] = "B";
		wName[3] = "C";
		wName[4] = "D";
		wName[5] = "E";
		wName[6] = "F";
		wName[7] = "G";
		wName[8] = "H";
		wName[9] = "I";
		//salary...
		wsalary[0] = 15000;
		wsalary[1] = 20000;
		wsalary[2] = 3323;
		wsalary[3] = 4323;
		wsalary[4] = 4323;
		wsalary[5] = 4323;
		wsalary[6] = 4323;
		wsalary[7] = 4323;
		wsalary[8] = 4323;
		wsalary[9] = 4323;
		
 
	 
		
		System.out.println(" \n\n\n\n\n\n\t\t\t\t\t\t********************************************** ");
		System.out.println(" 													         ");
		System.out.println(" 															 ");
		System.out.println(" 		\t\t\t\t\t\t	Ornet Super Shop								 ");
		System.out.println(" 													         ");		
		System.out.println(" 													         ");		
		
	//show Food Details

	System.out.print("  Details Workers: \n ");
	
	//show worker details
	System.out.println("Worker ID: -- Worker Name: -- Salary: ");	
		for(int pp = 0; pp< 10; pp++){
			worker = new Worker(wName[pp],wsalary[pp]);
			//System.out.println(" ID  "+(pp+1)+":"+wName[pp]+"\t"+wsalary[pp]+"\t");
		}
		worker.disAllWorkers();
	System.out.print("   **********************************************\n ");
 /* 
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
		 }while(zeroo == 0); */
 
 	
	}

}