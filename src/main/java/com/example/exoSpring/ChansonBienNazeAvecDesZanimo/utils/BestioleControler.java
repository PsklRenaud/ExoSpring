package com.example.exoSpring.ChansonBienNazeAvecDesZanimo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.exoSpring.ChansonBienNazeAvecDesZanimo.entities.Bestiole;
import com.example.exoSpring.ChansonBienNazeAvecDesZanimo.repositories.BestioleRepository;

@Component
public class BestioleControler implements CommandLineRunner {
	private Logger LOG = LoggerFactory.getLogger("Roger Rabbit");
	@Autowired
    private BestioleRepository connDao;
	@Override
    public void run(String... args) throws Exception {
       
        LOG.info("******************");
        LOG.info("Houlala tout ca : " + connDao.count());

        // Crée un nouvel utilisateur et l'enregistre dans la BDD
        Bestiole rene = new Bestiole("René the maule", "So cute", 19);
        LOG.info("******************");
        LOG.info(rene + " has been created !");
        connDao.save(rene );
        LOG.info(rene  + " has been saved !");
        LOG.info("******************");
        

        Bestiole frogg = new Bestiole("Crazy Frogg", "Ding ding ding", 77);
        LOG.info("******************");
        LOG.info(frogg+ " has been created !");
        connDao.save(frogg);
        LOG.info(frogg + " has been saved !");
        LOG.info("******************");
        
        Bestiole franklin = new Bestiole("Franklin la tortue", "Je sais lacer mes chaussures nar'dine", 546);
        LOG.info("******************");
        LOG.info(franklin+ " has been created !");
        connDao.save(franklin);
        LOG.info(franklin + " has been saved !");
        LOG.info("******************");
        
        Bestiole chipper = new Bestiole("Chipper de Dora", "So cute", 19);
        LOG.info("******************");
        LOG.info(chipper+ " has been created !");
        connDao.save(chipper);
        LOG.info(chipper + " has been saved !");
        LOG.info("******************");
        
     // UPDATE	
        chipper.setNameSinger("Singe débile");
        LOG.info("********************");
        LOG.info(chipper.getNameSinger() + " is also a gueudin !");
        connDao.save(chipper);
        LOG.info(chipper.getNameSinger() + " has been saved !");
        
//     // READ
//        Bestiole newOne = connDao.findById(franklin ).get();
//        LOG.info("******************");
//        LOG.info("Singer name is " + newOne.getNameSinger());
//        LOG.info("His song from the death is " + newOne.getWorstHit()); 
//        LOG.info("Number of people jumping throw the window" + newOne.getNbPeopleDeafUntil()); 
        
        // DELETE
//        connDao.deleteById(franklin);
//        LOG.info("******************");
//        LOG.info("Singers in list are ");
//        for(Bestiole listBestiole : connDao.findAll()) {
//        LOG.info(listBestiole.toString());
//        }
        
    }    
}
