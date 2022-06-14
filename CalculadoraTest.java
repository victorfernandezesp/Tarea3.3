package eedCalculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

  @Test
  void testSumar() {
    assertEquals(7, Calculadora.sumar(5, 2));
    assertEquals(3, Calculadora.sumar(1, 2));
    assertEquals(10, Calculadora.sumar(8, 2));
    assertEquals(100, Calculadora.sumar(98, 2));

  }

  @Test
  void testRestar() {
    assertEquals(3, Calculadora.restar(5, 2));
    assertEquals(-3, Calculadora.restar(-1, 2));
    assertEquals(-10, Calculadora.restar(-8, 2));
    assertEquals(96, Calculadora.restar(98, 2));

  }

  @Test
  void testMultiplicar() {
    assertEquals(10, Calculadora.multiplicar(5, 2));
    assertEquals(-2, Calculadora.multiplicar(1, -2));
    assertEquals(16, Calculadora.multiplicar(8, 2));
    assertEquals(-100, Calculadora.multiplicar(-10, 10));

  }

  @Test
  void testDividir() {
    assertEquals(-3, Calculadora.dividir(-6, 2));
    assertEquals(0.5, Calculadora.dividir(1, 2));
    assertEquals(4, Calculadora.dividir(8, 2));
    assertEquals(49, Calculadora.dividir(98, 2));

  }

}
