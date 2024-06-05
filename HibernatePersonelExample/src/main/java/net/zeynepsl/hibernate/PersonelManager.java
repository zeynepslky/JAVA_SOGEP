package net.zeynepslky.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;

public class PersonelManager {

	protected SessionFactory sessionFactory;
	
	
	protected void read() {}
	protected void update() {}
	protected void delete() 
	{
		
		Personel personelNesne=new Personel();
		personelNesne.setId(6);
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.delete(personelNesne);
		session.getTransaction().commit();
		session.close();
	}
	protected void setup() {
		
	final StandardServiceRegistry registry=
		new StandardServiceRegistryBuilder()
		.configure().build();
	try {
	sessionFactory=new MetadataSources(registry)
			.buildMetadata().buildSessionFactory();
	}
	catch(Exception e)
	{StandardServiceRegistryBuilder.destroy(registry);}
	
	}
	
	protected void create(String name) {
		Personel personelObj=new Personel();
		personelObj.setAdsoyad(name);
		personelObj.setDogumtarihi("23.11.1990");
		personelObj.setGorev("Memur");
		personelObj.setMedenidurum((byte)1);
		personelObj.setSeyahatengel((byte)0);
		personelObj.setSicilno((short)12345);
		personelObj.setTc("246");
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(personelObj);
		session.getTransaction().commit();
		session.close();
	}
	protected void exit() 
	{
		//sessionFactory.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonelManager manager=new PersonelManager();
		manager.setup();
		manager.delete();
		manager.exit();
	}

}
