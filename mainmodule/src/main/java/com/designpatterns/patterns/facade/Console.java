package com.designpatterns.patterns.facade;

import java.util.ArrayList;
import java.util.List;


class Console {
    List<Viewport> viewports = new ArrayList<>();
    int width, height;

    public Console(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewport(Viewport viewport) {
        viewports.add(viewport);
    }

    public void render() {
        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                for ( Viewport vp: viewports) {
                    System.out.print(vp.charAt(x, y));
                }
                System.out.println();
            }
        }
    }
}
