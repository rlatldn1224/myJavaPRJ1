package org.example;

public class Exam0111 {
    public static void main(String[] args) {
        // 로그 문자열 예시 (문제에서 제시된 방식대로 변수 선언)
        String log = "127.0.0.1 - frank [10/oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        // 요청 라인 추출 (큰따옴표로 묶인 부분)
        int firstQuote = log.indexOf("\"");          // 첫 번째 따옴표 위치
        int secondQuote = log.indexOf("\"", firstQuote + 1); // 두 번째 따옴표 위치
        String requestLine = log.substring(firstQuote + 1, secondQuote); // "GET /apache_pb.gif HTTP/1.0"

        // 요청 라인을 공백 기준으로 나누기 → ["GET", "/apache_pb.gif", "HTTP/1.0"]
        String[] parts = requestLine.split(" ");
        String url = parts[1]; // 두 번째 요소가 요청 URL 경로: "/apache_pb.gif"

        // 마지막 '/' 다음 부분만 추출 → "apache_pb.gif"
        String fileName = url.substring(url.lastIndexOf("/") + 1);

        // 출력
        System.out.println(fileName);
    }
}
