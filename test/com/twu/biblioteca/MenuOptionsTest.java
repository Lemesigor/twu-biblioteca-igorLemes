package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuOptionsTest {

    MenuOptions menu;

    @Before
    public void setUo(){
      menu = new MenuOptions();
    }

    @Test
    public void showMenuTest(){
        String stringTest = "List of books";
        assertThat(menu.listOfBooks.showOptionName(),is(equalTo(stringTest)));
    }
}
