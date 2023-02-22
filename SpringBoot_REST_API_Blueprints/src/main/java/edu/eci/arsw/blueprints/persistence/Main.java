/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.arsw.blueprints.persistence;
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author JULIAN
 */
public class Main {
     public static void main(String a[]) throws BlueprintNotFoundException, BlueprintPersistenceException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices bps = ac.getBean(BlueprintsServices.class);
        Point[] pts0=new Point[]{new Point(13, 41),new Point(12, 40), new Point(12, 41), new Point(12, 41)};
        Blueprint bp=new Blueprint("jul", "stadium",pts0);
//        Point[] pts1=new Point[]{new Point(46, 46),new Point(16, 16)};
//        Blueprint bp1=new Blueprint("mack", "mypaints",pts1);
        bps.addNewBlueprint(bp);

        for(Blueprint blueprint: bps.getAllBlueprints()){
            blueprint.getAuthor();
            blueprint.getName();
        }
    }
}
