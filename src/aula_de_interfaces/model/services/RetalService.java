package aula_de_interfaces.model.services;

import aula_de_interfaces.model.entities.CarRental;
import aula_de_interfaces.model.entities.Invoice;

public class RetalService {
    private Double PricePerDay;//preco por dia de aluguel
    private Double PricePerHour;//preco por hora
    private TaxService texService;

    public RetalService(Double pricePerDay, Double pricePerHour, TaxService texService) {
        PricePerDay = pricePerDay;
        PricePerHour = pricePerHour;
        this.texService = texService;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double) (t2 - t1) / 1000 / 60 / 60;
        double basicPayment; // valor basico de pagamento.
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * PricePerHour;

        } else {
            basicPayment = Math.ceil(hours / 24) * PricePerDay;
        }
        double tax = texService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
