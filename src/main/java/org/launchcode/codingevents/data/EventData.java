package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    private static final Map<Integer, Event> events = new HashMap<>();
    static {
        add(new Event("Menteaship","A fun meetup for connecting with mentors"));
        add(new Event("Code With Pride","A fun meetup sponsored by LaunchCode"));
        add(new Event("Javascripty", "An imaginary meetup for Javascript developers"));
    }

    public static Collection<Event> getAll() {
        return events.values();
    }

    public static Event getById(int id) {
        return events.get(id);
    }

    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    public static void remove(int id) {
        events.remove(id);
    }

}
