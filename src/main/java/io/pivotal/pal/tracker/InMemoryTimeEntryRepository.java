package io.pivotal.pal.tracker;

import io.pivotal.pal.tracker.TimeEntry;

import java.util.*;

public class InMemoryTimeEntryRepository  implements TimeEntryRepository {

    Map<Long, TimeEntry> mapTimeEntry;
    public TimeEntry create(TimeEntry timeEntry) {
        if(mapTimeEntry == null) {
            mapTimeEntry = new HashMap<Long, TimeEntry>();
        }
        if(timeEntry.getId() == 0) {
            timeEntry.setId(mapTimeEntry.size() + 1L);
        }
        mapTimeEntry.put(timeEntry.getId(), timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long id) {
        return mapTimeEntry.get(id);
    }
//
//    public boolean list() {
//        return true;
//    }

    public List list() {
        if(mapTimeEntry == null || mapTimeEntry.isEmpty()) return new ArrayList<>();
        List<TimeEntry> list = new ArrayList<TimeEntry>();
        for(TimeEntry entry: mapTimeEntry.values()) {
             list.add(entry);
        }
        return list;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        timeEntry.setId(id);
        mapTimeEntry.replace(id, timeEntry);
        return timeEntry;
    }

    public void delete(long id) {
        mapTimeEntry.remove(id);
    }
}
