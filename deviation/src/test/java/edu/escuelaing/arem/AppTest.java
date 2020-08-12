package edu.escuelaing.arem;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest{
    App app;
    
    @Before
    public void setUp(){
        app =new App();
    }
    
    /**
     * Deberia recorrer la lista solo con next hasta que encuentre el final de la lista o null
     */
    @Test
    public void LinkefListNextTest(){
        double[] args = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        double[] test1 = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        LinkedList List = new LinkedList();
        for (double i:args){
            List.addNode(i);          
        }
        boolean test = true;
        int pos=0;
        while (List.getActual().next!=null){
            test=(test==(List.getActual().data==test1[pos]));
            List.getNext();
            pos+=1;
        }
        Assert.assertTrue(test);
    }
    
    /**
     *Deberia recorrer la lista solo con Previus hasta que encuentre null o este en el primer elemento
     */
    @Test
    public void LinkefLisPreviusTest(){
        double[] args = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        double[] test1 = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        LinkedList List = new LinkedList();
        for (double i:args){
            List.addNode(i);
        }
        boolean test = true;
        int pos=test1.length-1;
        while (List.getActual().previus!=null){
            test=(test==(List.getActual().data==test1[pos]));
            System.out.println(test);
            List.getPrevius();
            pos=-1;
        }
        Assert.assertTrue(test);
    }
    
    /**
     *Deberia calcular mean correctamente con un delta de 1
     */
    @Test
    public void mean1Test(){
        double[] args = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        LinkedList List = new LinkedList();
        for (double i:args){
            List.addNode(i);
        }
        Assert.assertEquals(app.mean(List), 550.6, 1);
    }
    
    /**
     *Deberia calcular mean correctamente con un delta de 1
     */
    @Test
    public void mean2Test(){
        double[] args = {15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2};
        LinkedList List = new LinkedList();
        for (double i:args){
            List.addNode(i);
        }
        Assert.assertEquals(app.mean(List), 60.32, 1);
    }
    
    /**
     *Deberia calcular deviation correctamente con un delta de 1
     */
    @Test
    public void deviation1Test(){
        double[] args = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        LinkedList List = new LinkedList();
        for (double i:args){
            List.addNode(i);
        }
        Assert.assertEquals(app.deviation(List), 572.03, 1);
    }
    
    /**
     *Deberia calcular deviation correctamente con un delta de 1
     */
    @Test
    public void deviation2Test(){
        double[] args = {15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2};
        LinkedList List = new LinkedList();
        for (double i:args){
            List.addNode(i);
        }
        Assert.assertEquals(app.deviation(List), 62.26, 1);
    }
    
    
    
    
}
