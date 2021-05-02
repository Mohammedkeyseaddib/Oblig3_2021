package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KinobillettRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagre (Kinobillett kinobillett) {
        String sql= "INSERT INTO Kinobillett (film,antall,fornavn,etternavn,telefon,epost) VALUES(?,?,?,?,?,?)";
        db.update(sql,kinobillett.getInputfilm(),kinobillett.getInputantall(),kinobillett.getInputfornavn(),
                kinobillett.getInputetternavn(),kinobillett.getInputtelefonnummer(),kinobillett.getInputemail());
    }

    public List<Kinobillett> hentAlle() {
        String sql = "SELECT * FROM Kinobillett";
        List<Kinobillett> alleBilletter = db.query(sql,new BeanPropertyRowMapper(Kinobillett.class));
        return alleBilletter;
    }

    public void slettAlle () {
        String sql = "DELETE FROM Kinobillett";
        db.update(sql);
    }
}





