package com.xworkz.window;

import com.xworkz.window.glasswindow.GlassWindow;

public class WindowRunner {
    public static void main(String[] args) {
        GlassWindow glassWindow = new GlassWindow();
        glassWindow.type();
        glassWindow.material();
        glassWindow.usage();

        Window window = new Window();
        window.type();
        window.material();
        window.usage();
    }
}
