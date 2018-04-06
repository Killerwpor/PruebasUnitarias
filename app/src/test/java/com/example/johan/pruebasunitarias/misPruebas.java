package com.example.johan.pruebasunitarias;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.Assert.assertEquals;

/**
 * Created by johan on 5/04/2018.
 */

public class misPruebas {
    Pojo nuevoPojo=new Pojo(); //Instancia de clase a probar




    @Test
    public void pruebaMultiplicacion() throws  Exception{

   assertEquals(0,nuevoPojo.multiplicacion(2,0));
   assertEquals(-20,nuevoPojo.multiplicacion(-10,2));
    }


    @Test(timeout = 5000) //si se demora más de 5000 ms (5s) falla la prueba
    public void pruebaCicloLargo() throws  Exception{
       assertEquals(0,nuevoPojo.cicloLargo());

    }
    @Ignore
    @Test (expected = IndexOutOfBoundsException.class) //si no saca esa excepcion falla la prueba
    public void pruebaObternerIndiceArray() throws  Exception{
      nuevoPojo.obtenerIndiceArray(4);





    }


}
