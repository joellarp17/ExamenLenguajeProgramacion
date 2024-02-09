package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class editar {
	
	public static void main(String[] args) {
		
        SubjectDao dao = new SubjectDaoImpl();

        Subject existingSubject = dao.find(1); 

        if (existingSubject != null) {
            existingSubject.setSubject("Pedro");
            existingSubject.setCredits("LP2");
            
            dao.update(existingSubject);
            
        } else {
            System.out.println("Subject no encontrado.");
        }
        
        List<Subject> subjectList = dao.findAll();	
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
    }

}
