package doubt;

import java.util.Scanner;

public class Ganesh_EB_bill {
	public void billForElectricity()
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("please enter the usage of the current in units");
        float current =ip.nextFloat();
        ip.close();
        if(current<=100)
        {
            System.out.println("your used less than 100 units\n so it's free");
        }
        else if(current<=200)
        {
            float duty = current/10;
            current =current-100;
            float charge = current * 1.5f;
            float total = charge+duty+20;//fixed cahrges 20rs
            System.out.println("the energy charges :"+charge+"\n"
             + "duty               :"+duty+"\n"+"fixed charges      :20\n"
             +"total              :"+total);
        }
        else if(current<=500) 
        {
            float duty = current/10;
            current = current-200;//for 0-100=free,101-200=2rs per unit,above200 3rs per unit
            float charge = current*3+200;
            float total =charge+duty+30;//fixed charge 30rs
            System.out.println("the energy charges :"+charge+"\n"
                     + "duty               :"+duty+"\n"+"fixed charges      :30\n"
                     +"total              :"+total);    
        }
        else if(current>500) 
        {
            float duty =current/10;
            current = current-500;
            float charge =current*6.6f+350+1380;
            float total =charge+duty+50;
            float roundOff=Math.round(total*100)/100;
            System.out.println("the energy charges :"+charge+"\n"
                     + "duty               :"+duty+"\n"+"fixed charges      :50\n"
                     +"total              :"+roundOff);
        }
}
}