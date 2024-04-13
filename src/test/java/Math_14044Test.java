import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Math_14044Test {

    @Test
    public void testAdicionar1() {
        int resultado = Math_14044.adicionar(2, 3);
        assertEquals(5, resultado);
        System.out.println("Resultado adicionar1: " + resultado);
    }

    @Test
    public void testAdicionar2() {
        int resultado = Math_14044.adicionar(-3, 2);
        assertEquals(-1, resultado);
        System.out.println("Resultado adicionar2: " + resultado);
    }

    @Test
    public void testAdicionar3() {
        int resultado = Math_14044.adicionar(-2, -3);
        assertEquals(-5, resultado);
        System.out.println("Resultado adicionar3: " + resultado);
    }

    @Test
    public void testAdicionar4() {
        int resultado = Math_14044.adicionar(0, 3);
        assertEquals(3, resultado);
        System.out.println("Resultado adicionar4: " + resultado);
    }

    @Test
    public void testAdicionar5() {
        int resultado = Math_14044.adicionar(0, -3);
        assertEquals(-3, resultado);
        System.out.println("Resultado adicionar5: " + resultado);
    }

    @Test
    public void testAdicionarEstouro() {
        // Teste negativo para adicionar
        try {
            Math_14044.adicionar(Integer.MAX_VALUE, 1);
            fail("Deveria lançar uma exceção de estouro");
        } catch (ArithmeticException e) {
            assertEquals("Resultado da adição estourou o limite máximo do inteiro", e.getMessage());
            System.out.println("Teste adicionarEstouro passou com sucesso.");
        }
    }

    @Test
    public void testSubtrair1() {
        int resultado = Math_14044.subtrair(3, 2);
        assertEquals(1, resultado);
        System.out.println("Resultado subtrair1: " + resultado);
    }

    @Test
    public void testSubtrair2() {
        int resultado = Math_14044.subtrair(-3, 2);
        assertEquals(-5, resultado);
        System.out.println("Resultado subtrair2: " + resultado);
    }

    @Test
    public void testSubtrair3() {
        int resultado = Math_14044.subtrair(-2, -3);
        assertEquals(1, resultado);
        System.out.println("Resultado subtrair3: " + resultado);
    }

    @Test
    public void testSubtrair4() {
        int resultado = Math_14044.subtrair(0, 3);
        assertEquals(-3, resultado);
        System.out.println("Resultado subtrair4: " + resultado);
    }

    @Test
    public void testSubtrair5() {
        int resultado = Math_14044.subtrair(0, -3);
        assertEquals(3, resultado);
        System.out.println("Resultado subtrair5: " + resultado);
    }

    @Test
    public void testSubtrairEstouro() {
        // Teste negativo para subtrair
        try {
            Math_14044.subtrair(Integer.MAX_VALUE, Integer.MIN_VALUE);
            fail("Deveria lançar uma exceção de estouro");
        } catch (ArithmeticException e) {
            assertEquals("Resultado da subtração estourou o limite mínimo do inteiro", e.getMessage());
            System.out.println("Teste subtrairEstouro passou com sucesso.");
        }
    }

    @Test
    public void testMultiplicar1() {
        int resultado = Math_14044.multiplicar(2, 3);
        assertEquals(6, resultado);
        System.out.println("Resultado multiplicar1: " + resultado);
    }

    @Test
    public void testMultiplicar2() {
        int resultado = Math_14044.multiplicar(-2, 3);
        assertEquals(-6, resultado);
        System.out.println("Resultado multiplicar2: " + resultado);
    }

    @Test
    public void testMultiplicar3() {
        int resultado = Math_14044.multiplicar(-2, -3);
        assertEquals(6, resultado);
        System.out.println("Resultado multiplicar3: " + resultado);
    }

    @Test
    public void testMultiplicar4() {
        int resultado = Math_14044.multiplicar(0, 3);
        assertEquals(0, resultado);
        System.out.println("Resultado multiplicar4: " + resultado);
    }

    @Test
    public void testMultiplicar5() {
        int resultado = Math_14044.multiplicar(0, -3);
        assertEquals(0, resultado);
        System.out.println("Resultado multiplicar5: " + resultado);
    }

    @Test
    public void testMultiplicarEstouro() {
        // Teste negativo para multiplicar
        try {
            Math_14044.multiplicar(Integer.MAX_VALUE, 2);
            fail("Deveria lançar uma exceção de estouro");
        } catch (ArithmeticException e) {
            assertEquals("Resultado da multiplicação estourou o limite máximo do inteiro", e.getMessage());
            System.out.println("Teste multiplicarEstouro passou com sucesso.");
        }
    }

    @Test
    public void testDividir1() {
        int resultado = Math_14044.dividir(6, 3);
        assertEquals(2, resultado);
        System.out.println("Resultado dividir1: " + resultado);
    }

    @Test
    public void testDividir2() {
        int resultado = Math_14044.dividir(6, -3);
        assertEquals(-2, resultado);
        System.out.println("Resultado dividir2: " + resultado);
    }

    @Test
    public void testDividir3() {
        int resultado = Math_14044.dividir(-6, -3);
        assertEquals(2, resultado);
        System.out.println("Resultado dividir3: " + resultado);
    }

    @Test
    public void testDividir4() {
        int resultado = Math_14044.dividir(0, 3);
        assertEquals(0, resultado);
        System.out.println("Resultado dividir4: " + resultado);
    }

    @Test
    public void testDividir5() {
        int resultado = Math_14044.dividir(0, -3);
        assertEquals(0, resultado);
        System.out.println("Resultado dividir5: " + resultado);
    }

    @Test
    public void testDividirPorZero() {
        // Teste negativo para divisão por zero
        try {
            Math_14044.dividir(1, 0);
            fail("Deveria lançar uma exceção de divisão por zero");
        } catch (IllegalArgumentException e) {
            assertEquals("Não é possível dividir por zero", e.getMessage());
            System.out.println("Teste dividirPorZero passou com sucesso.");
        }
    }
}
