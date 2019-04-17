package com.mola.conditional;

import org.springframework.stereotype.Service;

public class LinuxCommand implements ListCommandService {
    @Override
    public void showListCommand() {
        System.out.println("ls");
    }
}
