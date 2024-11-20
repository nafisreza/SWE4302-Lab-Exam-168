import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InvoiceWriter {
    public static void writeInvoice(Order order, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(order.generateInvoice());
        }
    }
}