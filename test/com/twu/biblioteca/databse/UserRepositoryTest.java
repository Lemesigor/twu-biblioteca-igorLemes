package com.twu.biblioteca.databse;

import com.twu.biblioteca.User;
import com.twu.biblioteca.database.UserRepository;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserRepositoryTest {
    UserRepository userRepository;

    @Before
    public void setUp(){
        userRepository = new UserRepository();
    }

    @Test
    public void findByBibliotecaIdTest(){
        User user = userRepository.bibliotecaUsers.get(0);

        assertThat(userRepository.findByLibraryId(user.getLibraryId()), is(equalTo(user)));
    }
    @Test
    public void findInvalidBibliotecaId(){
        String invalidId = "111-1111";
        assertThat(userRepository.findByLibraryId(invalidId), is(equalTo(null)));
    }
}
