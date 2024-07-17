package br.com.tbiazin.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.tbiazin.dao.CarroDao;

@SpringBootTest
@ActiveProfiles("test")
public class CarroTest {

    @Autowired
    private CarroDao carroDao;

    @Test
    public void cadastrar() {
        Carro carro = new Carro();
        carro.setCodigo("A20");
        carro.setNome("Fiesta");
        carro.setModelo("Sedan");
        carro.setAno(2020L);
        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
