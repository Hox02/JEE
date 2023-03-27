package ma.emsi.test2.repositories;


import ma.emsi.test2.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByRegistrationNumber(String registrationNumber);
    List<Student> findByStillActive(Boolean stillActive);
    List<Student> findByBirthday(Date birthday);
    List<Student> findByFullName(String fullName);
    List<Student> findByLastConnection(Date lastConnection);
    List<Student> deleteByFullName(String ls);
    long deleteByStillActive(Boolean stillActive);
    List<Student> findByFullNameAndStillActiveIsTrue(String fullName);
    List<Student> findByRegistrationNumberLike(String registrationNumber);
    List<Student> findByRegistrationNumberLikeAndFullNameLike(String registrationNumber, String fullName);
    List<Student> findByIdIsLessThan(Integer id);
    List<Student> findByIdIsLessThanEqual(Integer id);
    List<Student> deleteByFullNameAndStillActiveIsTrue(String fullName);
}
