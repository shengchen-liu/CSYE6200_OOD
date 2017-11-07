package edu.neu.csye6200.esper6_1_0;

import java.util.Random;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;

/**
 * ExampleMain Exper 5-minute demo
 * 
 * @author danielgmp
 *         https://coffeeonesugar.wordpress.com/2009/07/21/getting-started-with-esper-in-5-minutes/
 *
 */
public class ExampleMain {
	private static Random generator = new Random();
	public static void GenerateRandomTick(EPRuntime cepRT) {
//	private Random generator = new Random();
//	public void GenerateRandomTick(EPRuntime cepRT) {
		double price = (double) generator.nextInt(10);
		long timeStamp = System.currentTimeMillis();
		String symbol = "AAPL";
		Tick tick = new Tick(symbol, price, timeStamp);
		
		System.out.println("Sending tick:" + tick);
		cepRT.sendEvent(tick);
	}

	public static void demo(String[] args) {
		System.out.println("\t" + ExampleMain.class.getName() + ".demo() starting...\n");
		
		ExampleMain obj = new ExampleMain();
		
		// Configure logging
		ConsoleAppender appender = new ConsoleAppender(new SimpleLayout()); 
		Logger.getRootLogger().addAppender(appender); 
		Logger.getRootLogger().setLevel((Level) Level.WARN);
		
		// The Configuration is meant only as an initialization-time object.
		Configuration cepConfig = new Configuration();
		
		// We register Ticks as objects the engine will have to handle
		cepConfig.addEventType("StockTick", Tick.class.getName());

		// We setup the engine
		EPServiceProvider cep = EPServiceProviderManager.getProvider("myCEPEngine", cepConfig);

		EPRuntime cepRT = cep.getEPRuntime();
		
		// We register an EPL statement (rule)
		EPAdministrator cepAdm = cep.getEPAdministrator();
		EPStatement cepStatement = cepAdm.createEPL("select * from " +
		                                "StockTick(symbol='AAPL').win:length(2) " +
		                                "having avg(price) > 6.0");
		
		// listener for events
		cepStatement.addListener(new CEPListener());
		
		for (int i = 0; i < 20; i++) {
//			obj.GenerateRandomTick(cepRT);
			GenerateRandomTick(cepRT);
		}
		
		System.out.println(ExampleMain.class.getName() + ".demo() done!\n");
	}

}
