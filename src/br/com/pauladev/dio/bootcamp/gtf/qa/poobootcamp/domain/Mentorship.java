package br.com.pauladev.dio.bootcamp.gtf.qa.poobootcamp.domain;

import java.time.LocalDate;

public class Mentorship extends Content {
    private static final double MENTORSHIP_XP = 20;

    private LocalDate date;

    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double computeXP() {
        return XP_DEFAULT + MENTORSHIP_XP;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship [title=" + getTitle() + ", description=" + getDescription() + ", date=" + date + "]";
    }

}
