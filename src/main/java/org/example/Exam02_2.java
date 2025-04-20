package org.example;

public class Exam02_2 {
    public static void main(String[] args) {

        String log = "127.0.0.1 - frank [10/oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        int firstQuote = log.indexOf("\"");
        int secondQuote = log.indexOf("\"", firstQuote + 1);
        String requestLine = log.substring(firstQuote + 1, secondQuote);

        String[] parts = requestLine.split(" ");
        String url = parts[1];

        String fileName = url.substring(url.lastIndexOf("/") + 1);

        System.out.println(fileName);
    }
}
