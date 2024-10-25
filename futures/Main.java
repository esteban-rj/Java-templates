
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        CompletableFuture<Void> completeableFuture1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Despues");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> completeableFuture2 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(500);
                System.out.println("Antes");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        completeableFuture1.join();
        completeableFuture2.join();

        CompletableFuture<Optional<String>> completeableFuture1Str = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                return Optional.of("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
                return Optional.empty();
            }
        });

        CompletableFuture<Optional<String>> completeableFuture2Str = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                return Optional.of("World");
            } catch (InterruptedException e) {
                e.printStackTrace();
                return Optional.empty();
            }
        });
        
        List<CompletableFuture<Optional<String>>> completableFutures = List.of(completeableFuture1Str, completeableFuture2Str);

        completableFutures.stream().map(CompletableFuture::join).map(Optional::get).forEach(System.out::println);  

    }
}