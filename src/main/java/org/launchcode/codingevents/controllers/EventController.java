package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/events")
public class EventController {
    private static List<Event> events = new ArrayList<>();

    public void defaultEvents(){
        // not sure where to put these
        events.add(new Event("Menteaship","A fun meetup for connecting with mentors"));
        events.add(new Event("Code With Pride","A fun meetup sponsored by LaunchCode"));
        events.add(new Event("Javascripty", "An imaginary meetup for Javascript developers"));
        return;
    }

    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, String eventDesc) {
        events.add(new Event(eventName, eventDesc));
        return "redirect:/events";
    }
}
