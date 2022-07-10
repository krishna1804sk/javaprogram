package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManInDelhi cmd = new CommonManInDelhi();
		cmd.dontGoByDieselVehicle();
		cmd.goByBicycle();
		cmd.goByDieselVehicle();
	}

	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("dontGoByDieselVehicle");
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("goByBicycle");
	}

	
		
	
	@Override
	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("goByDieselVehicle");
	}

}
