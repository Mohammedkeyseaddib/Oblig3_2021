package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KinobillettController {

    @Autowired
    KinobillettRepository rep;

       @PostMapping ("/lagre")
       public void lagreBillett(Kinobillett kinobillett) {
           rep.lagre(kinobillett);
       }

       @GetMapping ("/hentAlle")

       public List <Kinobillett> hentAlle() {return rep.hentAlle();}

       @GetMapping ("/slettAlle")

       public void slettAlle() {rep.slettAlle();}


}



