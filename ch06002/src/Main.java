import com.example.abst.SalesCalc;
import com.example.conc.*;

public class Main {
    public static void main(String[] args) {

        /*
        CrushedRock rock1= new CrushedRock("CR 001",12,10,50);
        SalesCalc rock2= new CrushedRock("CR 002",15,12,60);

        System.out.println("Sales Price "+rock1.calcSalesPrice());
        System.out.println("Sales Price "+rock2.calcSalesPrice());*/

        SalesCalc[] itemList= new SalesCalc[6];
        itemList[0]= new CrushedRock("CR 001",12,10,50);
        itemList[1]= new CrushedRock("CR 002",15,12,60);
        itemList[2]= new RedPaint("RP 001",10,15,30);
        itemList[3]= new Widget("WG 001",14,25,40);
        itemList[4]= new Widget("WG 002",5,60,12);
        itemList[5]= new WidgetPro("WP 001",50,25,35,"Type1");


        ItemReport itemReport= new ItemReport();
        System.out.println("---Sales Report");
        for (SalesCalc item:itemList) {
            itemReport.printItemData(item);
        }

        ConcTotalCostBenefit concTotalCostBenefit= new ConcTotalCostBenefit();

        concTotalCostBenefit.TotalReport(itemList);
    }
}