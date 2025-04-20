package org.example;

public class Exam02_1 {
    public static void main(String[] args) {
    String log = "127.0.0.1 - frank [10/oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

    String[] parts = log.split("\"")[1].split(" ");

    System.out.println(parts[1].substring(parts[1].lastIndexOf("/") + 1));
}
}
