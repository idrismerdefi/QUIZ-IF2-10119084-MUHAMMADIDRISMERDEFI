/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119084.muhammadidrismerdefi;
/**
 * @author  
 * QUIZ
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Program BARBER ( Pangkas rambut)
 **/
public class QUIZIF210119084MUHAMMADIDRISMERDEFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        
        Customer customer = new Customer();
        
        System.out.print("Customer Name : ");
        customer.setName(scanner1.nextLine());
        
        System.out.print("Customer Email : ");
        customer.setEmail(scanner2.next());
        customer.displayService();
        customer.setPriceService(customer.getPrice(scanner4.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        customer.setMember(customer.checkMemberStatus(scanner3.next()));
        System.out.println("\n");
        System.out.println("#*******************************#");
        System.out.println("#********CUSTOMER INVOICE*******#");
        System.out.println("Date Transaction : "+customer.currentTime());
        System.out.println("Service Price : Rp." + customer.getPriceService());
        System.out.println("Discount : Rp." + customer.getSale(customer.isMember(), customer.getPriceService()));
        System.out.println("Total Pay : Rp." + customer.getTotalPay(customer.getPriceService(),
        customer.getSale(customer.isMember(), customer.getPriceService())));
    }
    
}
