package ru.clevertec.news.exception;

public class CacheNotFoundException extends RuntimeException {

    public CacheNotFoundException() {
        super("Cache not found!");
    }
}