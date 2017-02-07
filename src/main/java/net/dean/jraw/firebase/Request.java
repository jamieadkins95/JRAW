package net.dean.jraw.firebase;

/**
 * Created by Jamie on 07/02/2017.
 */
public class Request {
    long timestamp;
    String request;

    public Request(String request) {
        timestamp = System.currentTimeMillis();
        this.request = request;
    }
}
