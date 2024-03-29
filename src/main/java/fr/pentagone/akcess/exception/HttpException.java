package fr.pentagone.akcess.exception;

import org.springframework.http.HttpStatus;

public class HttpException extends RuntimeException{
    private final int statusCode;
    public HttpException(HttpStatus httpStatus, String message){
        super(message);
        this.statusCode = httpStatus.value();
    }
    public HttpException(int code, String msg){
        super(msg);
        this.statusCode = code;
    }
    public static HttpException notFound(String msg){
        return new HttpException(HttpStatus.NOT_FOUND, msg);
    }
    public static HttpException forbidden(String msg){
        return new HttpException(HttpStatus.FORBIDDEN, msg);
    }
    public static HttpException badRequest(String msg){
        return new HttpException(HttpStatus.BAD_REQUEST, msg);
    }
    public static HttpException unauthorized(String msg){
        return new HttpException(HttpStatus.UNAUTHORIZED, msg);
    }

    public int getStatusCode() {
        return statusCode;
    }
}
