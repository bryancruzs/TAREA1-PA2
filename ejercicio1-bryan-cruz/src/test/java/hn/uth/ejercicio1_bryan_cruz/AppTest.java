package hn.uth.ejercicio1_bryan_cruz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

/*
import org.junit.After;
*/
import org.junit.AfterClass;
/*import org.junit.Before;
*/import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static Random rd;
	@BeforeClass
public static void inicializacion() {
	System.out.println("Iniciando Pruebas Unitarias");
}
	
	/*AREA DE UN CIRCULO*/
@Test 
public void AreaCirculo() {
	assertTrue(App.AreaCirculo(5)==78.5);
}
@Test 
public void AreaCirculo2() {
	assertFalse(App.AreaCirculo(6)==114.04);
}
@Test

public void AreaCirculoMayorDecimal() {
	assertEquals(App.AreaCirculo(6),113.1,.10);
}

/*AREA DE UN CUADRADO*/
@Test
public void AreaCuadrado() {
	assertTrue(App.AreaCuadrado(5)==25);
}
@Test
public void AreaCuadradoDecimal() {
	assertEquals(App.AreaCuadrado(27.999),783.9,.10);
}
@Test
public void AreaCuadradoDecimalConMargen() {
	assertFalse(App.AreaCuadrado(5)==26);
}

/*AREA DE UN RECTANGULO*/
@Test
public void AreaRectangulo() {
	assertTrue(App.AreaRectangulo(10,10)==100);
}
@Test
public void AreaRectangulodecimal() {
	assertTrue(App.AreaRectangulo(25,10)==250);
}
@Test
public void AreaRectangulodecimalnMargen() {
	assertEquals(App.AreaRectangulo(8.799,8.799),77.42,.10);
}

/*AREA DE UN TRAINGULO*/
@Test
public void AreaTriangulo() {
	assertEquals(App.AreaTriangulo(8.799,8.799),38.71,.10);
}
@Test
public void AreaTrianguloDecimal() {
	assertTrue(App.AreaTriangulo(10,10)==50);
}
@Test
public void AreaTrianguloDecimalMarjen() {
	assertEquals(App.AreaTriangulo(10.50,10.59),55.5,.10);
}

@AfterClass
public static void finalizacion() {
	System.out.println("Prueba unitario finalizada");
}
}
