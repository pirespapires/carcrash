package org.academia.bootcamp.campelo.basic_oop.code_challenge.player;

import org.academia.bootcamp.campelo.basic_oop.code_challenge.enterprise.Enterprise;

/**
 * Created by campelo on 01/02/16.
 */
public class Player {
    private String name;
    private String alias;
    private int wanted;
    private String wikiArticle;

    private int pressure;
    private int coolness;

    private Enterprise workingEnterprise;

    public String getWikiArticle() {
        return wikiArticle;
    }

    public void setWikiArticle(String wikiArticle) {
        this.wikiArticle = wikiArticle;
    }

    public void setWorkingEnterprise(Enterprise workingEnterprise) {
        this.workingEnterprise = workingEnterprise;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Player(String name){
        this.name = name;
    }
}
