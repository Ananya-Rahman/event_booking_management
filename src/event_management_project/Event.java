
package event_management_project;


    public class Event {
 
    private String eventName;
    private double eventCost;
    private double decorationCost;
    private double foodCost;

    public Event(String eventName, double eventCost, double decorationCost, double foodCost) {
        this.eventName = eventName;
        this.eventCost = eventCost;
        this.decorationCost = decorationCost;
        this.foodCost = foodCost;
    }
    

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getEventCost() {
        return eventCost;
    }

    public void setEventCost(double eventCost) {
        this.eventCost = eventCost;
    }

    public double getDecorationCost() {
        return decorationCost;
    }

    public void setDecorationCost(double decorationCost) {
        this.decorationCost = decorationCost;
    }

    public double getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(double foodCost) {
        this.foodCost = foodCost;
    }
   

    
 
 
 
 
 
}
