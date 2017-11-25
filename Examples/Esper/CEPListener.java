package edu.neu.csye6200.esper6_1_0;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class CEPListener implements UpdateListener {

	@Override
	public void update(EventBean[] newData, EventBean[] oldData) {
		   System.out.println("Event received: "
                   + newData[0].getUnderlying());
		   }

}
