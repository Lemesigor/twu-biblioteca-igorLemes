package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.Option;

public class ExitOption implements Option {
    @Override
    public String showOptionName() {
        return "Exit the application";
    }

    @Override
    public void optionAction() {
    }

    @Override
    public boolean continueLoop() {
        return false;
    }
}
