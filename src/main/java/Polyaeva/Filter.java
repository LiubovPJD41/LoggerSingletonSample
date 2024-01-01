package Polyaeva;


import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int x:
           source ) {
            if(x < threshold){
                result.add(x);
                logger.log("Element " + x + " fits.");
            }else{
                logger.log("Element " + x + " does not fits");
            }
        } //..
        return result;
    }



}
