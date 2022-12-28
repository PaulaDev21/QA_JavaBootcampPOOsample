package br.com.pauladev.dio.bootcamp.gtf.qa.poobootcamp.domain;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Optional;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> concludedContents = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public void subscribeToBootcamp(Bootcamp bc) {
        this.getSubscribedContents().addAll(bc.getContents());
        bc.subscribeDev(this);
    }

    public void progress() {
        Optional<Content> firstContent = this.getSubscribedContents().stream().findFirst();

        if (firstContent.isPresent()) {
            this.concludedContents.add(firstContent.get());
            this.subscribedContents.remove(firstContent.get());
        }
    }

    public double computeTotalXp() {
        return concludedContents.stream().mapToDouble(Content::computeXP).sum();
    }

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

    @Override
    public String toString() {
        return this.getName() + "[" + computeTotalXp() + "]";
    }

}
