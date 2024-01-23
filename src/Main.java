import domain.AluguelCarro;
import domain.Veiculo;
import service.AluguelCarroService;
import service.BrasilTaxaService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o modelo do veiculo: ");
        String modelo = scanner.nextLine();

        Veiculo veiculo = new Veiculo(modelo);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Digite o horario de entrada: ");
        LocalDateTime inicio = LocalDateTime.parse(scanner.nextLine(), formatter);

        System.out.print("Digite o horario de entrega: ");
        LocalDateTime fim = LocalDateTime.parse(scanner.nextLine(), formatter);

        AluguelCarro aluguel = new AluguelCarro(inicio, fim, veiculo);

        System.out.print("Quanto custo o servico por hora: ");
        double precoPorHora = scanner.nextDouble();

        System.out.print("Quanto custo o servico por dia: ");
        double precoPorDia = scanner.nextDouble();

        AluguelCarroService service = new AluguelCarroService(precoPorHora, precoPorDia, new BrasilTaxaService());

        service.processarRecibo(aluguel);

        System.out.println(aluguel);
    }
}