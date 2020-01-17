
package event_management_project;


public class ReceptionEvent extends Event{
  
    public ReceptionEvent(String eventName, double eventCost, double decorationCost, double foodCost) {
        super(eventName, eventCost, decorationCost, foodCost);
    }

    public double totalCostManagement(double eventCost) {
        return eventCost;
    }

    
  
    
}
