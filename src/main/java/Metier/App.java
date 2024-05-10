package Metier;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.sql.Date;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       /* 
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.xml");
        
        SessionFactory factory =cfg.buildSessionFactory();
        */
        
       /* SessionFactory factory= new Configuration().configure("hibernate.xml").buildSessionFactory();
        System.out.println(factory);
        */
        
       SessionFactory factory = HibernateUtil.getSessionFactory();
       Session session = factory.openSession();
       //Transaction tx = session.beginTransaction();
       // Save-Create
       /*
       Utilisateur ut = new Utilisateur();
       // ut.setId_utilisateur(1); AutoIncrement
       ut.setName("togashi");
       ut.setName_siege("Column_A");
       ut.setEmail("tog@gamil.com");
       
       
       Utilisateur ut2 = new Utilisateur();
       ut2.setId_utilisateur(1);
       ut2.setName("togashi");
       ut2.setName_siege("Column_A");
       ut2.setEmail("tog@gamil.com");
       
       
       Siege sg = new Siege();
       sg.setNumero_siege(1);
       sg.setEtat_siege("vide");
       sg.setId_vol("2");
       sg.setName("togashi");
       
       
       
       Airport air = new Airport();
       air.setId_Airport(1);
       air.setName("Togachi");
       air.setPays("maroc");
       air.setVille_depart("casa");
       air.setVille_arrivee("maastricht");
       
       Airport air2 = new Airport();
       air2.setId_Airport(1);
       air2.setName("Togachi");
       air2.setPays("maroc");
       air2.setVille_depart("casa");
       air2.setVille_arrivee("maastricht");
       
       
       Vol vl = new Vol();
       vl.setCompagnie("Virgin");
       vl.setPrix(123);
      // vl.setDate_depart(2/2/2);
       //vl.setDate_arrivee(2/2/2);
      
       Passager ps = new Passager();
       ps.setName("Togashi");
       ps.setId_passager(1);
       
       
       
       Reservation rs = new Reservation();
       rs.setId_reservation(1);
       rs.setId_utilisateur(1);
       rs.setDetail_Pasager("enfant");
       rs.setId_vol(1);       
       
       
       
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       
       session.save(ut);
       session.save(ut2);
       session.save(sg);
       session.save(air);
       session.save(air2);
       session.save(vl);
       session.save(ps);
       session.save(rs);
       tx.commit();
       System.out.println("Data Register Successfully");
      */
       
       
       //Read Data
       /*
       List<Utilisateur> List = session.createQuery("from Utilisateur",Utilisateur.class).list();
       
       List.forEach(e -> System.out.println(e));
       */
       
       
       //GetById
       
       
       Utilisateur ut =session.load(Utilisateur.class,1);
       System.out.println("utilisateur");
      
            
       // Update
       /*
       
       Utilisateur ut =session.get(Utilisateur.class,1);
    // ut.setId_utilisateur(1); AutoIncrement
       ut.setName("togashi update");
       ut.setName_siege("Column_A update");
       ut.setEmail("tog@gamil.com update");       
       
       Transaction tx = session.beginTransaction();
       session.saveOrUpdate(ut);
       
       
       
       tx.commit();
       System.out.println("Data Update);
       */
       
       //  Delete
       
       /*
       
       Utilisateur ut =session.get(Utilisateur.class,1);
       Transaction tx = session.beginTransaction();

       session.delete(ut);
       
       tx.commit();
       System.out.println("Data Delete");
	*/
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
     session.close();
     factory.close();
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}
