import java.util.Scanner;

class Ticket {

    int ticketId;
    String name;
    String issue;
    String category;
    String status;

    Ticket ( int ticketId, String name, String issue, String category ) {

        this.ticketId = ticketId ;
        this.name = name ;
        this.issue = issue ;
        this.category = category ;
        this.status = "Open" ;
    }

    void display() {

        System.out.println ( "Ticket ID: " + ticketId ) ;
        System.out.println ( "Name: " + name  ) ;
        System.out.println ( "Issue: " + issue ) ;
        System.out.println ( "Category: " + category ) ;
        System.out.println ( "Status: " + status ) ;

    }
}

class SupportAgent {

    void resolveTicket(Ticket t) {
        t.status = "Resolved";
    }

    void closeTicket(Ticket t) {
        t.status = "Closed";
    }
}

public class class_creation {
    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in  ) ;

        int ticketId = 1;

        System.out.print ( "Enter Name: " ) ;
        String name = sc.nextLine() ;

        System.out.print ( "Enter Issue: " ) ;
        String issue = sc.nextLine();

        System.out.println ( "1.Technical  2.Login  3.Service  4.Transaction  5.Other" ) ;
        System.out.print ( "Enter choice: " ) ;
        int option = sc.nextInt() ;

        String category;

        if (option == 1) {

            category = "Technical" ;

        } else if (option == 2) {

            category = "Login" ;

        } else if (option == 3) {

            category = "Service" ;

        } else if (option == 4) {

            category = "Transaction" ;

        } else {

            category = "Other" ;
        }

        Ticket t = new Ticket ( ticketId, name, issue, category ) ;

        System.out.println ( "\nTicket Created!" ) ;
        t.display() ;

        SupportAgent a = new SupportAgent();
        a.resolveTicket ( t );
        a.closeTicket ( t );

        System.out.println("After Support:");
        t.display();

        sc.close();
    }
}