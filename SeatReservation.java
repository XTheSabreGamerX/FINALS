/*Juan Carlos T. Matias
 IT101A*/
 import java.util.Arrays;
 import java.util.Scanner;
 public class SeatReservation {
 
     public static void main(String[] args) {
         
         Scanner s = new Scanner(System.in);
         boolean answer = true;
         String[] response;
         int row = 0;
         int col = 0;
         int ansrow = 0;
         int anscol = 0;
        
         String columns [] = {"Col1", "Col2", "Col3", "Col4"};
         String[][] seats = {
                 
                 {"Row1", "|*", "*", "*", "*"},
                 {"Row2", "|*", "*", "*", "*"},	
                 {"Row3", "|*", "*", "*", "*"},	
                 {"Row4", "|*", "*", "*", "*"},	
                 {"Row5", "|*", "*", "*", "*"},	    //Array for Bus Seats
                 {"Row6", "|*", "*", "*", "*"},	
                 {"Row7", "|*", "*", "*", "*"},	
                 {"Row8", "|*", "*", "*", "*"},	
                 {"Row9", "|*", "*", "*", "*"},	
                 {"Row10", "|*", "*", "*", "*"}	
         };	          

        do {

            System.out.println("Bus Seat Reservation: ");

            for(int i = 0; i < columns.length; i++){
                System.out.print("\t" + columns[i]);    //Column Array
            } System.out.println();

            for (row = 0; row < seats.length; row++) {            //Output of Bus Seats
            for (col = 0; col < seats[row].length; col++) {
                System.out.print(seats[row][col] + "\t"); 
            } System.out.println();
        }      

         System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
            response = s.nextLine().split(" ");
            ansrow = Integer.parseInt(response[0]);
            anscol = Integer.parseInt(response[1]);

        if (ansrow > 0 && anscol > 0) {   //Checks if input is > 0 and replaces * with X
            seats[ansrow-1][anscol] = "X";        
        }

        else {
            answer = false;
            System.out.println("Program Exit!");    //When negative integer is entered, program exits
        }
    } while(answer == true);    //Loops Input while integer is > 0

    }
 }