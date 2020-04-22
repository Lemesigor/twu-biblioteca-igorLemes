package com.twu.biblioteca;

import com.twu.biblioteca.database.UserRepository;
import com.twu.biblioteca.services.BibliotecaLogin;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginTest {
    BibliotecaLogin bibliotecaLogin;
    UserRepository userRepository;

    @Before
    public void setUp() {
        bibliotecaLogin = new BibliotecaLogin();
        userRepository = new UserRepository();
    }

    @Test
    public void validateLibraryIDRegexTest() {
        String validID = "444-4444";
        assertThat(bibliotecaLogin.validateLibraryIDRegex(validID), is(true));
    }

    @Test
    public void invalidLibraryIDRegexTest() {
        String invalidID = "444444";
        assertThat(bibliotecaLogin.validateLibraryIDRegex(invalidID), is(false));
    }

    @Test
    public void validateLibraryIdTest() {
        User user = bibliotecaLogin.userRepository.bibliotecaUsers.get(0);
        assertThat(bibliotecaLogin.getUserById(user.getLibraryId()), is(equalTo(user)));
    }

    @Test
    public void validateInvalidLibraryIdTest() {
        String invalidID = "444444";
        assertThat(bibliotecaLogin.getUserById(invalidID), is(equalTo(null)));
    }

    @Test
    public void validatePassword() {
        User user = bibliotecaLogin.userRepository.bibliotecaUsers.get(0);
        assertThat(bibliotecaLogin.isPasswordValid(user, user.getPassword()), is(true));
    }

    @Test
    public void invalidPassword() {
        User user = bibliotecaLogin.userRepository.bibliotecaUsers.get(0);
        assertThat(bibliotecaLogin.isPasswordValid(user, "notAValidPassword"), is(false));
    }

    @Test
    public void checkCredentialsTest() {
        User user = bibliotecaLogin.userRepository.bibliotecaUsers.get(0);
        assertThat(bibliotecaLogin.checkCredentials(user.getLibraryId(), user.getPassword()), is(true));
    }

    @Test
    public void checkInvalidCredentialsTest() {
        User user = bibliotecaLogin.userRepository.bibliotecaUsers.get(0);
        assertThat(bibliotecaLogin.checkCredentials("notAValidUser", user.getPassword()), is(false));
    }

    @Test
    public void authenticateValid() {
        User user = bibliotecaLogin.userRepository.bibliotecaUsers.get(0);
        assertThat(bibliotecaLogin.authenticateUser(user.getLibraryId(), user.getPassword()), is(true));
    }
    @Test
    public void authenticateInvalidRegexFormar() {
        User user = bibliotecaLogin.userRepository.bibliotecaUsers.get(0);
        assertThat(bibliotecaLogin.authenticateUser("88888", user.getPassword()), is(false));
    }

    @Test
    public void authenticateInvalidPassword() {
        User user = bibliotecaLogin.userRepository.bibliotecaUsers.get(0);
        assertThat(bibliotecaLogin.authenticateUser(user.getLibraryId(), "invalid"), is(false));
    }
}
