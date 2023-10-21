package guru.springframework.spring6restmvc.BeerController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerControllerTest {

    @Autowired
    BeerController beerController;
    @Test
    void hetBeerById() {
        System.out.println(beerController.getBeerById(UUID.randomUUID()));
    }
}