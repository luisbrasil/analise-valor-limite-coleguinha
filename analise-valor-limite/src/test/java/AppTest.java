import static org.junit.Assert.assertEquals;
import org.junit.Test;

import paranavai.ifpr.edu.br.SimuladorCashBack;

public class AppTest {

    @Test
    public void TestCashbackLimiteInferiorAte100Bronze() {
        Double resultado = SimuladorCashBack.calculaCashBack(99.99, "Bronze");
        Double esperado = 4.99;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteInferiorAte100Prata() {
        Double resultado = SimuladorCashBack.calculaCashBack(99.99, "Prata");
        Double esperado = 9.99;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteInferiorAte100Ouro() {
        Double resultado = SimuladorCashBack.calculaCashBack(99.99, "Ouro");
        Double esperado = 14.99;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteAte100Bronze() {
        Double resultado = SimuladorCashBack.calculaCashBack(100, "Bronze");
        Double esperado = 5.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteAte100Prata() {
        Double resultado = SimuladorCashBack.calculaCashBack(100, "Prata");
        Double esperado = 10.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteAte100Ouro() {
        Double resultado = SimuladorCashBack.calculaCashBack(100, "Ouro");
        Double esperado = 15.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorAte100Bronze() {
        Double resultado = SimuladorCashBack.calculaCashBack(100.01, "Bronze");
        Double esperado = 10.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorAte100Prata() {
        Double resultado = SimuladorCashBack.calculaCashBack(100.01, "Prata");
        Double esperado = 15.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorAte100Ouro() {
        Double resultado = SimuladorCashBack.calculaCashBack(100.01, "Ouro");
        Double esperado = 20.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorDeBaixoDe100a500Bronze() {
        Double resultado = SimuladorCashBack.calculaCashBack(100.02, "Bronze");
        Double esperado = 10.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorDeBaixoDe100a500Prata() {
        Double resultado = SimuladorCashBack.calculaCashBack(100.02, "Prata");
        Double esperado = 15.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorDeBaixoDe100a500Ouro() {
        Double resultado = SimuladorCashBack.calculaCashBack(100.02, "Ouro");
        Double esperado = 20.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteInferiorDeCimaDe100a500Bronze() {
        Double resultado = SimuladorCashBack.calculaCashBack(499.99, "Bronze");
        Double esperado = 49.99;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteInferiorDeCimaDe100a500Prata() {
        Double resultado = SimuladorCashBack.calculaCashBack(499.99, "Prata");
        Double esperado = 74.99;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteInferiorDeCimaDe100a500Ouro() {
        Double resultado = SimuladorCashBack.calculaCashBack(499.99, "Ouro");
        Double esperado = 99.99;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteDeCimaDe100a500Bronze() {
        Double resultado = SimuladorCashBack.calculaCashBack(500, "Bronze");
        Double esperado = 50.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteDeCimaDe100a500Prata() {
        Double resultado = SimuladorCashBack.calculaCashBack(500, "Prata");
        Double esperado = 75.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteDeCimaDe100a500Ouro() {
        Double resultado = SimuladorCashBack.calculaCashBack(500, "Ouro");
        Double esperado = 100.0;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorAcimaDe500Bronze() {
        Double resultado = SimuladorCashBack.calculaCashBack(500.1, "Bronze");
        Double esperado = 75.01;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorAcimaDe500Prata() {
        Double resultado = SimuladorCashBack.calculaCashBack(500.1, "Prata");
        Double esperado = 100.02;
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void TestCashbackLimiteSuperiorAcimaDe500Ouro() {
        Double resultado = SimuladorCashBack.calculaCashBack(500.1, "Ouro");
        Double esperado = 125.02;
        assertEquals(esperado, resultado, 0.01);
    }
}