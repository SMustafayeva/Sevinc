package Lesson20.Mentor;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedList <Customer> senders = new LinkedList<>();
        LinkedList<Customer> receivers = new LinkedList<>();
        Set<Customer> customers = new HashSet<>(Set.of (
            new Customer( "Alim" ,true),
            new Customer( "Asim" ,false),
            new Customer( "Akif" ,true),
            new Customer( "Asif" ,false),
            new Customer( "Anar" ,true),
            new Customer( "Anil" ,false)
        ));

        for (Customer c : customers) {
            if (c.isSending) {
                senders.add(c);
            } else {
                receivers.add(c);
            }
        }
//        if (customer1.isSending){
//            senders.add(customer1.name);
//        }
    }
}
