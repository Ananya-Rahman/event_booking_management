/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_management_project;

import java.util.ArrayList;

/**
 *
 * @author jubel
 */
public class EventListMaintain {
    
    public ArrayList<Event> eventList;
    
    public EventListMaintain(){
        eventList = new ArrayList<>();
    }
    
    public void add(Event e){
        eventList.add(e);
    }
    
    public ArrayList<Event> getEventList(){
        return eventList;
    }
}
