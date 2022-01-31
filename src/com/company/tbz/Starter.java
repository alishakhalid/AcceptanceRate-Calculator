package com.company.tbz;

import java.io.IOException;

/**
 * This class calls upon the
 * main menu in the IO class to
 * work with a TUI
 */
public class Starter {
    public static void main(String[] args) throws IOException {
        IO io = new IO();
        io.run();
    }}