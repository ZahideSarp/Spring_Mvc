package com.tpe.repository;

import com.tpe.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    void save(Student student);

    List<Student> findAll();

    Optional<Student> findById(Long id);
    //data tipini Student yaparsak eger yoksa nullPointer exception aliriz ama java utildan gelen optional class'i kullaniyoruz
    //sanki Student objesini kapsule ediyor eger geri deger varsa obje olarak bulunan degeri Student'a koyuyor
    //eger bulunamamissa null dondurmek yerine bos bir optional objesi donduruyor
    //buda bizi nullPointer Exception dan kurtariyor.

    void delete(long id);


}
