package br.com.pauladev.dio.bootcamp.gtf.qa.poobootcamp.domain;

import java.util.Set;
import java.util.LinkedHashSet;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> concludedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getConcludedContents() {
        return concludedContents;
    }

    public void setConcludedContents(Set<Content> concludedContents) {
        this.concludedContents = concludedContents;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

}
