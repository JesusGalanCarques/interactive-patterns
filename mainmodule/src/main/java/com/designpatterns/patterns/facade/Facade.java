package com.designpatterns.patterns.facade;

/**
 * La utilidad del patrón faÇade es la de proveer una interfaz
 * que abstraiga la lógica de bajo nivel para mejorar
 * la implementación de nuevos algoritmos.
 */
public class Facade {
    public static void main() {
        Buffer buffer = new Buffer(30, 20);
        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewport(viewport);
        console.render();
    }
}