import java.util.Scanner;

public class UserTicketCreation {
    public static void main(String[] args){
        Scanner n = new Scanner ( System.in );

        System.out.print ( "ENTER YOUR NAME: " );
        String name = n.nextLine();
        System.out.print ( " ENTER THE ISSUE THAT YOU ARE FACING: ");
        String issue = n.nextLine();
        System.out.print ( " ENTER THE CATEGORY OF THE ISSUE: ");
        String category = n.nextLine();

        int TicketId = 001;

        System.out.print( " NAME : " +name);
        System.out.print( " STATED ISSUE : " +issue);
        System.out.print( " UNDER THE CATEGORY : " +category);
        System.out.print( " ISSUED TICKET ID : " +TicketId);

    }
}
