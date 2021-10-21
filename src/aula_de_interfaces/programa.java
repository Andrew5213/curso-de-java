package aula_de_interfaces;

import aula_de_interfaces.model.entities.CarRental;
import aula_de_interfaces.model.entities.Vehicle;
import aula_de_interfaces.model.services.BrazilTaxservice;
import aula_de_interfaces.model.services.RetalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println("Entre com a data");
        System.out.println("modelo do carro:");
        String carModel=in.nextLine();
        System.out.println("data de entrada (dd/MM/yyyy HH:ss)");
        Date start=sdf.parse(in.nextLine());
        System.out.println("data de saida (dd/MM/yyyy HH:ss) ");
        Date finish=sdf.parse(in.nextLine());
        CarRental cr = new CarRental(start,finish,new Vehicle(carModel));
        System.out.println("Digite o preco por hora ");
        double pricePerHour =in.nextDouble();
        System.out.println("digite o preco por dia ");
        double pricePerDay = in.nextDouble();
        RetalService rentalService = new RetalService(pricePerDay,pricePerHour,new BrazilTaxservice());
        rentalService.processInvoice(cr);
        System.out.println("resposta ");
        System.out.println("pagamento basico "+String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("taxa "+String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("pagamento total "+String.format("%.2f",cr.getInvoice().getTotalPayment()));





        in.close();
    }

}
