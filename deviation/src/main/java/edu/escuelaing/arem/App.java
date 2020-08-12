package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        LinkedList List = new LinkedList();
        for (String i:args){
            List.addNode(Double.parseDouble(i));
        }        
        System.out.print("Mean: "+mean(List)+"\n"+"Standar deviation: "+ deviation(List));
    }
    
    public static double mean(LinkedList List){
        double sum=0;
        List.toFirst();
        while(List.actual!=null){
            sum+=List.actual.data;
            List.getNext();
        }
        List.toFirst();
        return (sum/List.length);
    }
    
    public static double deviation(LinkedList List){
        double sum=0;
        double mean = mean(List);
        while(List.actual!=null){
            sum+=(Math.pow(List.actual.data-mean,2));
            List.getNext();
        }
        List.toFirst();
        return Math.sqrt(sum/(List.length-1));
    }
    
}
