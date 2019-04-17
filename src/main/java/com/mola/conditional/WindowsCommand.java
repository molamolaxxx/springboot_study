package com.mola.conditional;

import org.springframework.stereotype.Service;

public class WindowsCommand implements ListCommandService{
    @Override
    public void showListCommand() {
        System.out.println("dir");
    }
}
