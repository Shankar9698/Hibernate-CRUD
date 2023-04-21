package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       SessionFactory sessionFactory =HibernateUtils.getSessionFactory();
      Session session= sessionFactory.openSession();

      //Student save-Create
     /* Student student=new Student();
      student.setId(1);
      student.setFName("shankar");
      student.setLName("kamalapur");
      student.setEmail("shankarkamalapur6@gmail.com");
      student.setSchoolName("skts");
      student.setAddress("zaheerabad");

        Student student1=new Student();
        student1.setFName("jaya");
        student1.setLName("krishna");
        student1.setEmail("jayakrishnagone1@gmail.com");
        student1.setSchoolName("khs");
        student1.setAddress("kodada");

        Student student2=new Student();
        student2.setFName("raja");
        student2.setLName("shekar");
        student2.setEmail("rajashekar@gmail.com");
        student2.setSchoolName("kps");
        student2.setAddress("kodhada");
       Transaction transaction = session.beginTransaction();
       session.save(student);
       session.save(student1);
       session.save(student2);
       transaction.commit();

        System.out.println("Student Registered Successfully...");
*/
        //student view -Read
        /*List<Student> students =session.createQuery("from Student", Student.class).list();
        students.stream().forEach(System.out::println);*/

        //get by id
       /*Student student= session.get(Student.class,1);
        System.out.println(student);
*/
        //update by id
       /* Student st=session.get(Student.class,1);
        st.setId(1);
        st.setFName("shankar-u");
        st.setLName("kamalapur");
        st.setEmail("shankarkamalapur6@gmail.com");
        st.setSchoolName("skts");
        st.setAddress("zaheerabad");
       Transaction transaction= session.beginTransaction();
       session.save(st);
       transaction.commit();
        System.out.println("updated succesfully...");
     */

        //delete by id
        Student student=session.get(Student.class,5);
        Transaction transaction=session.beginTransaction();
        session.delete(student);
        transaction.commit();
        System.out.println("Data deleted successfully...");


        session.close();
      sessionFactory.close();
    }
}
