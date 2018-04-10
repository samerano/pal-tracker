package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;

public class TimeEntry {
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public TimeEntry(long l1, long l2, LocalDate parse, int i) {
        this.id=0L;
        this.projectId=l1;
        this.userId=l2;
        this.date=parse;
        this.hours=i;
    }

    public TimeEntry(long l, long l1, long l2, LocalDate parse, int i) {
        this.id=l;
        this.projectId=l1;
        this.userId=l2;
        this.date=parse;
        this.hours=i;
    }

    public void printMe(){
        System.out.println("\nthis.id=" + this.id +
        "this.projectId=" + this.projectId +
        "this.userId=" + this.userId +
        "this.date=" + this.date +
        "this.hours=" + this.hours);
    }

    public TimeEntry() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id=id;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
        return getId() == timeEntry.getId() &&
                getProjectId() == timeEntry.getProjectId() &&
                getUserId() == timeEntry.getUserId() &&
                getHours() == timeEntry.getHours() &&
                Objects.equals(getDate(), timeEntry.getDate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getProjectId(), getUserId(), getDate(), getHours());
    }
}
