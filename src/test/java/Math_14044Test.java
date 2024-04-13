import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Math_14044Test {

    @Test
    public void testAdicionar1() {
        int resultado = Math_14044.adicionar(2, 3);
        assertEquals(5, resultado);
        imprimirResultado("Resultado adicionar1: ", resultado);
    }

    @Test
    public void testAdicionar2() {
        int resultado = Math_14044.adicionar(-3, 2);
        assertEquals(-1, resultado);
        imprimirResultado("Resultado adicionar2: ", resultado);
    }

    @Test
    public void testAdicionar3() {
        int resultado = Math_14044.adicionar(-2, -3);
        assertEquals(-5, resultado);
        imprimirResultado("Resultado adicionar3: ", resultado);
    }

    @Test
    public void testAdicionar4() {
        int resultado = Math_14044.adicionar(0, 3);
        assertEquals(3, resultado);
        imprimirResultado("Resultado adicionar4: ", resultado);
    }

    @Test
    public void testAdicionar5() {
        int resultado = Math_14044.adicionar(0, -3);
        assertEquals(-3, resultado);
        imprimirResultado("Resultado adicionar5: ", resultado);
    }

    @Test
    public void testSubtrair1() {
        int resultado = Math_14044.subtrair(3, 2);
        assertEquals(1, resultado);
        imprimirResultado("Resultado subtrair1: ", resultado);
    }

    @Test
    public void testSubtrair2() {
        int resultado = Math_14044.subtrair(-3, 2);
        assertEquals(-5, resultado);
        imprimirResultado("Resultado subtrair2: ", resultado);
    }

    @Test
    public void testSubtrair3() {
        int resultado = Math_14044.subtrair(-2, -3);
        assertEquals(1, resultado);
        imprimirResultado("Resultado subtrair3: ", resultado);
    }

    @Test
    public void testSubtrair4() {
        int resultado = Math_14044.subtrair(0, 3);
        assertEquals(-3, resultado);
        imprimirResultado("Resultado subtrair4: ", resultado);
    }

    @Test
    public void testSubtrair5() {
        int resultado = Math_14044.subtrair(0, -3);
        assertEquals(3, resultado);
        imprimirResultado("Resultado subtrair5: ", resultado);
    }


    @Test
    public void testMultiplicar1() {
        int resultado = Math_14044.multiplicar(2, 3);
        assertEquals(6, resultado);
        imprimirResultado("Resultado multiplicar1: ", resultado);
    }

    @Test
    public void testMultiplicar2() {
        int resultado = Math_14044.multiplicar(-2, 3);
        assertEquals(-6, resultado);
        imprimirResultado("Resultado multiplicar2: ", resultado);
    }

    @Test
    public void testMultiplicar3() {
        int resultado = Math_14044.multiplicar(-2, -3);
        assertEquals(6, resultado);
        imprimirResultado("Resultado multiplicar3: ", resultado);
    }

    @Test
    public void testMultiplicar4() {
        int resultado = Math_14044.multiplicar(0, 3);
        assertEquals(0, resultado);
        imprimirResultado("Resultado multiplicar4: ", resultado);
    }

    @Test
    public void testMultiplicar5() {
        int resultado = Math_14044.multiplicar(0, -3);
        assertEquals(0, resultado);
        imprimirResultado("Resultado multiplicar5: ", resultado);
    }


    @Test
    public void testDividir1() {
        int resultado = Math_14044.dividir(6, 3);
        assertEquals(2, resultado);
        imprimirResultado("Resultado dividir1: ", resultado);
    }

    @Test
    public void testDividir2() {
        int resultado = Math_14044.dividir(6, -3);
        assertEquals(-2, resultado);
        imprimirResultado("Resultado dividir2: ", resultado);
    }

    @Test
    public void testDividir3() {
        int resultado = Math_14044.dividir(-6, -3);
        assertEquals(2, resultado);
        imprimirResultado("Resultado dividir3: ", resultado);
    }

    @Test
    public void testDividir4() {
        int resultado = Math_14044.dividir(0, 3);
        assertEquals(0, resultado);
        imprimirResultado("Resultado dividir4: ", resultado);
    }

    @Test
    public void testDividir5() {
        int resultado = Math_14044.dividir(0, -3);
        assertEquals(0, resultado);
        imprimirResultado("Resultado dividir5: ", resultado);
    }

    @Test
    public void testNegativoDiv() {
        int resultado = Math_14044.dividir(1, 0);
        assertEquals(0, resultado);

        imprimirResultado("Não é possível dividir por zero", resultado);
    }

    @Test
    public void testNegativoDiv2() {
        int resultado = Math_14044.dividir(Integer.parseInt("a"), 0);
        imprimirResultado("Não é possível dividir por zero", resultado);
    }

    @Test
    public void testNegativoAdd() {
        int resultado = Math_14044.adicionar(Integer.parseInt("a"), 1);
        imprimirResultado("Teste Negativo Adição", resultado);
    }

    @Test
    public void testNegativoMulti() {
        int resultado = Math_14044.multiplicar(Integer.parseInt("a"), 2);
        imprimirResultado("Teste Negativo Multiplicação", resultado);
    }

    @Test
    public void testNegativoSub() {
        int resultado = Math_14044.subtrair(Integer.parseInt("a"), 1);
        imprimirResultado("Teste Negativo Subtrair", resultado);
    }


    private void imprimirResultado(String mensagem, int resultado) {
        System.out.println(mensagem + ": " + resultado);
    }

}
