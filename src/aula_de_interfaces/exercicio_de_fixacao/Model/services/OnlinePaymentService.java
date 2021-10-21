package aula_de_interfaces.exercicio_de_fixacao.Model.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
