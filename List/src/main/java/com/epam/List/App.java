package com.epam.List;

/**
 * Hello world!
 *
 */
import org.apache.logging.log4j.*;
public class App 
{
	private static final Logger logg = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Integer[] array= {23,45};
    	CustomList<Integer> list = new CustomList<Integer>(array);
    	list.add(23);
    	logg.debug(list);
    	
    }
}