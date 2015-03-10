package pl.btbw;

import org.hibernate.Session;
import pl.btbw.entity.PostAnnotationEntity;
import pl.btbw.entity.PostXmlEntity;

public class Program {

	public static void main(String[] args0) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		PostXmlEntity userXml = new PostXmlEntity();
		userXml.setName("article.xml");
		userXml.getPostGroup().setType("type1");
		userXml.getPostGroup().setSubtype("subtype1");
		userXml.getPostGroup().setCategory(1);
		session.save(userXml);

		PostAnnotationEntity userAnnotation = new PostAnnotationEntity();
		userAnnotation.setName("article.ano");
		userAnnotation.getPostGroup().setType("type1");
		userAnnotation.getPostGroup().setSubtype("subtype1");
		userAnnotation.getPostGroup().setCategory(1);
		session.save(userAnnotation);

		session.getTransaction().commit();

		session.close();
		HibernateUtil.getSessionFactory().close();
	}

}
