package data.repo;

import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailRepoTest {

    private User user;
    private EmailRepo emailRepo;
    @BeforeEach
    void setUser(){
        user = new User();
        emailRepo = new EmailRepo();
    }

    @Test
    void testThatUserCanBe(){
        User user1 = new User();
        emailRepo.save(user1);
        assertEquals(1,emailRepo.count());
    }
    @Test
    void testThatUserCanBeFoundByName() {
        emailRepo.save(user);
        user.setName("idris");
        assertEquals("idris", user.getName());
        User gena = emailRepo.findEmailByName("idris");
        assertEquals(user, gena);
    }
    @Test
    void testThatUserCanBeDeleteById(){
        emailRepo.save(user);
        assertEquals(1,emailRepo.count());
        emailRepo.deleteById(1);
        assertEquals(0,emailRepo.count());
    }

    @Test
    void testThatUserCanBeDeleteByName(){
        emailRepo.save(user);
        assertEquals(1,emailRepo.count());
        user.setName("idris");
        emailRepo.deleteByName("idris");
        assertEquals(0,emailRepo.count());
    }

}