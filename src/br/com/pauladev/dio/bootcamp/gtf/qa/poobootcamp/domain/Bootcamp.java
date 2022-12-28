package br.com.pauladev.dio.bootcamp.gtf.qa.poobootcamp.domain;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class Bootcamp {
    private String name;
    private String description;

    private Set<Dev> inscribedDevs = new LinkedHashSet<>();
    private Set<Content> contents = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Dev> getInscribedDevs() {
        return inscribedDevs;
    }

    public void setInscribedDevs(Set<Dev> inscribedDevs) {
        this.inscribedDevs = inscribedDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((inscribedDevs == null) ? 0 : inscribedDevs.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (inscribedDevs == null) {
            if (other.inscribedDevs != null)
                return false;
        } else if (!inscribedDevs.equals(other.inscribedDevs))
            return false;
        if (contents == null) {
            if (other.contents != null)
                return false;
        } else if (!contents.equals(other.contents))
            return false;
        return true;
    }

}
