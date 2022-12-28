package br.com.pauladev.dio.bootcamp.gtf.qa.poobootcamp.domain;

public abstract class Content {
    private String title;
    private String description;

    protected static final double XP_DEFAULT = 10d;

    public abstract double computeXP();

    public Content(String title, String description) {
        this.setTitle(title);
        this.setDescription(description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
