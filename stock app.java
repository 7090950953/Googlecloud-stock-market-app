import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class StockMarketApp {

    public static void main(String[] args) throws IOException {
        // Create a simple HTTP server on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Set up context for handling requests to "/"
        server.createContext("/", new RootHandler());

        // Start the server
        server.start();

        System.out.println("Server started on port 8080...");
    }

    // RootHandler for handling requests to "/"
    static class RootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Set the response headers
            exchange.getResponseHeaders().set("Content-Type", "text/html");
            exchange.sendResponseHeaders(200, 0);

            // Get the response body's output stream
            OutputStream os = exchange.getResponseBody();

            // Write the HTML response
            String response = "<html><body><h1>Welcome to the Stock Market App!</h1></body></html>";
            os.write(response.getBytes());

            // Close the output stream
            os.close();
        }
    }
}
