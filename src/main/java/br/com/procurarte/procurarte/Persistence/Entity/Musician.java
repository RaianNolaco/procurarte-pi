package br.com.procurarte.procurarte.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Musician  {

    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String instagramProfile;
    private Address address;
    private List<Instrument> instruments;
    private List<MusicStyle> musicStyles;
    private Portfolio portfolio;
    
}
