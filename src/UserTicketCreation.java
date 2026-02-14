import java.util.Scanner;

public class UserTicketCreation {
    public static void main(String[] args){
        Scanner n = new Scanner ( System.in );
        int TicketId = 1 ;
        char A;
        do {

            System.out.print(" ENTER YOUR NAME: ");
            String name = n.nextLine();

            System.out.print(" ENTER THE ISSUE THAT YOU ARE FACING: ");
            String issue = n.nextLine();

            System.out.println(" ENTER THE CATEGORY OF THE ISSUE : ");
            System.out.println(" 1. Technical Issue ");
            System.out.println(" 2. Login Issue ");
            System.out.println(" 3. Service Request ");
            System.out.println(" 4. Transaction Issue ");
            System.out.println(" 5. Other ");
            //String category = n.nextLine();

            System.out.print(" Enter Your Choice (1-5) ");
            int choice = n.nextInt();


            // int TicketId = 1;
            //char A;

            System.out.println(" Ticket Created ");
            System.out.println(" NAME : " + name);
            System.out.println(" STATED ISSUE : " + issue);
            //System.out.print( " UNDER THE CATEGORY : " +category);
            System.out.println(" ISSUED TICKET ID : " + TicketId);

            TicketId++;
            System.out.println("Do you want to Add Another Ticket? (y/n) ");
            A = n.next().charAt(0);
            n.nextLine();
        }
        while ( A == 'y' || A == 'Y');
        System.out.println ("Thanks for your Report. The issue will be sorted");
    }
}
