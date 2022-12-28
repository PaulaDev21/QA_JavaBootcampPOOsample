package br.com.pauladev.dio.bootcamp.gtf.qa.poobootcamp.domain;

public class Course extends Content {

    private int workload;

    public Course(String title, String description, int workload) {
        super(title, description);
        this.setWorkload(workload);
    }

    @Override
    public double computeXP() {
        return workload * XP_DEFAULT;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course [title=" + getTitle() + ", description=" + getDescription() + ", workload=" + workload + "]";
    }

}
